package com.taas.TaasGradeApi.controller;

import com.taas.TaasGradeApi.exceptions.CandidateExceptions;
import com.taas.TaasGradeApi.model.Candidate;
import com.taas.TaasGradeApi.repository.CandidateRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CandidateController {

    @Autowired
    private CandidateRepository Candidate_Repository;


    @GetMapping("/")
    public String hello(){
        return "Hello wolrd";
    }

    @GetMapping("/all")
    public List<Candidate> getAll(){
        return this.Candidate_Repository.findAll();
    }

    @GetMapping("/all/{id}")
    public Candidate getCandidateById(@PathVariable(value = "id") Long id){
        return this.Candidate_Repository.findById(id).orElseThrow(()-> new CandidateExceptions("Candidate not submited"));
    }
}
