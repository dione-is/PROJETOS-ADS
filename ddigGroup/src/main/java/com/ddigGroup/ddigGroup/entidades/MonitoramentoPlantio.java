package com.ddigGroup.ddigGroup.entidades;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class MonitoramentoPlantio extends BaseEntidade {
	
	@OneToOne
	@JoinColumn(name = "plantacao_id")
	private Plantacao plantacao;
	
	@Column(nullable = false)
	private float progressoPlanta;
	
	@Column(nullable = false)
	private String faseAtualCultivo;
	
	
	public float getProgressoPlanta() {
		return progressoPlanta;
	}
	
	public void setProgressoPlanta(float progressoPlanta) {
		this.progressoPlanta = progressoPlanta;
	}
	
	public String getFaseAtualCultivo() {
		return faseAtualCultivo;
	}
	
	public void setFaseAtualCultivo(String faseAtualCultivo) {
		this.faseAtualCultivo = faseAtualCultivo;
	}
	
	public Plantacao getPlantacao() {
		return plantacao;
	}
	
	public void setPlantacao(Plantacao plantacao) {
		this.plantacao = plantacao;
	}	
}
