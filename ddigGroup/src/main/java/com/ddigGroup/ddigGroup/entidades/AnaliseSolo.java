package com.ddigGroup.ddigGroup.entidades;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class AnaliseSolo  extends BaseEntidade{
	
	@OneToOne
	@JoinColumn(name = "plancatacao_id")
	private Plantacao plantacao;
	
	@Column(nullable = false)
	private float nitrogenio;
	
	@Column(nullable = false)
	private float fosforo;
	
	@Column(nullable = false)
	private float potassio;
	

	public float getNitrogenio() {
		return nitrogenio;
	}
	
	public void setNitrogenio(float nitrogenio) {
		this.nitrogenio = nitrogenio;
	}
	
	public float getFosforo() {
		return fosforo;
	}
	
	public void setFosforo(float fosforo) {
		this.fosforo = fosforo;
	}
	
	public float getPotassio() {
		return potassio;
	}
	
	public void setPotassio(float potassio) {
		this.potassio = potassio;
	}
	
	public Plantacao getPlantacao() {
		return plantacao;
	}
	
	public void setPlantacao(Plantacao plantacao) {
		this.plantacao = plantacao;
	}	
}
