package com.ddigGroup.ddigGroup.services;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(code = HttpStatus.BAD_REQUEST)
public class CreateJaExiste extends RuntimeException {

}
