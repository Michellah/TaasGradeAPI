package com.taas.TaasGradeApi.service;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@Getter
public class AverageObject {
     Grade AverageGrade(float grade_bacc,float grade_competition,float min_passed_value,float min_math_value){
        Grade grade = new Grade();
        grade.setPassed(true);
        float total = (grade_bacc+grade_competition)/2;
        grade.setTotal(total);
        if(total<min_passed_value || grade_bacc<min_math_value){
            grade.setPassed(false);
        }
        return grade;
    }

}
