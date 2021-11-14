package com.ddigGroup.ddigGroup.entidades;

import java.util.UUID;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Terreno extends BaseEntidade{
	
	
	private String nome;
	private float area;
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public float getArea() {
		return area;
	}
	public void setArea(float area) {
		this.area = area;
	}

	
}
