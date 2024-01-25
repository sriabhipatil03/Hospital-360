package com.nt.dto;

import com.nt.entity.Patients;
import com.nt.entity.Ward;

public class CotRequestDto {
	    private int cotId;
	    private int cotNumber;
	    private String status;
	    private int wardId;
	    private int  patientId;
		public CotRequestDto() {
			super();
			// TODO Auto-generated constructor stub
		}
		public CotRequestDto(int cotId, int cotNumber, String status, int wardId, int patientId) {
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
		public int getWardId() {
			return wardId;
		}
		public void setWardId(int wardId) {
			this.wardId = wardId;
		}
		public int getPatientId() {
			return patientId;
		}
		public void setPatientId(int patientId) {
			this.patientId = patientId;
		}
	    
	    
}
