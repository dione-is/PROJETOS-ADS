package com.ddigGroup.ddigGroup.entidades;

import java.util.Date;
import java.util.UUID;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Plantacao extends BaseEntidade {
	
	
	private String nomePlanta;
	private Terreno Terreno;
	private Date dataPlantio;
	private Date dataColheita;
	private CulturaPlanta culturaPlanta;
	

	public String getNomePlanta() {
		return nomePlanta;
	}

	public void setNomePlanta(String nomePlanta) {
		this.nomePlanta = nomePlanta;
	}

	public Terreno getTerreno() {
		return Terreno;
	}

	public void setTerreno(Terreno tamanhoTerreno) {
		Terreno = tamanhoTerreno;
	}

	public Date getDataPlantio() {
		return dataPlantio;
	}

	public void setDataPlantio(Date dataPlantio) {
		this.dataPlantio = dataPlantio;
	}

	public Date getDataColheita() {
		return dataColheita;
	}

	public void setDataColheita(Date dataColheita) {
		this.dataColheita = dataColheita;
	}

	public CulturaPlanta getCulturaPlanta() {
		return culturaPlanta;
	}

	public void setCulturaPlanta(CulturaPlanta culturaPlanta) {
		this.culturaPlanta = culturaPlanta;
	}

	
	
}
