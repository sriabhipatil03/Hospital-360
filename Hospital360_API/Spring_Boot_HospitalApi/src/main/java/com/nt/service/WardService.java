package com.nt.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nt.dao.BranchDao;
import com.nt.dao.WardDao;
import com.nt.dto.WardRequestDto;
import com.nt.dto.WardResponseDto;
import com.nt.entity.Branch;
import com.nt.entity.Ward;

@Service
public class WardService {
	
	@Autowired
	private WardDao dao;
	
	@Autowired
	private BranchDao bdao;

	public void add(WardRequestDto dto) {
		  Ward ward = new Ward();
		  ward.setCharges(dto.getCharges());
		  ward.setCurrentOccupancy(dto.getCurrentOccupancy());
		  ward.setFloorNumber(dto.getFloorNumber());
		  ward.setMaxCapacity(dto.getMaxCapacity());
		  ward.setStatus(dto.getStatus());
		  ward.setWardId(dto.getWardId());
		  ward.setWardName(dto.getWardName());
		  ward.setWing(dto.getWing());
		  
		  int branch = dto.getBranch();
		  Optional<Branch>  opt = bdao.findById(branch);
		  if(opt.isPresent()) {
			  ward.setBranch(opt.get());
		  }
		dao.save(ward);
	}

	public void update(WardRequestDto dto) {
		 Ward ward = new Ward();
		  ward.setCharges(dto.getCharges());
		  ward.setCurrentOccupancy(dto.getCurrentOccupancy());
		  ward.setFloorNumber(dto.getFloorNumber());
		  ward.setMaxCapacity(dto.getMaxCapacity());
		  ward.setStatus(dto.getStatus());
		  ward.setWardId(dto.getWardId());
		  ward.setWardName(dto.getWardName());
		  ward.setWing(dto.getWing());
		  
		  int branch = dto.getBranch();
		  Optional<Branch>  opt = bdao.findById(branch);
		  if(opt.isPresent()) {
			  ward.setBranch(opt.get());
		  }
		dao.save(ward);
		
	}

	public List<WardResponseDto> allRecords() {
		
		List<Ward> list = dao.findAll();
		List<WardResponseDto> wrd = new ArrayList<>();
		
		for(Ward ward : list) {
			
			WardResponseDto dto = new WardResponseDto();
			dto.setCharges(ward.getCharges());
			dto.setBranch(ward.getBranch());
			dto.setCurrentOccupancy(ward.getCurrentOccupancy());
			dto.setFloorNumber(ward.getFloorNumber());
			dto.setMaxCapacity(ward.getMaxCapacity());
			dto.setStatus(ward.getStatus());
			dto.setWardId(ward.getWardId());
			dto.setWardName(ward.getWardName());
			dto.setWing(ward.getWing());
			wrd.add(dto);
			
			
		}
		return wrd;
	}

	public WardResponseDto getById(int id) {
		Optional<Ward> opt = dao.findById(id);
		
		if(opt.isPresent()) {
			Ward ward = opt.get();
			WardResponseDto dto = new WardResponseDto();
			dto.setCharges(ward.getCharges());
			dto.setBranch(ward.getBranch());
			dto.setCurrentOccupancy(ward.getCurrentOccupancy());
			dto.setFloorNumber(ward.getFloorNumber());
			dto.setMaxCapacity(ward.getMaxCapacity());
			dto.setStatus(ward.getStatus());
			dto.setWardId(ward.getWardId());
			dto.setWardName(ward.getWardName());
			dto.setWing(ward.getWing());
			return dto;
		}
		
		return null;
	}

	public void delete(int id) {
		
		dao.deleteById(id);
		
	}
	

}
