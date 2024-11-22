package com.example.hello_spring_boot.entity.employee.repository;

import com.example.hello_spring_boot.entity.employee.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
}
