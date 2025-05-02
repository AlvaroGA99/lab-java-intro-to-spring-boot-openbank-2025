package com.ironhack.lab_java_intro_springboot.models;

import com.ironhack.lab_java_intro_springboot.EmployeeStatus;
import jakarta.persistence.*;

@Entity
@Table(name = "employees")
public class Employee {
    @Id
    @GeneratedValue(strategy = jakarta.persistence.GenerationType.IDENTITY)
    @Column(name = "employee_id")
    private Long employeeId;
    private String department;
    private String name;

    @Enumerated(EnumType.STRING)
    private EmployeeStatus status;

    public Employee(Long employeeId, String department, String name, EmployeeStatus status) {
        this.employeeId = employeeId;
        this.department = department;
        this.name = name;
        this.status = status;
    }

    public Employee() {
    }

    public Long getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(Long employeeId) {
        this.employeeId = employeeId;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public EmployeeStatus getStatus() {
        return status;
    }

    public void setStatus(EmployeeStatus status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "employeeId=" + employeeId +
                ", department='" + department + '\'' +
                ", name='" + name + '\'' +
                ", status='" + status + '\'' +
                '}';
    }
}
