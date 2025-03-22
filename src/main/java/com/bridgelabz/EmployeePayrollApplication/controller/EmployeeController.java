package com.bridgelabz.EmployeePayrollApplication.controller;


import com.bridgelabz.EmployeePayrollApplication.entity.Employee;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import org.springframework.web.bind.annotation.*;
import com.bridgelabz.EmployeePayrollApplication.dto.EmployeeDTO;
import com.bridgelabz.EmployeePayrollApplication.service.EmployeeService;

import java.util.List;

@Slf4j  // Enables Logging
@Service  // Marks this as a Service Laye
    @RestController
    @RequestMapping("/employees")
    public class EmployeeController {

        @Autowired
        private EmployeeService employeeService;

        @GetMapping
        public List<EmployeeDTO> getEmployees() {
            log.info("Fetching all employees via GET /employees");
            return employeeService.getAllEmployees();
        }

        @GetMapping("/{id}")
        public Employee getEmployeeById(@PathVariable Long id) {
            log.info("Fetching Employee with ID: {}", id);
            return employeeService.getEmployeeById(id);
        }

        @PostMapping
        public Employee addEmployee(@RequestBody EmployeeDTO employeeDTO) {
            log.info("POST /employees - Adding Employee: {}", employeeDTO.getName());
            return employeeService.addEmployee(employeeDTO);
        }

        @PutMapping("/{id}")
        public Employee updateEmployee(@PathVariable Long id, @RequestBody EmployeeDTO employeeDTO) {
            log.info("PUT /employees/{} - Updating Employee", id);
            return employeeService.updateEmployee(id, employeeDTO);
        }

        @DeleteMapping("/{id}")
        public String deleteEmployee(@PathVariable Long id) {
            log.info("DELETE /employees/{} - Deleting Employee", id);
            employeeService.deleteEmployee(id);
            return "Employee deleted successfully!";
        }
    }