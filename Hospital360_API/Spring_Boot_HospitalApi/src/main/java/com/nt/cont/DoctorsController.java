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

import com.nt.dto.DoctorRequestDto;
import com.nt.dto.DoctorResponseDto;
import com.nt.service.DocService;

@RestController
@RequestMapping("/doctors")
public class DoctorsController {
     
	@Autowired
	private DocService docservice;
	
	@PostMapping
	public String addDoctors (@RequestBody DoctorRequestDto dto) {
		
		docservice.addDoctors(dto);
		return "Add Doctors Successfully !!!";
	}
	
	@PutMapping
	public String updateDoctor(@RequestBody DoctorRequestDto dto) {
		docservice.updateDoctor(dto);
		return "Update Doctors Successfully";
	}
	
	@GetMapping
	public List<DoctorResponseDto> allDoctors (){
		return docservice.allDoctors();
	}
	
	@GetMapping("/id/{id}")
	public DoctorResponseDto getById (@PathVariable int id) {
		return docservice.getById(id);
	}
	
	@DeleteMapping("/id/{id}")
	public String delete(@PathVariable int id) {
		
		 docservice.delete(id);
		 return "Delete Doctors Successfully";
	}
}
