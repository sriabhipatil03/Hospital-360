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

import com.nt.dto.PatientsRequestDto;
import com.nt.dto.PatientsResponseDto;
import com.nt.entity.Patients;
import com.nt.service.PatientsService;

@RestController
@RequestMapping("/patients")
public class PatientsController {
	
	@Autowired
	private PatientsService service;
  
	@PostMapping
	public String addPatients (@RequestBody PatientsRequestDto dto) {
		  service.addPatients(dto);
		return "Add Patients Sucessfully !!";
	}
	
	@PutMapping
	public String UpdatePatients (@RequestBody PatientsRequestDto dto) {
		service.update(dto);
		return "update Patients Sucessfully !!";
	}
	
	@GetMapping
	public List<PatientsResponseDto> allRecords(){
		
		return service.allRecords();
	}
	
	@GetMapping("/id/{id}")
	public PatientsResponseDto getById (@PathVariable int id) {
		return service.getById(id);
	}
	
	@DeleteMapping("/id/{id}")
	public String patientsDelete(@PathVariable int id) {
		service.patientsDelete(id);
		return "Delete Patients Sucessfully !!";
	}
}
