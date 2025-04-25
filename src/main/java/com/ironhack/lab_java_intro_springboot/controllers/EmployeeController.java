package com.ironhack.lab_java_intro_springboot.controllers;

import com.ironhack.lab_java_intro_springboot.models.Employee;
import com.ironhack.lab_java_intro_springboot.models.Patient;
import com.ironhack.lab_java_intro_springboot.repositories.EmployeeRepository;
import com.ironhack.lab_java_intro_springboot.repositories.PatientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@RestController
@RequestMapping("/employees")
public class EmployeeController {

    @Autowired
    private EmployeeRepository employeeRepository;

    @GetMapping()
    @ResponseStatus(HttpStatus.OK)
    public List<Employee> getAllEmployees() {
        return employeeRepository.findAll();
    }

    @GetMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    public Employee getPatientById(@PathVariable Long id) {
        return employeeRepository.findById(id).orElseThrow( () -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Patient not found"));
    }

    @GetMapping("/?status={status}")
    @ResponseStatus(HttpStatus.OK)
    public List<Employee> getPatientsByStatus(@PathVariable String status) {
        return employeeRepository.findByStatus(status);
    }

    @GetMapping("/?department={department}")
    @ResponseStatus(HttpStatus.OK)
    public List<Employee> getPatientsByDepartment(@PathVariable String department) {
        return employeeRepository.findByDepartment(department);
    }
}
