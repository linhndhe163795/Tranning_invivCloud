package com.example.hello_spring_boot.entity.customer.repository;

import com.example.hello_spring_boot.entity.customer.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Integer> {
    String query =
            "SELECT " +
                    "i.FIRST_NAME, " +
                    "i.LAST_NAME, " +
                    "CONCAT(i.FIRST_NAME ,' ',i.LAST_NAME) AS FULL_NAME, "+
                    "c.ADDRESS, " +
                    "c.CITY, " +
                    "c.CUST_ID, " +
                    "c.POSTAL_CODE, " +
                    "c.FED_ID, "+
                    "c.CUST_TYPE_CD, " +
                    "c.STATE " +
                    "FROM CUSTOMER c " +
                    "LEFT JOIN INDIVIDUAL i " +
                    "ON i.CUST_ID = c.CUST_ID";
    @Query(value = query,nativeQuery = true)
    List<Object []> listAllCustomers();
}
