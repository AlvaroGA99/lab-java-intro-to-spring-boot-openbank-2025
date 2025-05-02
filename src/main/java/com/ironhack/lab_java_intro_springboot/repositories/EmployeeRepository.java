package com.ironhack.lab_java_intro_springboot.repositories;

import com.ironhack.lab_java_intro_springboot.EmployeeStatus;
import com.ironhack.lab_java_intro_springboot.models.Employee;
import com.ironhack.lab_java_intro_springboot.models.Patient;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.sql.Date;
import java.util.List;

@Repository
public interface EmployeeRepository  extends JpaRepository<Employee, Long> {

    List<Employee> findByStatus(EmployeeStatus status);

    List<Employee> findByDepartment(String department);


}
