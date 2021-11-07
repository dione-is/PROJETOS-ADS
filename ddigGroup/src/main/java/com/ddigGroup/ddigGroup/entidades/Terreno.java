package com.ddigGroup.ddigGroup.entidades;

import java.util.UUID;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Terreno extends BaseEntidade{
	@Id
	private String id;
	
	private int lote;
	private float comprimento;
	private float largura;
	private float areaTotal;
	
	public Terreno() {
		this.id = UUID.randomUUID().toString();
	}

	public int getLote() {
		return lote;
	}

	public void setLote(int lote) {
		this.lote = lote;
	}

	public float getComprimento() {
		return comprimento;
	}

	public void setComprimento(float comprimento) {
		this.comprimento = comprimento;
	}

	public float getLargura() {
		return largura;
	}

	public void setLargura(float largura) {
		this.largura = largura;
	}

	public float getAreaTotal() {
		return areaTotal;
	}

	public void setAreaTotal() {
		this.areaTotal = this.comprimento * this.largura;
	}

	public String getId() {
		return id;
	}	
}
