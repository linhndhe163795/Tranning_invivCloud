package com.example.hello_spring_boot.entity.individual.entity;

import com.example.hello_spring_boot.entity.customer.entity.Customer;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@Table(name = "INDIVIDUAL")
public class Individual {
    @Id
    @Column(name = "CUST_ID")
    private int id;
    @Column(name = "birth_date")
    private Date birthDate;
    @Column(name = "first_name")
    private String firstName;
    @Column(name = "last_name")
    private String lastName;
    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "CUST_ID",referencedColumnName = "CUST_ID", insertable = false, updatable = false)
    private Customer customer;
}
