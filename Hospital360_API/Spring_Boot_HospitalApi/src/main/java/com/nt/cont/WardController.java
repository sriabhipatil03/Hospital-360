package com.nt.cont;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nt.dto.WardRequestDto;
import com.nt.dto.WardResponseDto;
import com.nt.service.WardService;

@RestController
@RequestMapping("/wards")
public class WardController {
	
	@Autowired
	private WardService wardservice;
	
	@PostMapping
	public String wardAdd(@RequestBody WardRequestDto dto) {
		
		wardservice.add(dto);
		return "Add Ward Sucessfully!!";
	}
	
	@PutMapping
	public String wardupdate(@RequestBody WardRequestDto dto) {
		
		wardservice.update(dto);
		return "Update Ward Sucessfully!!";
	}
	
	@GetMapping
	public List<WardResponseDto> allRecords(){
		
		return wardservice.allRecords();
	}

	@GetMapping("/id/{id}")
	public WardResponseDto getById(@PathVariable int id) {
		 
		return wardservice.getById(id);
	}
	
	public String WardDelete(@PathVariable int id ) {
		
		wardservice.delete(id);
		return "Delete Data !!!";
		
	}
}
