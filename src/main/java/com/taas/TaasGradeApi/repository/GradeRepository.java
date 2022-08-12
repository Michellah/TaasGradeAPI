package com.taas.TaasGradeApi.repository;

import com.taas.TaasGradeApi.model.Grade;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GradeRepository extends JpaRepository<Grade,Long> {

}
