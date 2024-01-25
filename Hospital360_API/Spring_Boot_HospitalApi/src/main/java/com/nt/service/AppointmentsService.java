package com.nt.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nt.dao.AppointmentsDao;
import com.nt.dao.DocDao;
import com.nt.dao.PatientsDao;
import com.nt.dto.AppointmentsRequestDto;
import com.nt.dto.AppointmentsResponseDto;
import com.nt.entity.Appointments;
import com.nt.entity.Doctors;
import com.nt.entity.Patients;

@Service
public class AppointmentsService {
	
	@Autowired
	private AppointmentsDao dao;
	
	@Autowired
	private PatientsDao patientsdao;
	
	@Autowired
	private DocDao doctorsdao;
    
	
	public void addappointment(AppointmentsRequestDto dto) {
		Appointments appo = new Appointments();
		appo.setAppointmentDate(dto.getAppointmentDate());
		appo.setAppointmentId(dto.getAppointmentId());
		appo.setAppointmentTime(dto.getAppointmentTime());
		appo.setBranch(dto.getBranch());
		appo.setNotes(dto.getNotes());
		appo.setPhoneNumber(dto.getPhoneNumber());
		appo.setStatus(dto.getStatus());
		
		int patientId = dto.getPatientId();
		Optional<Patients> opt = patientsdao.findById(patientId);
		if(opt.isPresent()) {
			appo.setPatientId(opt.get());
		}
		int doctorsId = dto.getDoctorId();
		Optional<Doctors> optt = doctorsdao.findById(doctorsId);
		if(opt.isPresent()) {
			appo.setDoctorId(optt.get());
		}
		
		
		dao.save(appo);
		
	}


	public void update(AppointmentsRequestDto dto) {
		Appointments appo = new Appointments();
		appo.setAppointmentDate(dto.getAppointmentDate());
		appo.setAppointmentId(dto.getAppointmentId());
		appo.setAppointmentTime(dto.getAppointmentTime());
		appo.setBranch(dto.getBranch());
		appo.setNotes(dto.getNotes());
		appo.setPhoneNumber(dto.getPhoneNumber());
		appo.setStatus(dto.getStatus());
		
		int patientId = dto.getPatientId();
		Optional<Patients> opt = patientsdao.findById(patientId);
		if(opt.isPresent()) {
			appo.setPatientId(opt.get());
		}
		int doctorsId = dto.getDoctorId();
		Optional<Doctors> optt = doctorsdao.findById(doctorsId);
		if(opt.isPresent()) {
			appo.setDoctorId(optt.get());
		}
		
		dao.save(appo);
		
	}


	public List<AppointmentsResponseDto> AllRecords() {
	    List<Appointments> list = dao.findAll();
	    List<AppointmentsResponseDto> dtos = new ArrayList<>();
	    
	    for(Appointments appo : list) {
	    	AppointmentsResponseDto dto = new AppointmentsResponseDto();
			dto.setAppointmentDate(appo.getAppointmentDate());
			dto.setAppointmentId(appo.getAppointmentId());
			dto.setAppointmentTime(appo.getAppointmentTime());
			dto.setBranch(appo.getBranch());
			dto.setNotes(appo.getNotes());
			dto.setPhoneNumber(appo.getPhoneNumber());
			dto.setStatus(appo.getStatus());
			dto.setPatientId(appo.getPatientId());
			dto.setDoctorId(appo.getDoctorId());
			dtos.add(dto);
	    	
	    }
 		
		return dtos;
	}


	public AppointmentsResponseDto getById(int id) {
		Optional<Appointments> opt = dao.findById(id);
		
		if(opt.isPresent()) {
			 Appointments appo = opt.get();
			AppointmentsResponseDto dto = new AppointmentsResponseDto();
			dto.setAppointmentDate(appo.getAppointmentDate());
			dto.setAppointmentId(appo.getAppointmentId());
			dto.setAppointmentTime(appo.getAppointmentTime());
			dto.setBranch(appo.getBranch());
			dto.setNotes(appo.getNotes());
			dto.setPhoneNumber(appo.getPhoneNumber());
			dto.setStatus(appo.getStatus());
			dto.setPatientId(appo.getPatientId());
			dto.setDoctorId(appo.getDoctorId());
			return dto;
		}
		return null;
	}


	public void delete(int id) {
		dao.deleteById(id);
		
	}

}
