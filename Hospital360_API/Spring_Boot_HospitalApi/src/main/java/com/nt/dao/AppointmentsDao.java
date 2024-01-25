package com.nt.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.nt.entity.Appointments;
import com.nt.entity.Patients;

public interface AppointmentsDao extends CrudRepository<Appointments, Integer>{


	@Override
   List <Appointments> findAll();
	
}
