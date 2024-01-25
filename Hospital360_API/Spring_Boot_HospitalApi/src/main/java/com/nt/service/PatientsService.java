package com.nt.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nt.dao.PatientsDao;
import com.nt.dto.PatientsRequestDto;
import com.nt.dto.PatientsResponseDto;
import com.nt.entity.Patients;

@Service
public class PatientsService {
	
	@Autowired
	private PatientsDao dao;

	public void addPatients(PatientsRequestDto dto) {
		 Patients pati = new Patients ();
		 pati.setAddress(dto.getAddress());
		 pati.setAllergies(dto.getAllergies());
		 pati.setBloodType(dto.getBloodType());
		 pati.setDateOfBirth(dto.getDateOfBirth());
		 pati.setDoctorId(dto.getDoctorId());
		 pati.setEmail(dto.getEmail());
		 pati.setEmergencyContactName(dto.getEmergencyContactName());
		 pati.setEmergencyContactNumber(dto.getEmergencyContactNumber());
		 pati.setFirstName(dto.getFirstName());
		 pati.setGender(dto.getGender());
		 pati.setLanguageSpoken(dto.getLanguageSpoken());
		 pati.setLastName(dto.getLastName());
		 pati.setMaritalStatus(dto.getMaritalStatus());
		 pati.setMedicalHistory(dto.getMedicalHistory());
		 pati.setNationality(dto.getNationality());
		 pati.setOccupation(dto.getOccupation());
		 pati.setPatientId(dto.getPatientId());
		 pati.setPhoneNumber(dto.getPhoneNumber());
		 pati.setReligion(dto.getReligion());
		 
		dao.save(pati);
	}

	public void update(PatientsRequestDto dto) {
		 Patients pati = new Patients ();
		 pati.setAddress(dto.getAddress());
		 pati.setAllergies(dto.getAllergies());
		 pati.setBloodType(dto.getBloodType());
		 pati.setDateOfBirth(dto.getDateOfBirth());
		 pati.setDoctorId(dto.getDoctorId());
		 pati.setEmail(dto.getEmail());
		 pati.setEmergencyContactName(dto.getEmergencyContactName());
		 pati.setEmergencyContactNumber(dto.getEmergencyContactNumber());
		 pati.setFirstName(dto.getFirstName());
		 pati.setGender(dto.getGender());
		 pati.setLanguageSpoken(dto.getLanguageSpoken());
		 pati.setLastName(dto.getLastName());
		 pati.setMaritalStatus(dto.getMaritalStatus());
		 pati.setMedicalHistory(dto.getMedicalHistory());
		 pati.setNationality(dto.getNationality());
		 pati.setOccupation(dto.getOccupation());
		 pati.setPatientId(dto.getPatientId());
		 pati.setPhoneNumber(dto.getPhoneNumber());
		 pati.setReligion(dto.getReligion());
		 
		dao.save(pati);
		
	}

	public List<PatientsResponseDto> allRecords() {
		  List<Patients> list = dao.findAll();
		  List <PatientsResponseDto> dtos = new ArrayList<>();
		  
		  for(Patients pati : list) {
			  PatientsResponseDto dto = new PatientsResponseDto();
			     dto.setAddress(pati.getAddress());
				 dto.setAllergies(pati.getAllergies());
				 dto.setBloodType(pati.getBloodType());
				 dto.setDateOfBirth(pati.getDateOfBirth());
				 dto.setDoctorId(pati.getDoctorId());
				 dto.setEmail(pati.getEmail());
				 dto.setEmergencyContactName(pati.getEmergencyContactName());
				 dto.setEmergencyContactNumber(pati.getEmergencyContactNumber());
				 dto.setFirstName(pati.getFirstName());
				 dto.setGender(pati.getGender());
				 dto.setLanguageSpoken(pati.getLanguageSpoken());
				 dto.setLastName(pati.getLastName());
				 dto.setMaritalStatus(pati.getMaritalStatus());
				 dto.setMedicalHistory(pati.getMedicalHistory());
				 dto.setNationality(pati.getNationality());
				 dto.setOccupation(pati.getOccupation());
				 dto.setPatientId(pati.getPatientId());
				 dto.setPhoneNumber(pati.getPhoneNumber());
				 dto.setReligion(pati.getReligion());
				 dtos.add(dto);
		  }
		return dtos;
	}

	public PatientsResponseDto getById(int id) {
		Optional<Patients> opt = dao.findById(id);
		
		if(opt.isPresent()) {
			Patients pati = opt.get();
			  PatientsResponseDto dto = new PatientsResponseDto();
			     dto.setAddress(pati.getAddress());
				 dto.setAllergies(pati.getAllergies());
				 dto.setBloodType(pati.getBloodType());
				 dto.setDateOfBirth(pati.getDateOfBirth());
				 dto.setDoctorId(pati.getDoctorId());
				 dto.setEmail(pati.getEmail());
				 dto.setEmergencyContactName(pati.getEmergencyContactName());
				 dto.setEmergencyContactNumber(pati.getEmergencyContactNumber());
				 dto.setFirstName(pati.getFirstName());
				 dto.setGender(pati.getGender());
				 dto.setLanguageSpoken(pati.getLanguageSpoken());
				 dto.setLastName(pati.getLastName());
				 dto.setMaritalStatus(pati.getMaritalStatus());
				 dto.setMedicalHistory(pati.getMedicalHistory());
				 dto.setNationality(pati.getNationality());
				 dto.setOccupation(pati.getOccupation());
				 dto.setPatientId(pati.getPatientId());
				 dto.setPhoneNumber(pati.getPhoneNumber());
				 dto.setReligion(pati.getReligion());
				return dto;
		}
		return null;
	}

	public void patientsDelete(int id) {
		
		dao.deleteById(id);
		
	}
	
	

}
