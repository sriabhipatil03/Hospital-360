package com.nt.dto;

import com.nt.entity.Branch;

public class WardRequestDto {

	 private int wardId;
	  private String wardName;
	  private int maxCapacity;
	  private int currentOccupancy;
	  private int floorNumber;
	  private String wing;
	  private String   status;
	  private int  branch;
	  private int charges;
	  
	public WardRequestDto() {
		super();
		// TODO Auto-generated constructor stub
	}

	public WardRequestDto(int wardId, String wardName, int maxCapacity, int currentOccupancy, int floorNumber,
			String wing, String status, int branch, int charges) {
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

	public int getBranch() {
		return branch;
	}

	public void setBranch(int branch) {
		this.branch = branch;
	}

	public int getCharges() {
		return charges;
	}

	public void setCharges(int charges) {
		this.charges = charges;
	}
	  
	  
	  


}
