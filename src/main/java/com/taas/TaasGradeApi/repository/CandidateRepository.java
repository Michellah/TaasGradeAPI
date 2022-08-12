package com.taas.TaasGradeApi.repository;

import com.taas.TaasGradeApi.model.Candidate;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
@EnableJpaRepositories
public interface CandidateRepository extends JpaRepository<Candidate,Long> {
}