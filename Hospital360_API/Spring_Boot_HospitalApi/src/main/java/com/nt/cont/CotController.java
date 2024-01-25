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

import com.nt.dto.CotRequestDto;
import com.nt.dto.CotResponseDto;
import com.nt.service.CotService;

@RestController
@RequestMapping("/cots")
public class CotController {
	
	@Autowired
	private CotService cotservice;

	@PostMapping
	public String addCot (@RequestBody CotRequestDto dto) {
		
		cotservice.add(dto);
		return "ADD Cot Sucessfully!!";
	}
	
	@PutMapping
	public String updateCot(@RequestBody CotRequestDto dto) {
		
		  cotservice.update(dto);
		return "Update Cot Sucessfully !!";
	}
	
	@GetMapping
	public List<CotResponseDto> allRecords(){
		return cotservice.allRecords();
		
	}
	
	@GetMapping("/id/{id}")
	public CotResponseDto getById(@PathVariable int id) {
		return cotservice.getById(id);
		
	}
	
	@DeleteMapping
	public String cotDelete (@PathVariable int id) {
		cotservice.delete(id);
		return "Delete Cot Sucessfully!!";
	}
}
