package com.nt.dto;

import com.nt.entity.Patients;
import com.nt.entity.Ward;

public class CotResponseDto {
	 private int cotId;
	    private int cotNumber;
	    private String status;
	    private Ward wardId;
	    private Patients  patientId;
	    
	    
		public CotResponseDto() {
			super();
			// TODO Auto-generated constructor stub
		}
		public CotResponseDto(int cotId, int cotNumber, String status, Ward wardId, Patients patientId) {
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
