package com.taas.TaasGradeApi.service;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
public class AveragePerCompetition {
    float AverageCompetition(float total,float avg){
        return total/avg;
    }
}
