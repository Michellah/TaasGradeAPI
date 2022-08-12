package com.taas.TaasGradeApi.model;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table
public class Grade_math implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id_math;
    @Column(columnDefinition = "float default 0.0")
    private float grade_bacc;
    @Column(columnDefinition = "float default 0.0")
    private float grade_competition;
}

