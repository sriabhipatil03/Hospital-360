package com.nt.entity;

import java.sql.Date;
import java.time.LocalDate;
import java.time.LocalTime;

import org.springframework.format.annotation.DateTimeFormat;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import jakarta.validation.constraints.NotNull;

@Entity
@Table(name = "appointments")
public class Appointments {

	
	@Id
	@NotNull
	@GeneratedValue (strategy = GenerationType.AUTO)
	@Column(name = "appointment_id")
	private int  appointmentId ;
	
	@ManyToOne
	@JoinColumn(name = "patient_id" , nullable = false)
	private Patients  patientId;
	
	@ManyToOne
	@JoinColumn(name = "doctor_id" , nullable = false)
	private Doctors doctorId;


	@Column(name = "appointment_date" , nullable = false)
    private LocalDate appointmentDate;

    @Column(name = "appointment_time" , nullable = false )
	private LocalTime appointmentTime;
	
	@Column(name = "status" ,nullable = false)
	private String  status ;
	
	@Column(name = "phone_number")
	private String  phoneNumber;
	
	@Column(name = "notes")
	private String   notes;
	
	@Column(name = "branch" ,nullable = false)
	private int branch;
	
	
	public Appointments() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Appointments(int appointmentId, Patients patientId, Doctors doctorId, LocalDate appointmentDate,
			LocalTime appointmentTime, String status, String phoneNumber, String notes, int branch) {
		super();
		this.appointmentId = appointmentId;
		this.patientId = patientId;
		this.doctorId = doctorId;
		this.appointmentDate = appointmentDate;
		this.appointmentTime = appointmentTime;
		this.status = status;
		this.phoneNumber = phoneNumber;
		this.notes = notes;
		this.branch = branch;
	}


	public int getAppointmentId() {
		return appointmentId;
	}


	public void setAppointmentId(int appointmentId) {
		this.appointmentId = appointmentId;
	}


	public Patients getPatientId() {
		return patientId;
	}


	public void setPatientId(Patients patientId) {
		this.patientId = patientId;
	}


	public Doctors getDoctorId() {
		return doctorId;
	}


	public void setDoctorId(Doctors doctorId) {
		this.doctorId = doctorId;
	}


	public LocalDate getAppointmentDate() {
		return appointmentDate;
	}


	public void setAppointmentDate(LocalDate appointmentDate) {
		this.appointmentDate = appointmentDate;
	}


	public LocalTime getAppointmentTime() {
		return appointmentTime;
	}


	public void setAppointmentTime(LocalTime appointmentTime) {
		this.appointmentTime = appointmentTime;
	}


	public String getStatus() {
		return status;
	}


	public void setStatus(String status) {
		this.status = status;
	}


	public String getPhoneNumber() {
		return phoneNumber;
	}


	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}


	public String getNotes() {
		return notes;
	}


	public void setNotes(String notes) {
		this.notes = notes;
	}


	public int getBranch() {
		return branch;
	}


	public void setBranch(int branch) {
		this.branch = branch;
	}
	
	
}
