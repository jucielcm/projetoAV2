package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.domain.Especie;
import com.example.demo.services.EspecieService;

@RestController
@RequestMapping("/especies")
public class EspecieController {
	
	@Autowired
	private EspecieService especieService;
	
	@GetMapping
	public ResponseEntity<List<Especie>> list() {
		List<Especie> especies = especieService.list();
		
		return ResponseEntity.ok(especies);
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Especie> find(@PathVariable Integer id) {
		Especie especie = especieService.find(id);
		
		return ResponseEntity.ok(especie);
	}

}
