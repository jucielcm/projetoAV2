package com.example.demo.domain;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonIgnore;


public class Consulta implements Serializable{

private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private Date data;
	private String end;
	private String procedimento;
	
	@ManyToOne
	@JoinColumn(name = "animal_id")
	@JsonIgnore
	private Animal animal;
	
	@ManyToOne
	@JoinColumn(name = "veterinario_id")
	@JsonIgnore
	private Veterinario veterinario;

	public Consulta() {
	}

	public Consulta(Integer id, Date data, String end, String procedimento, Animal animal, Veterinario veterinario) {
		super();
		this.id = id;
		this.data = data;
		this.end = end;
		this.procedimento = procedimento;
		this.animal = animal;
		this.veterinario = veterinario;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}

	public String getEnd() {
		return end;
	}

	public void setEnd(String end) {
		this.end = end;
	}

	public String getProcedimento() {
		return procedimento;
	}

	public void setProcedimento(String procedimento) {
		this.procedimento = procedimento;
	}

	public Animal getAnimal() {
		return animal;
	}

	public void setAnimal(Animal animal) {
		this.animal = animal;
	}

	public Veterinario getVeterinario() {
		return veterinario;
	}

	public void setVeterinario(Veterinario veterinario) {
		this.veterinario = veterinario;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Consulta other = (Consulta) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

}
