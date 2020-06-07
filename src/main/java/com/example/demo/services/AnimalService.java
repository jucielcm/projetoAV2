package com.example.demo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.domain.Animal;
import com.example.demo.repositories.AnimalRepository;

@Service
public class AnimalService {
	
	@Autowired
	private AnimalRepository animalRepository;
	
	public List<Animal> list() {
		return animalRepository.findAll();
	}
	
	public Animal find(Integer id) {
		return animalRepository.findById(id).get();
	}
}
