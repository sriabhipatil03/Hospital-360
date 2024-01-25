package com.nt.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nt.dao.CotDao;
import com.nt.dao.PatientsDao;
import com.nt.dao.WardDao;
import com.nt.dto.CotRequestDto;
import com.nt.dto.CotResponseDto;
import com.nt.entity.Cot;
import com.nt.entity.Patients;
import com.nt.entity.Ward;

@Service 
public class CotService {
	
	@Autowired
	private CotDao dao;
	
	@Autowired
	private WardDao warddao;
	
	@Autowired
	private PatientsDao patientsdao;

	public void add(CotRequestDto dto) {
		Cot cot = new Cot();
		cot.setCotId(dto.getCotId());
		cot.setCotNumber(dto.getCotNumber());
		cot.setStatus(dto.getStatus());
		
		int wardId = dto.getWardId();
		Optional<Ward> opt = warddao.findById(wardId);
		if(opt.isPresent()) {
			cot.setWardId(opt.get());
		}
		
		int patientId = dto.getPatientId();
		Optional<Patients> optt = patientsdao.findById(patientId);
		if(optt.isPresent()) {
			cot.setPatientId(optt.get());
		}
		
		dao.save(cot);
	}

	public void update(CotRequestDto dto) {
		Cot cot = new Cot();
		cot.setCotId(dto.getCotId());
		cot.setCotNumber(dto.getCotNumber());
		cot.setStatus(dto.getStatus());
		
		int wardId = dto.getWardId();
		Optional<Ward> opt = warddao.findById(wardId);
		if(opt.isPresent()) {
			cot.setWardId(opt.get());
		}
		
		int patientId = dto.getPatientId();
		Optional<Patients> optt = patientsdao.findById(patientId);
		if(optt.isPresent()) {
			cot.setPatientId(optt.get());
		}
		
		dao.save(cot);
		
	}

	public List<CotResponseDto> allRecords() {
		List <Cot> list = dao.findAll();
		List<CotResponseDto> dtos = new ArrayList<>();
		
		for(Cot cot : list) {
			CotResponseDto dto = new CotResponseDto();
			dto.setCotId(cot.getCotId());
			dto.setCotNumber(cot.getCotNumber());
			dto.setPatientId(cot.getPatientId());
			dto.setStatus(cot.getStatus());
			dto.setWardId(cot.getWardId());
			dtos.add(dto);
		}
		return dtos;
	}

	public CotResponseDto getById(int id) {
		Optional<Cot> opt = dao.findById(id);
		
		if(opt.isPresent()) {
			Cot cot = opt.get();
			CotResponseDto dto = new CotResponseDto();
			dto.setCotId(cot.getCotId());
			dto.setCotNumber(cot.getCotNumber());
			dto.setPatientId(cot.getPatientId());
			dto.setStatus(cot.getStatus());
			dto.setWardId(cot.getWardId());
			return dto;
		}
		return null;
	}

	public void delete(int id) {
		dao.deleteById(id);
		
	}
	
	
     
}
