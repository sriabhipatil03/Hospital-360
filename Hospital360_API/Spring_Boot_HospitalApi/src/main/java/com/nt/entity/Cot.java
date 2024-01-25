package com.nt.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "cot")
public class Cot {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "cotId")
    private int cotId;
	
	
	@Column(name = "cotNumber")
    private int cotNumber;
	
	@Column(name = "status")
    private String status;
	
	@ManyToOne
	@JoinColumn(name = "wardId")
    private Ward wardId;
	
	@OneToOne
	@JoinColumn(name = "patientId")
    private Patients  patientId;
    
	public Cot() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Cot(int cotId, int cotNumber, String status, Ward wardId, Patients patientId) {
		super();
		this.cotId = cotId;
		this.cotNumber = cotNumber;
		this.status = status;
		this.wardId = wardId;
		this.patientId = patientId;
	}

	public int getCotId() {
		return cotId;
	}

	public void setCotId(int cotId) {
		this.cotId = cotId;
	}

	public int getCotNumber() {
		return cotNumber;
	}

	public void setCotNumber(int cotNumber) {
		this.cotNumber = cotNumber;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Ward getWardId() {
		return wardId;
	}

	public void setWardId(Ward wardId) {
		this.wardId = wardId;
	}

	public Patients getPatientId() {
		return patientId;
	}

	public void setPatientId(Patients patientId) {
		this.patientId = patientId;
	}
    
    
}
