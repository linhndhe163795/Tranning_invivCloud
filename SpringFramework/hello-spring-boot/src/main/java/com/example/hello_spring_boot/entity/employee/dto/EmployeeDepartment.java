package com.example.hello_spring_boot.entity.employee.dto;

import jakarta.persistence.Entity;
import jakarta.persistence.EntityResult;
import jakarta.persistence.FieldResult;
import jakarta.persistence.SqlResultSetMapping;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@SqlResultSetMapping(name = "EmployeeDepartment", entities = @EntityResult(entityClass = EmployeeDepartment.class,
                    fields = {
                        @FieldResult(column = "EMP_ID", name = "employeeId"),
                        @FieldResult(column = "NAME", name = "departmentName"),
                        @FieldResult(column = "DEPT_ID", name = "departmentId"),
                        @FieldResult(column = "NAME", name = "branchName"),
                        @FieldResult(column = "BRANCH_ID", name = "branchId")
                    }))
/* Lấy thông tin chi nhánh (branch), phòng ban (department) của từng nhân viên */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class EmployeeDepartment {
    private Integer employeeId;
    private String departmentName;
    private Integer departmentId;
    private String branchName;
    private Integer branchId;
}
