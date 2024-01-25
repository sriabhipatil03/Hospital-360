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

import com.nt.dto.AppointmentsRequestDto;
import com.nt.dto.AppointmentsResponseDto;
import com.nt.service.AppointmentsService;

@RestController
@RequestMapping("/appointments")
public class AppointmentsController {
	
	@Autowired
	private AppointmentsService appservice;

	
	@PostMapping
	public String addappointment(@RequestBody AppointmentsRequestDto dto) {
		 appservice.addappointment(dto);
		 return "Appointment Add Sucessfullay !!!";
	}
	
	@PutMapping
	public String UpdateAppointment (@RequestBody AppointmentsRequestDto dto) {
		appservice.update(dto);
		return "Update SucessFully!!!!";
	}
	
	@GetMapping
	public List<AppointmentsResponseDto> AllRecords(){
		return appservice.AllRecords();
	}
	
	@GetMapping("/id/{id}")
	public AppointmentsResponseDto getById(@PathVariable int id) {
		return appservice.getById(id);
	}
	
	@DeleteMapping("/id/{id}")
	public String AppointmentsDelete(@PathVariable int id) {
		appservice.delete(id);
		return " Delete The Data ";
	}
}
