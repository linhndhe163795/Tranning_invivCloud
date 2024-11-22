package com.example.hello_spring_boot.entity.employee.controller;

import com.example.hello_spring_boot.entity.employee.dto.EmployeeDepartment;
import com.example.hello_spring_boot.entity.employee.dto.EmployeeResponse;
import com.example.hello_spring_boot.entity.employee.dto.EmpolyeeManagerResponse;
import com.example.hello_spring_boot.entity.employee.service.EmployeeService;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.List;

@RestController
public class EmployeeController {
    @Autowired
    EmployeeService employeeService;
    @PostMapping("/searchEmployeeByStartDate")
    public List<EmployeeResponse> searchEmployeeByStartDate(@RequestParam("startDate") String startDate) {
        return employeeService.getEmployeeWithStartDate(startDate);
    }
    @GetMapping("/getEmployeeManager")
    public List<EmpolyeeManagerResponse> getEmployeeManager() {
        return employeeService.getEmployeeHaveEmployeeReponsibility();
    }
    @GetMapping("/getEmployeeDepartment")
    public List<EmployeeDepartment> getEmployeeDepartment() {
        return employeeService.getEmployeeDepartment();
    }
}
