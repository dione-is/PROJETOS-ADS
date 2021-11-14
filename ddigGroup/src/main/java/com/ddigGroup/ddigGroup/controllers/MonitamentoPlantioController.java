package com.ddigGroup.ddigGroup.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ddigGroup.ddigGroup.entidades.MonitoramentoPlantio;
import com.ddigGroup.ddigGroup.services.MonitoramentoPlantioService;
@RestController
@RequestMapping("/api/monitoramentoPlantio")
public class MonitamentoPlantioController extends BaseController<MonitoramentoPlantioService, MonitoramentoPlantio>{

}
