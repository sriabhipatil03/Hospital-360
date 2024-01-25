package com.nt.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "ward")
public class Ward {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "wardId")
	private int wardId;
	
	@Column(name = "wardName")
	private String wardName;
	
	@Column(name = "maxCapacity")
	private int maxCapacity;
	
	@Column(name = "currentOccupancy")
	private int currentOccupancy;
	
	@Column(name = "floorNumber")
	private int floorNumber;
	
	@Column(name = "wing")
	private String wing;
	
	@Column(name = "status")
	private String status;
	
	@Column(name = "charges")
	private int charges;
	
	@ManyToOne
	@JoinColumn(name = "branch")
	private Branch branch;

	public Ward() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Ward(int wardId, String wardName, int maxCapacity, int currentOccupancy, int floorNumber, String wing,
			String status, Branch branch , int charges) {
		super();
		this.wardId = wardId;
		this.wardName = wardName;
		this.maxCapacity = maxCapacity;
		this.currentOccupancy = currentOccupancy;
		this.floorNumber = floorNumber;
		this.wing = wing;
		this.status = status;
		this.branch = branch;
		this.charges = charges;
	}
	
	public int getCharges() {
		return charges;
	}

	public void setCharges(int charges) {
		this.charges = charges;
	}

	public int getWardId() {
		return wardId;
	}

	public void setWardId(int wardId) {
		this.wardId = wardId;
	}

	public String getWardName() {
		return wardName;
	}

	public void setWardName(String wardName) {
		this.wardName = wardName;
	}

	public int getMaxCapacity() {
		return maxCapacity;
	}

	public void setMaxCapacity(int maxCapacity) {
		this.maxCapacity = maxCapacity;
	}

	public int getCurrentOccupancy() {
		return currentOccupancy;
	}

	public void setCurrentOccupancy(int currentOccupancy) {
		this.currentOccupancy = currentOccupancy;
	}

	public int getFloorNumber() {
		return floorNumber;
	}

	public void setFloorNumber(int floorNumber) {
		this.floorNumber = floorNumber;
	}

	public String getWing() {
		return wing;
	}

	public void setWing(String wing) {
		this.wing = wing;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Branch getBranch() {
		return branch;
	}

	public void setBranch(Branch branch) {
		this.branch = branch;
	}

}
