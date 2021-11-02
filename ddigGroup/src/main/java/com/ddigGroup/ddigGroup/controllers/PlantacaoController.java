package com.ddigGroup.ddigGroup.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ddigGroup.ddigGroup.entidades.Plantacao;
import com.ddigGroup.ddigGroup.services.PlantacaoService;

@RestController
@RequestMapping("/api/plantacao")
public class PlantacaoController extends BaseController<PlantacaoService, Plantacao> {

}
