package com.ddigGroup.ddigGroup.controllers;

import java.util.List;

import javax.persistence.MappedSuperclass;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;

import com.ddigGroup.ddigGroup.entidades.BaseEntidade;
import com.ddigGroup.ddigGroup.entidades.Funcionario;
import com.ddigGroup.ddigGroup.services.BaseService;
import com.ddigGroup.ddigGroup.services.FuncionarioService;


@MappedSuperclass
public class BaseController<SERVICE extends BaseService, ENTITY extends BaseEntidade>{
	
	
	@Autowired
	private SERVICE service;
	
	@GetMapping
	public List<ENTITY> obterTodos(){
		return service.obterTodos();
	}
	
	@GetMapping("/{id}")
	public BaseEntidade obterPeloId(@PathVariable("id")String id) {
		return service.obterPeloId(id);
	}
	
	@PostMapping
	@ResponseStatus(code = HttpStatus.CREATED)
	public String post(@RequestBody ENTITY novo) {
		return service.insert(novo);
		
	}
	
	@PutMapping("/{id}")
	public void atualizar(@PathVariable("id")String id, @RequestBody ENTITY entidade) {
		if(!id.equals(entidade.getId())) 
			throw new RequisicaoPutInvalida();
		
		service.atualizar(entidade);
		
	}

	@DeleteMapping("/{id}")
	public void excluirPeloId(@PathVariable("id")String id) {
		service.excluirPeloId(id);
	}
	

}
