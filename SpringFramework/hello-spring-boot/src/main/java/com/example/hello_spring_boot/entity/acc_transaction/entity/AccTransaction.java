package com.example.hello_spring_boot.entity.acc_transaction.entity;


import com.example.hello_spring_boot.entity.account.entity.Account;
import com.example.hello_spring_boot.entity.branch.entity.Branch;
import com.example.hello_spring_boot.entity.employee.entity.Employee;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "ACC_TRANSACTION")
public class AccTransaction {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "TXN_ID")
    private int txn_id;
    @Column(name = "AMOUNT")
    private float amount;
    @Column(name = "FUNDS_AVAIL_DATE")
    private Date fundsAvailDate;
    @Column(name = "TXN_TYPE_CD")
    private String txnTypeCd;
    @Column(name = "ACCOUNT_ID")
    private int account_id;
    @Column(name = "EXECUTIO_BRANCH_ID")
    private int executionBranch_id;
    @Column(name = "TELLER_EMP_ID")
    private int tellerEmpId;
    @ManyToOne
    @JoinColumn(name = "BRANCH",insertable = false, updatable = false)
    private Branch branch;
    @ManyToOne
    @JoinColumn(name = "TELLER_EMP_ID",insertable = false, updatable = false)
    private Employee tellerEmp;
    @ManyToOne
    @JoinColumn(name = "ACCOUNT_ID",insertable = false, updatable = false)
    private Account account;
}
