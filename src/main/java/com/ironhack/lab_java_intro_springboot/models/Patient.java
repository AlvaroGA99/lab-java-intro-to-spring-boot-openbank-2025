package com.ironhack.lab_java_intro_springboot.models;

import jakarta.persistence.*;

@Entity
@Table(name = "patients")
public class Patient {
    @Id
    @GeneratedValue(strategy = jakarta.persistence.GenerationType.IDENTITY)
    @Column(name = "patient_id")
    private Long patientId;

    private String name;

    @Column(name = "date_of_birth")
    private String dateOfBirth;

    @OneToOne
    @JoinColumn(name = "employee_id")
    private Employee addmittedBy;

    public Patient(Long patientId, String name, String dateOfBirth, Employee addmittedBy) {
        this.patientId = patientId;
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.addmittedBy = addmittedBy;
    }

    public Patient() {
    }

    public Long getPatientId() {
        return patientId;
    }

    public void setPatientId(Long patientId) {
        this.patientId = patientId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public Employee getAddmittedBy() {
        return addmittedBy;
    }

    public void setAddmittedBy(Employee addmittedBy) {
        this.addmittedBy = addmittedBy;
    }
}


