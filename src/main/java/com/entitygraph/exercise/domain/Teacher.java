package com.entitygraph.exercise.domain;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

/**
 * Created by Ismayil Hamzatli on Aug, 2020
 */
@Data
@Entity
@Table(name = "teacher")
public class Teacher {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

//    @OneToMany(mappedBy = "teacher", cascade = CascadeType.ALL)
//    private List<Student> students;

}
