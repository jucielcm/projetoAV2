package com.example.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.domain.Veterinario;

@Repository
public interface VeterinarioRepository extends JpaRepository<Veterinario, Integer> {

}
