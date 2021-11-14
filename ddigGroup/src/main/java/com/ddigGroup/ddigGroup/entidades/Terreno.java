package com.ddigGroup.ddigGroup.entidades;

import javax.persistence.Column;
import javax.persistence.Entity;
import org.hibernate.annotations.Columns;

@Entity
public class Terreno extends BaseEntidade{
	
	@Column(nullable = false)
	private String nome;
	
	@Column(nullable = false)
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
