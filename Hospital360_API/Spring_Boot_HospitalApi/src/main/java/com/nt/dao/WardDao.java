package com.nt.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.nt.entity.Branch;
import com.nt.entity.Ward;

public interface WardDao extends CrudRepository<Ward, Integer>{
	 List <Ward> findAll();
}
