package com.SaiyanWorld.DragonBall.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Planet {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nombre;
    private String sistemaEstelar;
    
    
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
	public String getSistemaEstelar() {
		return sistemaEstelar;
	}
	public void setSistemaEstelar(String sistemaEstelar) {
		this.sistemaEstelar = sistemaEstelar;
	}
	
	


	
}
