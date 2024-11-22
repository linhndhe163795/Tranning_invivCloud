package com.example.hello_spring_boot.entity.customer.dto;


import jakarta.persistence.Entity;
import jakarta.persistence.EntityResult;
import jakarta.persistence.FieldResult;
import jakarta.persistence.SqlResultSetMapping;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

    @SqlResultSetMapping(name = "CustomerProduct" , entities = @EntityResult(entityClass = CustomerProduct.class,
    fields = {
            @FieldResult(column = "FULL_NAME", name = "fullName"),
            @FieldResult(column = "PRODUCT_NAME", name = "productName")
    }))

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CustomerProduct {
    private String fullName;
    private String productName;
}
