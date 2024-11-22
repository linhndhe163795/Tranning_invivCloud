package com.example.hello_spring_boot.entity.customer.service;

import com.example.hello_spring_boot.entity.customer.dto.CustomerResponse;
import com.example.hello_spring_boot.entity.customer.entity.Customer;
import com.example.hello_spring_boot.entity.customer.repository.CustomerRepository;

import com.example.hello_spring_boot.mapStructure.CustomerMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class CustomerService {
    @Autowired
    private CustomerRepository customerRepository;
    @Autowired
    private  CustomerMapper customerMapper;
    public List<CustomerResponse> getAllCustomers() {
        List<Object[]> results = customerRepository.listAllCustomers();
        return results.stream().map(customerMapper::mapToCustomerResponse).collect(Collectors.toList());
    }
    public List<Customer> findAllCustomers() {
        return  customerRepository.findAll();
    }
}
