package com.ddigGroup.ddigGroup.aula4s2021;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/aluno")
public class AlunoController {

	@Autowired
	private AlunoService service;
	
	@GetMapping
	public List<Aluno> obterTodos(){
		return service.obterTodos();
	}
	
	@PostMapping
	public String post(@RequestBody Aluno novo) {
		return service.insert(novo);
	}
}
