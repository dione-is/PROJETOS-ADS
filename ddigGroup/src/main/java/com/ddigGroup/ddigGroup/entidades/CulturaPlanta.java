package com.ddigGroup.ddigGroup.entidades;

import java.util.UUID;

import javax.persistence.Entity;
import javax.persistence.Id;



@Entity
public class CulturaPlanta extends BaseEntidade{
	@Id
	private String id;
	private String nome;
	private String caracteristicas;
	private String requisitosNPK;
	
	public CulturaPlanta() {
		this.id = UUID.randomUUID().toString();
		
	}

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

	public String getId() {
		return id;
	}	
}
