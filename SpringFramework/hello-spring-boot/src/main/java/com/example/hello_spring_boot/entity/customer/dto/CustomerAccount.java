package com.example.hello_spring_boot.entity.customer.dto;

import com.example.hello_spring_boot.entity.customer.entity.Customer;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@SqlResultSetMapping(name = "CustomerCountAccountMapping",
        classes = @ConstructorResult(
        targetClass = CustomerAccount.class,
        columns = {
                @ColumnResult(name = "CUST_ID", type = Integer.class),
                @ColumnResult(name = "COUNT_ACCOUNT", type = Long.class)
        }))
@SqlResultSetMapping(name = "CustomerAccountActiveMapping",
        classes = @ConstructorResult(
        targetClass = CustomerAccount.class,
        columns = {
                @ColumnResult(name = "CUST_ID", type = Integer.class),
                @ColumnResult(name = "FIRST_NAME", type = String.class),
                @ColumnResult(name = "LAST_NAME", type = String.class),
                @ColumnResult(name = "SUM_AVAIL_BALANCE", type = Long.class),
                @ColumnResult(name = "SUM_PENDING_BALANCE", type = Long.class)
        }))
@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor

public class CustomerAccount {
    @Id
    private Integer customerId;
    private Long countAccount;
    private String firstName;
    private String lastName;
    private Long availBalance;
    private Long pendingBalance;

    public CustomerAccount(Integer customerId, Long countAccount) {
        this.customerId = customerId;
        this.countAccount = countAccount;
    }

    public CustomerAccount(Integer customerId, String firstName, String lastName, Long pendingBalance, Long availBalance) {
        this.customerId = customerId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.pendingBalance = pendingBalance;
        this.availBalance = availBalance;
    }
}


