package com.bridgelabz.EmployeePayrollApplication.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import org.springframework.web.bind.annotation.*;
import com.bridgelabz.EmployeePayrollApplication.dto.EmployeeDTO;
import com.bridgelabz.EmployeePayrollApplication.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.List;

    @RestController
    @RequestMapping("/employees")
    public class EmployeeController {

        @Autowired
        private EmployeeService employeeService;

        @PostMapping("/add")
        public EmployeeDTO createEmployee(@RequestBody EmployeeDTO employeeDTO) {
            return employeeService.createEmployee(employeeDTO);
        }

        @GetMapping("/all")
        public List<EmployeeDTO> getAllEmployees() {
            return employeeService.getAllEmployees();
        }
    }