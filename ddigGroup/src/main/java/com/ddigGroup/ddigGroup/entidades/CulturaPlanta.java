package com.ddigGroup.ddigGroup.entidades;

import java.util.UUID;

import javax.persistence.Entity;
import javax.persistence.Id;



@Entity
public class CulturaPlanta extends BaseEntidade{
	
	private String nome;
	private String caracteristicas;
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
