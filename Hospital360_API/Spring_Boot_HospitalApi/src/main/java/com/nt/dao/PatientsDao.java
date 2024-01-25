package com.nt.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import com.nt.entity.Doctors;
import com.nt.entity.Patients;

public interface PatientsDao extends CrudRepository<Patients, Integer>{
	
	@Override
   List <Patients> findAll();
	//Optional<Doctors> findById();
  
}
