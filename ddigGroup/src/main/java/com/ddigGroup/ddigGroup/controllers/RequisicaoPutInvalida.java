package com.ddigGroup.ddigGroup.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.BAD_REQUEST)
public class RequisicaoPutInvalida extends RuntimeException {

}
