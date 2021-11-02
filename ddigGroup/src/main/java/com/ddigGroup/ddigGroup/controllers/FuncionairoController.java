package com.ddigGroup.ddigGroup.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.ddigGroup.ddigGroup.entidades.Funcionario;
import com.ddigGroup.ddigGroup.services.FuncionarioService;

@RestController
@RequestMapping("/api/funcionario")
public class FuncionairoController {
	
	@Autowired
	private FuncionarioService service;
	
	@GetMapping
	public List<Funcionario> obterTodos(){
		return service.obterTodos();
	}
	
	@GetMapping("/{id}")
	public Funcionario obterPeloId(@PathVariable("id")String id) {
		return service.obterPeloId(id);
	}
	
	@PostMapping
	@ResponseStatus(code = HttpStatus.CREATED)
	public String post(@RequestBody Funcionario novo) {
		return service.insert(novo);
		
	}
	
	@PutMapping
	public void atualizar(@PathVariable("id")String id, @RequestBody Funcionario funcionario) {
		if(!id.equals(funcionario.getId())) 
			throw new RequisicaoPutInvalida();
		
		service.atualizar(funcionario);
		
	}

	@DeleteMapping("/{id")
	public void excluirPeloId(@PathVariable("id")String id) {
		service.excluirPeloId(id);
	}
}
