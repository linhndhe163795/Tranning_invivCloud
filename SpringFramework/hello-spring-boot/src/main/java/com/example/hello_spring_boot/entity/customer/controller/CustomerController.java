package com.example.hello_spring_boot.entity.customer.controller;

import com.example.hello_spring_boot.entity.customer.dto.CustomerAccount;
import com.example.hello_spring_boot.entity.customer.dto.CustomerProduct;
import com.example.hello_spring_boot.entity.customer.dto.CustomerResponse;
import com.example.hello_spring_boot.entity.customer.entity.Customer;
import com.example.hello_spring_boot.entity.customer.service.CustomerService;
import com.example.hello_spring_boot.entity.customer.service.CustomerServiceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CustomerController {
    @Autowired
    CustomerService customerService;
    @Autowired
    CustomerServiceImp customerServiceImp;
    @GetMapping("/getAllCustomer")
    public List<CustomerResponse> getAllCustomer() {
        return customerService.getAllCustomers();
    }
    @GetMapping("/findAll")
    public List<Customer> findAllCustomer() {
        return customerService.findAllCustomers();
    }
    @PostMapping("/getCustomerById")
    public CustomerResponse getCustomerById(@RequestParam("id") int id) {
        try{
            return customerServiceImp.getCustomerById(id);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    @PostMapping("/createCustomer")
    public Customer createCustomer(@RequestBody Customer customer) {
        try {
            customerServiceImp.createCustomer(customer);
            return customer;
        }catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    @PostMapping("/updateCustomer")
    public Customer updateCustomer(@RequestBody Customer customer, @RequestParam("id") int id)
    {
        try {
            customerServiceImp.updateCustomer(customer, id);
            return customer;
        }catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    @PostMapping("/deleteCustomer")
    public void deleteCustomer(@RequestParam("id") int id){
        try{
            customerServiceImp.deleteCustomerById(id);
        }catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    @GetMapping("/getCustomerAccount")
        public List<CustomerAccount> getCustomerAccount(){
        try {
            return customerServiceImp.getListCustomerAccount();
        }catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    @GetMapping("/getCustomerProduct")
    public List<CustomerProduct> getCustomerProduct(){
        try {
            return customerServiceImp.getCustomerProduct();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    @PostMapping("/getCustomerStatus")
    public List<CustomerAccount> getCustomerStatus(@RequestParam("status") String status){
        try {
            return customerServiceImp.getCustomerAccountActive(status);
        }catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
