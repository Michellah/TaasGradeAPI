package com.taas.TaasGradeApi.service;

import com.taas.TaasGradeApi.model.Candidate;
import com.taas.TaasGradeApi.repository.CandidateRepository;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.Optional;

@Service
@AllArgsConstructor
public class updatecandidate {
    @Autowired
    private final CandidateRepository candidateRepository;


    public Optional<Candidate> findByid(Long id){
        return candidateRepository.findById(id);
    }
    public Candidate updatecandidate(Candidate candidate){
        return candidateRepository.save(candidate);
    }
}
