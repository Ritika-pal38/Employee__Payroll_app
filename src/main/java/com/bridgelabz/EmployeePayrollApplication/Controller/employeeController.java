package com.bridgelabz.EmployeePayrollApplication.Controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/employee")

public class employeeController {


    @GetMapping("/get")
    public String getEmployee() {
        return "Get Employee called";
    }

    @GetMapping("/get/{empId}")
    public String getEmployeeByID(@PathVariable int empId) {
        return "Get Employee Called By ID";
    }

    @PostMapping("/create")
    public String addEmployee() {
        return "Employee Added";
    }

    @PutMapping("/update")
    public String updateEmployee() {
        return "Employee Updated";
    }

    @DeleteMapping("/delete")
    public String deleteEmployee() {
        return "Employee Deleted";
    }

}