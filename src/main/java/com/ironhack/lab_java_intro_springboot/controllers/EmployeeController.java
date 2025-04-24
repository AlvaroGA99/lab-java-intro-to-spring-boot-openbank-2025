package com.ironhack.lab_java_intro_springboot.controllers;

import com.ironhack.lab_java_intro_springboot.models.Employee;
import com.ironhack.lab_java_intro_springboot.repositories.EmployeeRepository;
import com.ironhack.lab_java_intro_springboot.repositories.PatientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/employees")
public class EmployeeController {

    @Autowired
    private EmployeeRepository employeeController;

    @GetMapping()
    @ResponseStatus(HttpStatus.OK)
    public List<Employee> getAllEmployees() {
        return employeeController.findAll();
    }
}
