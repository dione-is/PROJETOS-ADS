package com.ddigGroup.ddigGroup.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ddigGroup.ddigGroup.entidades.AnaliseSolo;
import com.ddigGroup.ddigGroup.services.AnaliseSoloService;

@RestController
@RequestMapping("/api/analiseSolo")
public class AnaliseController extends BaseController<AnaliseSoloService, AnaliseSolo> {

}
