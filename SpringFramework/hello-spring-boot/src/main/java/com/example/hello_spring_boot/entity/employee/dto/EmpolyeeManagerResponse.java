package com.example.hello_spring_boot.entity.employee.dto;

import com.example.hello_spring_boot.entity.employee.entity.Employee;
import jakarta.persistence.EntityResult;
import jakarta.persistence.FieldResult;
import jakarta.persistence.SqlResultSetMapping;
import lombok.*;

@SqlResultSetMapping(name = "EmployeeMangerMapping", entities = @EntityResult(entityClass = Employee.class,
        fields = {
                @FieldResult(column = "EMP_ID", name = "empId"),
                @FieldResult(column = "FULL_NAME_EMPLOYEE", name = "fullNameEmpolyee"),
                @FieldResult(column = "SUPERIOR_EMP_ID", name = "managerId"),
                @FieldResult(column = "FULL_NAME_MANAGER", name = "fullNameManager")
        }))
@Data
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class EmpolyeeManagerResponse {
    private Integer empId;
    private String fullNameEmpolyee;
    private Integer managerId;
    private String fullNameManager;
}
