package com.ddigGroup.ddigGroup.entidades;

import java.util.UUID;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Id;



@Entity
public class Funcionario extends BaseEntidade {
	
	private String nome;
	private String CPF;
	private String telefone;
	private String Senha;
	private String email;
	
	@Enumerated(EnumType.STRING)
	private nivelAcesso nivelAcesso;
	
	

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
	
	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getSenha() {
		return Senha;
	}

	public void setSenha(String senha) {
		Senha = senha;
	}

	
}
