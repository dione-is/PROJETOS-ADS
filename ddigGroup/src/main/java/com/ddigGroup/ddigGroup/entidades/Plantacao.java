package com.ddigGroup.ddigGroup.entidades;

import java.util.Date;
import java.util.UUID;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import org.hibernate.engine.internal.Cascade;


@Entity
public class Plantacao extends BaseEntidade {
	
	@Column(nullable = false)
	private String nomePlanta;
	
	@OneToOne
	@JoinColumn(name = "terreno_id")
	private Terreno terreno;
	
	@Column(nullable = false)
	private Date dataPlantio;
	
	@Column(nullable = false)
	private Date dataColheita;
	
	@ManyToOne
	@JoinColumn(name = "cultura_id")
	private CulturaPlanta culturaPlanta;
	
	public String getNomePlanta() {
		return nomePlanta;
	}

	public void setNomePlanta(String nomePlanta) {
		this.nomePlanta = nomePlanta;
	}

	public Terreno getTerreno() {
		return terreno;
	}

	public void setTerreno(Terreno tamanhoTerreno) {
		this.terreno = tamanhoTerreno;
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
