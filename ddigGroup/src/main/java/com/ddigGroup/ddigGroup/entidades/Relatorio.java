package com.ddigGroup.ddigGroup.entidades;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class Relatorio extends BaseEntidade {
	
	private int nivelNitrogenio;
	private int nivelPotassio;
	private int nivelFosforo;
	
	
	@OneToOne
	@JoinColumn(name="analiseSolo_id")
	private AnaliseSolo analise;
	
	
	public int getNivelNitrogenio() {
		return nivelNitrogenio;
	}
	public void setNivelNitrogenio() {
		this.nivelNitrogenio = (int) analise.getNitrogenio();
	}
	
	public int getNivelPotassio() {
		return nivelPotassio;
	}
	
	public void setNivelPotassio() {
		this.nivelPotassio = (int) analise.getPotassio();
	}
	
	public int getNivelFosforo() {
		return nivelFosforo;
	}
	
	public void setNivelFosforo() {
		this.nivelFosforo = (int) analise.getNitrogenio();
	}
	
	public AnaliseSolo getAnalise() {
		return analise;
	}
	
	public void setAnalise(AnaliseSolo analise) {
		this.analise = analise;
	}
		

}
