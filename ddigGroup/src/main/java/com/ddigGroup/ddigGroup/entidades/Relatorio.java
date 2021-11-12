package com.ddigGroup.ddigGroup.entidades;

import javax.persistence.Entity;

@Entity
public class Relatorio extends BaseEntidade {
	
	private int nivelNitrogenio;
	private int nivelCalcio;
	private int nivelFosforo;
	
	
	public int getNivelNitrogenio() {
		return nivelNitrogenio;
	}
	public void setNivelNitrogenio(int nivelNitrogenio) {
		this.nivelNitrogenio = nivelNitrogenio;
	}
	public int getNivelCalcio() {
		return nivelCalcio;
	}
	public void setNivelCalcio(int nivelCalcio) {
		this.nivelCalcio = nivelCalcio;
	}
	public int getNivelFosforo() {
		return nivelFosforo;
	}
	public void setNivelFosforo(int nivelFosforo) {
		this.nivelFosforo = nivelFosforo;
	}
	
	
	

}
