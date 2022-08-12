package com.taas.TaasGradeApi.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.BAD_REQUEST)
public class RequestExceptions extends RuntimeException {
    public RequestExceptions(String error) {

        super(error);
    }
}
