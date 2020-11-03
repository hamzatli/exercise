package com.entitygraph.exercise.domain;

import lombok.Data;

import javax.persistence.*;

/**
 * Created by Ismayil Hamzatli on Nov, 2020
 */
@Data
public class StudentLanguage {
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    @Enumerated(value = EnumType.STRING)
    private Language language;

    @ManyToOne
    private Student student;
}
