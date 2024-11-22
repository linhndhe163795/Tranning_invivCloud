package com.example.hello_spring_boot.entity.customer.service;

import com.example.hello_spring_boot.entity.customer.dto.CustomerAccount;
import com.example.hello_spring_boot.entity.customer.dto.CustomerProduct;
import com.example.hello_spring_boot.entity.customer.dto.CustomerRequest;
import com.example.hello_spring_boot.entity.customer.dto.CustomerResponse;
import com.example.hello_spring_boot.entity.customer.entity.Customer;
import com.example.hello_spring_boot.entity.customer.repository.CustomerRepository;
import com.example.hello_spring_boot.mapStructure.CustomerMapper;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CustomerServiceImp {
    @Autowired
    private CustomerRepository customerRepository;
    @PersistenceContext
    EntityManager entityManager;

    public CustomerResponse getCustomerById(int id) {
        StringBuilder sb = new StringBuilder();
        sb.append("SELECT ");
        sb.append("c.CITY, ");
        sb.append("c.ADDRESS, ");
        sb.append("i.FIRST_NAME, ");
        sb.append("i.LAST_NAME, ");
        sb.append("CONCAT(i.FIRST_NAME, ' ', i.LAST_NAME) as FULL_NAME ");

        sb.append("FROM CUSTOMER c ");
        sb.append("JOIN INDIVIDUAL i on c.CUST_ID = i.CUST_ID ");

        sb.append("WHERE c.CUST_ID = :id");

        Query query = entityManager.createNativeQuery(sb.toString(), CustomerResponse.class);
        query.setParameter("id", id);
        CustomerResponse response = (CustomerResponse) query.getSingleResult();
        return response;
    }

    public void createCustomer(Customer customer) {
        customerRepository.save(customer);
    }

    public void updateCustomer(Customer customer, int id) {
        if (customerRepository.existsById(id)) {
            Customer c = getCustomerId(id);
            c.setAddress(customer.getAddress());
            c.setCity(customer.getCity());
            c.setFedId(customer.getFedId());
            c.setState(customer.getState());
            c.setPostalCode(customer.getPostalCode());
            c.setCusTypeCd(customer.getCusTypeCd());
            customerRepository.save(c);
        } else {
            throw new NullPointerException("Customer not found");
        }
    }

    public Customer getCustomerId(int id) {
        Optional<Customer> customer = customerRepository.findById(id);
        return customer.orElse(null);
    }

    public void deleteCustomerById(int id) {
        if (customerRepository.existsById(id)) {
            customerRepository.deleteById(id);
        } else {
            throw new NullPointerException("Customer not found");
        }
    }
    /*Truy vấn mỗi khách hàng (customer) có bao nhiêu tài khoản (account)*/
    public List<CustomerAccount> getListCustomerAccount() {
        StringBuilder sb = new StringBuilder();
        sb.append("SELECT ");
        sb.append("c.CUST_ID, ");
        sb.append("COUNT(a.ACCOUNT_ID) AS COUNT_ACCOUNT ");

        sb.append("FROM CUSTOMER c ");
        sb.append("LEFT JOIN ACCOUNT a ON c.CUST_ID = a.CUST_ID ");
        sb.append("GROUP BY c.CUST_ID ");
        Query query = entityManager.createNativeQuery(sb.toString(), "CustomerCountAccountMapping");
        return query.getResultList();
    }
    public List<CustomerProduct> getCustomerProduct(){
        StringBuilder sb = new StringBuilder();
        sb.append("SELECT ");
        sb.append("CONCAT(i.FIRST_NAME, ' ', i.LAST_NAME) as FULL_NAME, ");
        sb.append("p.NAME AS PRODUCT_NAME ");

        sb.append("FROM CUSTOMER c ");
        sb.append("JOIN INDIVIDUAL i on c.CUST_ID = i.CUST_ID ");
        sb.append("JOIN ACCOUNT a ON c.CUST_ID = a.CUST_ID ");
        sb.append("JOIN PRODUCT p ON p.PRODUCT_CD = a.PRODUCT_CD ");

        sb.append("ORDER BY FULL_NAME ASC");
        Query query = entityManager.createNativeQuery(sb.toString(), CustomerProduct.class);
        return query.getResultList();
    }
    public List<CustomerAccount> getCustomerAccountActive(String status){
        StringBuilder sb = new StringBuilder();
        sb.append("SELECT ");
        sb.append(" c.CUST_ID, ");
        sb.append("i.FIRST_NAME, ");
        sb.append("i.LAST_NAME, ");
        sb.append("SUM(a.AVAIL_BALANCE) AS SUM_AVAIL_BALANCE, ");
        sb.append("SUM(a.PENDING_BALANCE) AS SUM_PENDING_BALANCE ");

        sb.append("FROM INDIVIDUAL i ");
        sb.append("RIGHT JOIN CUSTOMER c ON i.CUST_ID = c.CUST_ID ");
        sb.append("JOIN ACCOUNT a ON c.CUST_ID = a.CUST_ID ");

        sb.append("WHERE a.`STATUS` = :status ");
        sb.append("GROUP BY c.CUST_ID, i.LAST_NAME, i.FIRST_NAME");
        Query query = entityManager.createNativeQuery(sb.toString(), "CustomerAccountActiveMapping");
        query.setParameter("status", status.toUpperCase());
        return query.getResultList();
    }
}
