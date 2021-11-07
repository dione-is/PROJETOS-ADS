package com.ddigGroup.ddigGroup.entidades;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class MonitoramentoPlantio extends BaseEntidade {
	@Id
	private String id;
	private float progressoPlanta;
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
	public String getId() {
		return id;
	}
	
	
}
