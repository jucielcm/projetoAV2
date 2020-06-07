package com.example.demo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.domain.Cliente;
import com.example.demo.repositories.ClienteRepository;

@Service
public class ClienteService {
	
	@Autowired
	private ClienteRepository clienteRepository;
	
	public List<Cliente> list() {
		return clienteRepository.findAll();
	}
	
	public Cliente find(Integer id) {
		return clienteRepository.findById(id).get();
	}

}
