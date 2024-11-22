package com.example.hello_spring_boot.entity.employee.dto;

import com.example.hello_spring_boot.entity.employee.entity.Employee;
import jakarta.persistence.Entity;
import jakarta.persistence.EntityResult;
import jakarta.persistence.FieldResult;
import jakarta.persistence.SqlResultSetMapping;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@SqlResultSetMapping(name = "EmployeeMapping", entities = @EntityResult(entityClass = Employee.class,
        fields = {
            @FieldResult(column = "EMP_ID", name = "empId"),
            @FieldResult(column = "FULL_NAME", name = "fullName"),
            @FieldResult(column = "TITLE", name = "title")
        }))

@Data
@AllArgsConstructor
@NoArgsConstructor
public class EmployeeResponse {
    private int empId;
    private String fullName;
    private String title;
}
