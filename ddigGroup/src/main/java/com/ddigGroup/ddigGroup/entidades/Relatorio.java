package com.ddigGroup.ddigGroup.entidades;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class Relatorio extends BaseEntidade {
		
	@OneToOne
	@JoinColumn(name="analiseSolo_id")
	private AnaliseSolo analise;

	public AnaliseSolo getAnalise() {
		return analise;
	}

	public void setAnalise(AnaliseSolo analise) {
		this.analise = analise;
	}	
}
