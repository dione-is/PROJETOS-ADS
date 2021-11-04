package com.ddigGroup.ddigGroup.aula4s2021;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

@Service
@Transactional
public class AlunoService {

	@Autowired
	private AlunoRepository repo;
	
	public List<Aluno> obterTodos(){
		return repo.findAll();
	}
	
	public String insert( Aluno novo) {
		if(repo.findById(novo.getId()).isPresent())
			throw new CreateJaaExiste();
		
		novo = repo.save(novo);
		return novo.getId();
	}
}
