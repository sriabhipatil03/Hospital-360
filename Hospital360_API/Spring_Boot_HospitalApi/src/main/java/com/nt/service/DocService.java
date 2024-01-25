package com.nt.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nt.dao.DocDao;
import com.nt.dto.DoctorRequestDto;
import com.nt.dto.DoctorResponseDto;
import com.nt.entity.Doctors;

@Service
public class DocService {
	
	@Autowired
	private DocDao dao;

	public void addDoctors(DoctorRequestDto dto) {
		Doctors doc = new Doctors();
		doc.setAddress(dto.getAddress());
		doc.setAvailableDays(dto.getAvailableDays());
		doc.setAvailableTimeSlots(dto.getAvailableTimeSlots());
		doc.setBranch(dto.getBranch());
		doc.setConsultationFee(dto.getConsultationFee());
		doc.setEmail(dto.getEmail());
		doc.setExperience(dto.getExperience());
		doc.setFirstName(dto.getFirstName());
		doc.setId(dto.getId());
		doc.setJoiningDate(dto.getJoiningDate());
		doc.setLastName(dto.getLastName());
		doc.setPhoneNumber(dto.getPhoneNumber());
		doc.setQualifications(dto.getQualifications());
		doc.setSpecialization(dto.getSpecialization());
		doc.setStatus(dto.getStatus());
	
		dao.save(doc);
	}

	public void updateDoctor(DoctorRequestDto dto) {
		
		Doctors doc = new Doctors();
		doc.setAddress(dto.getAddress());
		doc.setAvailableDays(dto.getAvailableDays());
		doc.setAvailableTimeSlots(dto.getAvailableTimeSlots());
		doc.setBranch(dto.getBranch());
		doc.setConsultationFee(dto.getConsultationFee());
		doc.setEmail(dto.getEmail());
		doc.setExperience(dto.getExperience());
		doc.setFirstName(dto.getFirstName());
		doc.setId(dto.getId());
		doc.setJoiningDate(dto.getJoiningDate());
		doc.setLastName(dto.getLastName());
		doc.setPhoneNumber(dto.getPhoneNumber());
		doc.setQualifications(dto.getQualifications());
		doc.setSpecialization(dto.getSpecialization());
		doc.setStatus(dto.getStatus());
	
		dao.save(doc);
	
	}

	public List<DoctorResponseDto> allDoctors() {
		    List <Doctors> list= dao.findAll();
		    List <DoctorResponseDto> dtos = new ArrayList<>();
		    
		    for(Doctors doc :list) {
		    	DoctorResponseDto dto = new DoctorResponseDto();
				dto.setAvailableDays(doc.getAvailableDays());
				dto.setAvailableTimeSlots(doc.getAvailableTimeSlots());
				dto.setBranch(doc.getBranch());
				dto.setConsultationFee(doc.getConsultationFee());
				dto.setEmail(doc.getEmail());
				dto.setExperience(doc.getExperience());
				dto.setFirstName(doc.getFirstName());
				dto.setId(doc.getId());
				dto.setLastName(doc.getLastName());
				dto.setPhoneNumber(doc.getPhoneNumber());
				dto.setQualifications(doc.getQualifications());
				dto.setSpecialization(doc.getSpecialization());
				dto.setStatus(doc.getStatus());
				dtos.add(dto);
			
		    }
		return dtos;
	}

	public DoctorResponseDto getById(int id) {
		 Optional<Doctors> opt = dao.findById(id);
		 if(opt.isPresent()) {
			 Doctors doc = opt.get();
			 DoctorResponseDto dto = new DoctorResponseDto();
			 
			    dto.setAvailableDays(doc.getAvailableDays());
				dto.setAvailableTimeSlots(doc.getAvailableTimeSlots());
				dto.setBranch(doc.getBranch());
				dto.setConsultationFee(doc.getConsultationFee());
				dto.setEmail(doc.getEmail());
				dto.setExperience(doc.getExperience());
				dto.setFirstName(doc.getFirstName());
				dto.setId(doc.getId());
				dto.setLastName(doc.getLastName());
				dto.setPhoneNumber(doc.getPhoneNumber());
				dto.setQualifications(doc.getQualifications());
				dto.setSpecialization(doc.getSpecialization());
				dto.setStatus(doc.getStatus());
				
				return dto;
			 
		 }
		return null;
	}

	public String delete(int id) {
	      dao.deleteById(id);
		return null;
	}
	
}
