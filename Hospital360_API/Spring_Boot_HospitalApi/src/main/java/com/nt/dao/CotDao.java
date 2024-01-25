package com.nt.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.nt.entity.Cot;

public interface CotDao extends CrudRepository<Cot, Integer>{
    List <Cot>findAll();
}
