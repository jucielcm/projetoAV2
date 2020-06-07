package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.domain.Veterinario;
import com.example.demo.services.VeterinarioService;

@RestController
@RequestMapping("/veterinarios")
public class VeterinarioController {
	
	@Autowired
	private VeterinarioService veterinarioService;
	
	@GetMapping
	public ResponseEntity<List<Veterinario>> list() {
		List<Veterinario> veterinarios = veterinarioService.list();
		
		return ResponseEntity.ok(veterinarios);
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Veterinario> find(@PathVariable Integer id) {
		Veterinario veterinario = veterinarioService.find(id);
		
		return ResponseEntity.ok(veterinario);
	}

}
