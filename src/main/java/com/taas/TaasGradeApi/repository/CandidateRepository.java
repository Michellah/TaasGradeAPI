package com.taas.TaasGradeApi.repository;

import com.taas.TaasGradeApi.model.Candidate;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.data.repository.query.Param;


@EnableJpaRepositories
public interface CandidateRepository extends JpaRepository<Candidate,Long> {

    @Query("select c from Candidate c where c.first_name like CONCAT('%',:name,'%')")
    Candidate findByname(@Param("name") String firstname);
}