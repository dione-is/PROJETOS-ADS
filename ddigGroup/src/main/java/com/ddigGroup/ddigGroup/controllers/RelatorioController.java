package com.ddigGroup.ddigGroup.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ddigGroup.ddigGroup.entidades.Relatorio;
import com.ddigGroup.ddigGroup.services.RelatorioService;

@RestController
@RequestMapping("api/relatorio")
public class RelatorioController extends BaseController<RelatorioService, Relatorio> {

}
