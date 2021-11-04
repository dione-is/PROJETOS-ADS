package com.ddigGroup.ddigGroup.aula4s2021;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(code = HttpStatus.BAD_REQUEST)
public class CreateJaaExiste extends RuntimeException {

}
