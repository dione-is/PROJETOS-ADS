package com.ddigGroup.ddigGroup.services;

import java.util.List;
import java.util.NoSuchElementException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ddigGroup.ddigGroup.entidades.Funcionario;
import com.ddigGroup.ddigGroup.repositorys.FuncionarioRepository;




@Service
@Transactional
public class FuncionarioService {
	
	@Autowired
	private FuncionarioRepository repo;
	
	public List<Funcionario> obterTodos(){
			
		return repo.findAll();
	}
	
	public String insert(Funcionario novo) {
		if(repo.findById(novo.getId()).isPresent())
			throw new CreateJaExiste();
		
		novo = repo.save(novo);
		return novo.getId();
	}
	
	public void atualizar(Funcionario funcionario) {
		if(!repo.findById(funcionario.getId()).isPresent())
			throw new RegistroNaoExiste();
		
		repo.save(funcionario);
	}
	
	public Funcionario obterPeloId(String id) {
		try {
			return repo.findById(id).get();
		} catch (NoSuchElementException e) {
			throw new RegistroNaoExiste();
		}
	}
	
	public void excluirPeloId(String id) {
		try {
			Funcionario recuperado = repo.findById(id).get();
			repo.delete(recuperado);
		} catch (NoSuchElementException e) {
			throw new RegistroNaoExiste();
		}
	}
	
}
