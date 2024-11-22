package com.example.hello_spring_boot.entity.customer.entity;

import com.example.hello_spring_boot.entity.individual.entity.Individual;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@Table(name = "CUSTOMER")
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "CUST_ID")
    private int customerId;
    @Column(name = "address")
    private String address;
    @Column(name = "city")
    private String city;
    @Column(name = "cust_type_cd")
    private String cusTypeCd;
    @Column(name= "FED_ID")
    private String fedId;
    @Column(name = "postal_code")
    private String postalCode;
    @Column(name = "state")
    private String state;
}
