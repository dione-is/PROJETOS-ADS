package com.ddigGroup.ddigGroup.entidades;

import java.util.UUID;

import javax.persistence.Entity;
import javax.persistence.Id;



@Entity
public class Funcionario {
	@Id
	private String id;
	private String nome;
	private String CPF;
	private String email;
	private nivelAcesso nivelAcesso;
	
	public Funcionario() {
		id = UUID.randomUUID().toString();
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCPF() {
		return CPF;
	}

	public void setCPF(String cPF) {
		CPF = cPF;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public nivelAcesso getNivelAcesso() {
		return nivelAcesso;
	}

	public void setNivelAcesso(nivelAcesso nivelAcesso) {
		this.nivelAcesso = nivelAcesso;
	}

	public String getId() {
		return id;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Funcionario other = (Funcionario) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
}
