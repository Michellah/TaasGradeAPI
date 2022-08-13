package com.taas.TaasGradeApi.model;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "grade_french")

public class Grade_french implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(nullable = false)
    private long id_french;
    @Column(columnDefinition = "float default 0.0")
    private float grade_bacc;
    @Column(columnDefinition = "float default 0.0")
    private float grade_competition;
}

