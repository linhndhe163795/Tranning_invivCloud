package com.example.hello_spring_boot.entity.account.entity;

import com.example.hello_spring_boot.entity.branch.entity.Branch;
import com.example.hello_spring_boot.entity.customer.entity.Customer;
import com.example.hello_spring_boot.entity.product.entity.Product;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Entity
@Table
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Account {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ACCOUNT_ID")
    private int accountId;
    @Column(name = "AVAIL_BLANCE")
    private float availableBalance;
    @Column(name = "CLOSE_DATE")
    private Date closeDate;
    @Column(name = "LAST_ACTIVITY_DATE")
    private Date lastActivityDate;
    @Column(name = "OPEN_DATE")
    private Date openDate;
    @Column(name = "PENDING_BALANCE")
    private float pendingBalance;
    @Column(name = "STATUS")
    private String status;
    @Column(name = "CUST_ID")
    private int customerId;
    @Column(name = "OPEN_BRANCH_ID")
    private int openBranchId;
    @Column(name = "OPEN_EMP_ID")
    private int openEmpId;
    @Column(name = "PRODUCT_CD")
    private String productCd;
    @ManyToOne
    @JoinColumn(name = "OPEN_BRANCH_ID",insertable = false, updatable = false)
    private Branch branch;
    @ManyToOne
    @JoinColumn(name = "CUST_ID",insertable = false, updatable = false)
    private Customer customer;
    @ManyToOne
    @JoinColumn(name = "PRODUCT_CD",insertable = false, updatable = false)
    private Product product;
    @ManyToOne
    @JoinColumn(name = "OPEN_BRANCH_ID",insertable = false, updatable = false)
    private Branch openBranch;


}
