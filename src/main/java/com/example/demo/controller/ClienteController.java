package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.domain.Cliente;
import com.example.demo.services.ClienteService;

@RestController
@RequestMapping("/clientes")
public class ClienteController {
	
	@Autowired
	private ClienteService clienteService;
	
	@GetMapping
	public ResponseEntity<List<Cliente>> list() {
		List<Cliente> clientes = clienteService.list();
		
		return ResponseEntity.ok(clientes);
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Cliente> find(@PathVariable Integer id) {
		Cliente cliente = clienteService.find(id);
		
		return ResponseEntity.ok(cliente);
	}

}
