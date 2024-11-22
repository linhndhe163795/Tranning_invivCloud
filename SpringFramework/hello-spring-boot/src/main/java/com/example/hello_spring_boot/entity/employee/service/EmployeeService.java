package com.example.hello_spring_boot.entity.employee.service;

import com.example.hello_spring_boot.entity.employee.dto.EmployeeDepartment;
import com.example.hello_spring_boot.entity.employee.dto.EmployeeResponse;
import com.example.hello_spring_boot.entity.employee.dto.EmpolyeeManagerResponse;
import com.example.hello_spring_boot.entity.employee.repository.EmployeeRepository;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class EmployeeService {
    @PersistenceContext
    private EntityManager em;
    @Autowired
    private EmployeeRepository employeeRepository;
    public List<EmployeeResponse> getEmployeeWithStartDate(String startDate) {
        StringBuilder sb = new StringBuilder();
        sb.append("SELECT ");
        sb.append("e.EMP_ID, ");
        sb.append("CONCAT(e.FIRST_NAME,' ',e.LAST_NAME) AS FULL_NAME, ");
        sb.append("e.TITLE ");

        sb.append("FROM EMPLOYEE e ");
        sb.append("WHERE e.START_DATE >= :startDate ");

        Query query = em.createNativeQuery(sb.toString(), EmployeeResponse.class);
        query.setParameter("startDate", startDate);
        return  query.getResultList();
    }
    //Select thông tin của các nhân viên phụ trách (superior_emp_id : emp_id của nhân viên phụ trách)
    public List<EmpolyeeManagerResponse> getEmployeeHaveEmployeeReponsibility() {
        StringBuilder sb = new StringBuilder();
        sb.append("SELECT ");
        sb.append("e.EMP_ID, ");
        sb.append("CONCAT(e.FIRST_NAME,' ',e.LAST_NAME) AS FULL_NAME_EMPLOYEE, ");
        sb.append("m.EMP_ID AS SUPERIOR_EMP_ID, ");
        sb.append("CONCAT(m.FIRST_NAME ,' ', m.LAST_NAME) AS FULL_NAME_MANAGER ");

        sb.append("FROM EMPLOYEE e ");
        sb.append("LEFT JOIN EMPLOYEE m ON e.SUPERIOR_EMP_ID = m.EMP_ID ");

        Query query = em.createNativeQuery(sb.toString(), EmpolyeeManagerResponse.class);
        List<EmpolyeeManagerResponse> list = query.getResultList();
        return list;
    }
    /* Lấy thông tin chi nhánh (branch), phòng ban (department) của từng nhân viên */
    public List<EmployeeDepartment> getEmployeeDepartment(){
        StringBuilder sb = new StringBuilder();
        sb.append("SELECT ");
        sb.append("e.EMP_ID, ");
        sb.append("d.NAME AS departmentName, ");
        sb.append("d.DEPT_ID AS DEPARTMENT_ID, ");
        sb.append("b.NAME AS branchName, ");
        sb.append("b.BRANCH_ID ");


        sb.append("FROM EMPLOYEE e ");
        sb.append("JOIN BRANCH b ON e.ASSIGNED_BRANCH_ID = b.BRANCH_ID ");
        sb.append("JOIN DEPARTMENT d ON e.DEPT_ID = d.DEPT_ID");
        Query query = em.createNativeQuery(sb.toString(), EmployeeDepartment.class);
        List<EmployeeDepartment> list = query.getResultList();
        return list;
    }



}
