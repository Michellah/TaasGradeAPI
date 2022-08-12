package com.taas.TaasGradeApi.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "grade")
public class Grade implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private  int id_grade;

    @OneToOne
    @JoinColumn(name = "id_candidate", nullable = false)
    private  Candidate candidate;

    @OneToOne
    @JoinColumn(name = "id_french", nullable = false)
    private  Grade_french grade_french;

    @OneToOne
    @JoinColumn(name = "id_math", nullable = false)
    private  Grade_math grade_math;

}
