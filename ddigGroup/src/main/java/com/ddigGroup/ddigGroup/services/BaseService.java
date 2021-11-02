package com.ddigGroup.ddigGroup.services;

import java.util.List;
import java.util.NoSuchElementException;

import javax.persistence.MappedSuperclass;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;

import com.ddigGroup.ddigGroup.entidades.BaseEntidade;
import com.ddigGroup.ddigGroup.entidades.Funcionario;
import com.ddigGroup.ddigGroup.repositorys.FuncionarioRepository;

@MappedSuperclass
public class BaseService<ENTITY extends BaseEntidade, REPO extends JpaRepository<ENTITY, String>>  {
	
	@Autowired
	private REPO repo;
	
	public List<ENTITY> obterTodos(){
			
		return repo.findAll();
	}
	
	public String insert(ENTITY novo) {
		if(repo.findById(novo.getId()).isPresent())
			throw new CreateJaExiste();
		
		novo = repo.save(novo);
		return novo.getId();
	}
	
	public void atualizar(ENTITY entidade) {
		if(!repo.findById(entidade.getId()).isPresent())
			throw new RegistroNaoExiste();
		
		repo.save(entidade);
	}
	
	public ENTITY obterPeloId(String id) {
		try {
			return repo.findById(id).get();
		} catch (NoSuchElementException e) {
			throw new RegistroNaoExiste();
		}
	}
	
	public void excluirPeloId(String id) {
		try {
			ENTITY recuperado = repo.findById(id).get();
			repo.delete(recuperado);
		} catch (NoSuchElementException e) {
			throw new RegistroNaoExiste();
		}
	}

}
