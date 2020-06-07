package com.example.demo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.domain.Especie;
import com.example.demo.repositories.EspecieRepository;

@Service
public class EspecieService {
	
	@Autowired
	private EspecieRepository especieRepository;
	
	public List<Especie> list() {
		return especieRepository.findAll();
	}
	
	public Especie find(Integer id) {
		return especieRepository.findById(id).get();
	}

}
