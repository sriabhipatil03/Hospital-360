package com.nt.cont;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nt.dto.BranchRequestDto;
import com.nt.dto.BranchResponseDto;
import com.nt.service.BranchService;

@RestController
@RequestMapping("/branchs")
public class BranchController {
	
	@Autowired
	private BranchService branchservice;

	@PostMapping
	public String branchAdd(@RequestBody BranchRequestDto dto) {
		 
		branchservice.add(dto);
		return "ADD Branch Information!!";
	}
	
	@PutMapping
	public String updateBranch(@RequestBody BranchRequestDto dto) {
		
		branchservice.update(dto);
		return "Update Branch Information!!!";
	}
	
	@GetMapping
	public List<BranchResponseDto> allRecords(){
		return branchservice.allRecords();
	}
	
	@GetMapping("/id/{id}")
	public BranchResponseDto getById(@PathVariable int id) {
		return branchservice.getById(id);
	}
	
	@DeleteMapping("/id/{id}")
	public String branchDelete (@PathVariable int id) {
		branchservice.delete(id);
		return "Delete Records";
	}
}
