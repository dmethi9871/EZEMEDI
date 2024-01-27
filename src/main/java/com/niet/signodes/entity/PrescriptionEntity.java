package com.niet.signodes.entity;


import java.time.LocalDate;

import jakarta.persistence.ElementCollection;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
@Entity
@Table(name="Precription123")

public class PrescriptionEntity {
	  @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Long id;
	    
	  private String doctorName;
	    private LocalDate doctorDob;
	    private String patientName;
	    private String medicine;
	    private String timeSlot;
	    private String instructions;
	    public PrescriptionEntity() {
	        // Empty constructor
	    }
	@ElementCollection
		public Long getId() {
			return id;
		}
		public String getInstructions() {
		return instructions;
	}
	public void setInstructions(String instructions) {
		this.instructions = instructions;
	}
		public void setId(Long id) {
			this.id = id;
		}
		 public PrescriptionEntity(String doctorName, LocalDate doctorDob, String patientName, String medicine, String timeSlot, String instructions) {
		        this.doctorName = doctorName;
		        this.doctorDob = doctorDob;
		        this.patientName = patientName;
		        this.medicine = medicine;
		        this.timeSlot = timeSlot;
		        this.instructions = instructions;
		    }

		    // Getters and Setters
		    public String getDoctorName() {
		        return doctorName;
		    }

		    public void setDoctorName(String doctorName) {
		        this.doctorName = doctorName;
		    }

		    public LocalDate getDoctorDob() {
		        return doctorDob;
		    }

		    public void setDoctorDob(LocalDate doctorDob) {
		        this.doctorDob = doctorDob;
		    }

		    public String getPatientName() {
		        return patientName;
		    }

		    public void setPatientName(String patientName) {
		        this.patientName = patientName;
		    }

		    public String getMedicine() {
		        return medicine;
		    }

		    public void setMedicine(String medicine) {
		        this.medicine = medicine;
		    }

		    public String getTimeSlot() {
		        return timeSlot;
		    }

		    public void setTimeSlot(String timeSlot) {
		        this.timeSlot = timeSlot;
		    }
			@Override
			public String toString() {
				return "PrescriptionEntity [id=" + id + ", doctorName=" + doctorName + ", doctorDob=" + doctorDob
						+ ", patientName=" + patientName + ", medicine=" + medicine + ", timeSlot=" + timeSlot
						+ ", instructions=" + instructions + "]";
			}

	



}