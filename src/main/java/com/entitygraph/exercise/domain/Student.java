package com.entitygraph.exercise.domain;

import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

/**
 * Created by Ismayil Hamzatli on Aug, 2020
 */
@Getter
@Setter
@NoArgsConstructor
@Entity
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private int age;
    @Enumerated(value = EnumType.STRING)
    private Gender gender;

//    @ManyToOne(fetch = FetchType.LAZY)
//    private Teacher teacher;
//
//    @OneToMany(mappedBy = "student")
//    private List<StudentLanguage> languages;
}
