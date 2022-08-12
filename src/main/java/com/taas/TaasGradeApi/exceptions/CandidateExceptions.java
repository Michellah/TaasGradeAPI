package com.taas.TaasGradeApi.exceptions;


import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;


@ResponseStatus(HttpStatus.NOT_FOUND)
public class CandidateExceptions extends RuntimeException{
    public CandidateExceptions(String error){
        super(error);
    }
}
