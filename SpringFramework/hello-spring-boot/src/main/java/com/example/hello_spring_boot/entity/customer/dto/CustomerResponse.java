package com.example.hello_spring_boot.entity.customer.dto;

import com.example.hello_spring_boot.entity.customer.entity.Customer;
import jakarta.persistence.Column;
import jakarta.persistence.EntityResult;
import jakarta.persistence.FieldResult;
import jakarta.persistence.SqlResultSetMapping;
import lombok.*;

@SqlResultSetMapping(name = "CustomerMapping", entities = @EntityResult(
        entityClass = CustomerResponse.class,
        fields = {
                @FieldResult(column = "FIRST_NAME", name="firstName"),
                @FieldResult(column = "LAST_NAME", name = "lastName"),
                @FieldResult(column = "FULL_NAME", name = "fullName"),
                @FieldResult(column = "ADDRESS", name="address"),
                @FieldResult(column = "CITY", name = "city"),
        }))
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CustomerResponse {
    private String city;
    private String address;
    private String firstName;
    private String lastName;
    private String fullName;

}





