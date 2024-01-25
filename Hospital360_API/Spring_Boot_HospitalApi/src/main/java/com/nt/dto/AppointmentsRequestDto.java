package com.nt.dto;

import java.sql.Date;
import java.time.LocalDate;
import java.time.LocalTime;

import com.nt.entity.Doctors;
import com.nt.entity.Patients;

import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;

public class AppointmentsRequestDto {

	private int  appointmentId;
	private int   patientId;
	private int  doctorId;
    private LocalDate appointmentDate;
	private LocalTime appointmentTime;
	private String  status ;
	private String  phoneNumber;
	private String   notes;
	private int    branch;
	
	public AppointmentsRequestDto() {
		super();
		// TODO Auto-generated constructor stub
	}

	public AppointmentsRequestDto(int appointmentId, int patientId, int doctorId, LocalDate appointmentDate,
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

	public int getPatientId() {
		return patientId;
	}

	public void setPatientId(int patientId) {
		this.patientId = patientId;
	}

	public int getDoctorId() {
		return doctorId;
	}

	public void setDoctorId(int doctorId) {
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
