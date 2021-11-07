package com.ddigGroup.ddigGroup.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ddigGroup.ddigGroup.entidades.Terreno;
import com.ddigGroup.ddigGroup.services.TerrenoService;

@RestController
@RequestMapping("/api/Terreno")
public class TerrenoController extends BaseController<TerrenoService, Terreno>{

}
