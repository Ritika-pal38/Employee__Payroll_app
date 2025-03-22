package com.bridgelabz.EmployeePayrollApplication.service;


import com.bridgelabz.EmployeePayrollApplication.dto.EmployeeDTO;
import com.bridgelabz.EmployeePayrollApplication.entity.Employee;

import java.util.List;

public interface EmployeeService {
    List<EmployeeDTO> getAllEmployees();
    Employee getEmployeeById(Long id);
    Employee addEmployee(EmployeeDTO employeeDTO);
    Employee updateEmployee(Long id, EmployeeDTO employeeDTO);
    void deleteEmployee(Long id);
}

