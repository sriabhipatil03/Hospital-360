package com.nt.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nt.dao.BranchDao;
import com.nt.dto.BranchRequestDto;
import com.nt.dto.BranchResponseDto;
import com.nt.entity.Branch;

@Service
public class BranchService {

	@Autowired
	private BranchDao dao;

	public void add(BranchRequestDto dto) {
		
		Branch branch = new Branch ();
		branch.setAddress(dto.getAddress());
		branch.setId(dto.getId());
		branch.setName(dto.getName());
		
		dao.save(branch);
		
	}

	public void update(BranchRequestDto dto) {
		
		Branch branch = new Branch ();
		branch.setAddress(dto.getAddress());
		branch.setId(dto.getId());
		branch.setName(dto.getName());
		
		dao.save(branch);
		
	}

	public List<BranchResponseDto> allRecords() {
		List<Branch> list = dao.findAll();
		List<BranchResponseDto> brd = new ArrayList<>();
		
		for(Branch branch : list) {
			BranchResponseDto dto = new BranchResponseDto();
			dto.setAddress(branch.getAddress());
			dto.setId(branch.getId());
			dto.setName(branch.getName());
			brd.add(dto);
			
		}
		
		return brd;
	}

	public BranchResponseDto getById(int id) {
		Optional<Branch> opt = dao.findById(id);
		
		if(opt.isPresent()) {
			Branch branch = opt.get();
			BranchResponseDto dto = new BranchResponseDto();
			
			dto.setAddress(branch.getAddress());
			dto.setId(branch.getId());
			dto.setName(branch.getName());
			return dto;
		}
		
		return null;
	}

	public void delete(int id) {
		
		dao.deleteById(id);
		
	}
}
