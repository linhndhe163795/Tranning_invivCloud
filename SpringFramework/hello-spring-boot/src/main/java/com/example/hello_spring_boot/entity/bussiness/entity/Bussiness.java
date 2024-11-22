package com.example.hello_spring_boot.entity.bussiness.entity;

import com.example.hello_spring_boot.entity.customer.entity.Customer;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Entity
@Table(name = "BUSSINESS")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Bussiness {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "CUST_ID")
    private int custId;
    @Column(name = "INCORP_DATE")
    private Date incorpDate;
    @Column(name = "NAME")
    private String name;
    @Column(name = "STATE_ID")
    private String stateId;
    @OneToOne
    @JoinColumn(name = "CUST_ID",insertable = false, updatable = false)
    private Customer customer;
}
