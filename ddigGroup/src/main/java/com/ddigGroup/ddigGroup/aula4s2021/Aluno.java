package com.ddigGroup.ddigGroup.aula4s2021;

import java.util.UUID;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Aluno {
	@Id
	private String id;
	private String ra;
	private String nome;
	private int idade;
	
	public Aluno() {
		this.id = UUID.randomUUID().toString();
	}

	public String getRa() {
		return ra;
	}

	public void setRa(String ra) {
		this.ra = ra;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public String getId() {
		return id;
	}
	
	

}
