package com.ironhack.lab_java_intro_springboot.repositories;

import com.ironhack.lab_java_intro_springboot.models.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository  extends JpaRepository<Employee, Long> {

}
