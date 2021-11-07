package com.ddigGroup.ddigGroup.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ddigGroup.ddigGroup.entidades.CulturaPlanta;
import com.ddigGroup.ddigGroup.services.CulturaPlantaService;

@RestController
@RequestMapping("/api/culturaPlanta")
public class CulturaController extends BaseController<CulturaPlantaService, CulturaPlanta>{

}
