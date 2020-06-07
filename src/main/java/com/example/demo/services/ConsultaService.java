package com.example.demo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.domain.Consulta;
import com.example.demo.repositories.ConsultaRepository;

@Service
public class ConsultaService {
	
	@Autowired
	private ConsultaRepository consultaRepository;
	
	public List<Consulta> list() {
		return consultaRepository.findAll();
	}
	
	public Consulta find(Integer id) {
		return consultaRepository.findById(id).get();
	}

}
