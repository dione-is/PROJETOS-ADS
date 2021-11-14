package com.ddigGroup.ddigGroup.entidades;

import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.Entity;


@Entity
public class CulturaPlanta extends BaseEntidade{
	
	@Column(nullable = false)
	private String nome;
	
	@Column(nullable = false)
	private String caracteristicas;
	
	@Column(nullable = false)
	private String requisitosNPK;
	
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCaracteristicas() {
		return caracteristicas;
	}

	public void setCaracteristicas(String caracteristicas) {
		this.caracteristicas = caracteristicas;
	}

	public String getRequisitosNPK() {
		return requisitosNPK;
	}

	public void setRequisitosNPK(String requisitosNPK) {
		this.requisitosNPK = requisitosNPK;
	}
}
