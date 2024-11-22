package com.example.hello_spring_boot.entity.employee.entity;

import com.example.hello_spring_boot.entity.branch.entity.Branch;
import com.example.hello_spring_boot.entity.department.entity.Department;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name = "EMPLOYEE")
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "EMP_ID")
    private int empId;
    @Column(name =  "END_DATE")
    private Date endDate;
    @Column(name = "FIRST_NAME")
    private String firstName;
    @Column(name = "LAST_NAME")
    private String lastName;
    @Column(name = "STATE_DATE")
    private Date stateDate;
    @Column(name = "TITLE")
    private String title;
    @Column(name = "ASSIGNED_BRANCH_ID")
    private int assignedBranchId;
    @Column(name = "DEPT_ID")
    private int deptId;
    @Column(name = "SUPERIO_EMP_ID")
    private int superioEmpId;
    @ManyToOne
    @JoinColumn(name = "ASSIGNED_BRANCH_ID",insertable = false, updatable = false)
    private Branch branch;
    @ManyToOne
    @JoinColumn(name = "SUPERIOR_EMP_ID",insertable = false, updatable = false)
    private Employee employee;
    @ManyToOne
    @JoinColumn(name = "DEPT_ID",insertable = false, updatable = false)
    private Department department;
}
