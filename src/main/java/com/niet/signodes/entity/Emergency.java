package com.niet.signodes.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Emergency")

public class Emergency {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String patientName;
    private String emergencyMedicine;

    // Constructors, getters, and setters

    public Emergency() {
        // Default constructor
    }

    public Emergency(String patientName, String emergencyMedicine) {
        this.patientName = patientName;
        this.emergencyMedicine = emergencyMedicine;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPatientName() {
        return patientName;
    }

    public void setPatientName(String patientName) {
        this.patientName = patientName;
    }

    public String getEmergencyMedicine() {
        return emergencyMedicine;
    }

    public void setEmergencyMedicine(String emergencyMedicine) {
        this.emergencyMedicine = emergencyMedicine;
    }
}
