package com.nt.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import com.nt.entity.Doctors;

public interface DocDao extends CrudRepository<Doctors, Integer> {
	
	
    @Override
	List<Doctors> findAll();
                                 
	Optional<Doctors> findById(int id);
    
   // Doctors findById (int id);
}
