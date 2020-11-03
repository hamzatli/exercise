package com.entitygraph.exercise.domain.dto;

import com.entitygraph.exercise.domain.Language;
import lombok.Data;

/**
 * Created by Ismayil Hamzatli on Nov, 2020
 */
@Data
public class StudentDto {

    private Long id;
    private int age;
    private String name;
    private Language language;
//    private TeacherDto teacher;
}
