package com.entitygraph.exercise.repository;

import com.entitygraph.exercise.domain.Teacher;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by Ismayil Hamzatli on Aug, 2020
 */
@Repository
public interface TeacherRepository extends JpaRepository<Teacher, Long> {


}
