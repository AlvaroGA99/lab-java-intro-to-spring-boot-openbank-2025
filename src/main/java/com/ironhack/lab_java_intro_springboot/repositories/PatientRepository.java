package com.ironhack.lab_java_intro_springboot.repositories;

import com.ironhack.lab_java_intro_springboot.models.Patient;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PatientRepository extends JpaRepository<Patient, Long> {


}
