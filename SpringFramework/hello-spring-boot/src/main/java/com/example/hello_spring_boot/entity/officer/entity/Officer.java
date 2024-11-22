package com.example.hello_spring_boot.entity.officer.entity;

import com.example.hello_spring_boot.entity.customer.entity.Customer;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Entity
@Table(name = "OFFICER")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Officer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "OFFICER_ID")
    private int officerId;
    @Column(name = "END_DATE")
    private Date endDate;
    @Column(name = "FIRST_NAME")
    private String firstName;
    @Column(name = "LAST_NAME")
    private String lastName;
    @Column(name = "START_DATE")
    private Date startDate;
    @Column(name = "TITLE")
    private String title;
    @Column(name = "CUST_ID")
    private int customerId;
    @ManyToOne
    @JoinColumn(name = "CUST_ID",insertable = false, updatable = false)
    private Customer customer;
}
