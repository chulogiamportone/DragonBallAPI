package com.SaiyanWorld.DragonBall.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Power {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nombre;
    private Double multiplicadorDePoder;
    
	public Power() {
		
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Double getMultiplicadorDePoder() {
		return multiplicadorDePoder;
	}

	public void setMultiplicadorDePoder(Double multiplicadorDePoder) {
		this.multiplicadorDePoder = multiplicadorDePoder;
	}

	  
    
    

}

