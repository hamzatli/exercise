package com.entitygraph.exercise.controller;

import com.entitygraph.exercise.criteria.StudentCriteria;
import com.entitygraph.exercise.domain.Student;
import com.entitygraph.exercise.domain.StudentLanguage_;
import com.entitygraph.exercise.domain.Student_;
import com.entitygraph.exercise.domain.Teacher_;
import com.entitygraph.exercise.domain.dto.StudentDto;
import com.entitygraph.exercise.repository.StudentRepository;
import io.github.jhipster.service.QueryService;
import lombok.AllArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.persistence.criteria.JoinType;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by Ismayil Hamzatli on Aug, 2020
 */
@AllArgsConstructor
@RestController
@RequestMapping("/students")
public class Controller extends QueryService<Student> {
//
//    private final TeacherRepository teacherRepository;
//    private final StudentRepository studentRepository;
//    private final ClassRepository classRepository;
//
//    @PostConstruct
//    @Transactional
//    public void greet(){
//
//        Teacher teacher = new Teacher();
//        Student student1 = new Student();
//        Student student2 = new Student();
//
//        StudentQ studentQ1 = new StudentQ();
//        StudentQ studentQ2 = new StudentQ();
//
//        teacher.setTeacherName("Teacher 1");
//        student1.setStudentName("Student 1");
//        student1.setTeacher(teacher);
//        student2.setStudentName("Student 2");
//        student2.setTeacher(teacher);
//        studentQ1.setStudentName("Student 1");
//        studentQ1.setTeacher(teacher);
//        studentQ2.setStudentName("Student 2");
//        studentQ2.setTeacher(teacher);
//        teacher.setStudents(Arrays.asList(student1, student2));
//        teacher.setStudentQList(Arrays.asList(studentQ1,studentQ2));
////        Class clas = new Class();
////        clas.setClassName("className");
////        clas.setTeachers(teacher);
////       clas = classRepository.save(clas);
////        teacher.setAClass(clas);
//       Teacher t= teacherRepository.save(teacher);
//
//    }
//
//    @GetMapping
//    public Teacher getTeacher(){
//        Teacher teacher = teacherRepository.findById(3L).orElse(null);
//        return teacher;
//    }

    private final StudentRepository studentRepository;


    @GetMapping
    public List<StudentDto> getStudent(StudentCriteria studentCriteria) {
        ModelMapper modelMapper = new ModelMapper();
        return studentRepository.findAll(createSpecification(studentCriteria)).stream()
                .map(l -> {
                    StudentDto studentDto = new StudentDto();
                    studentDto.setId(l.getId());
                    studentDto.setAge(l.getAge());
                    return studentDto;
                }).collect(Collectors.toList());
    }


    private Specification<Student> createSpecification(StudentCriteria criteria) {
        Specification<Student> specification = Specification.where(null);
        if (criteria != null) {
            if (criteria.getId() != null) {
                specification = specification.and(buildSpecification(criteria.getId(), Student_.id));
            }
            if (criteria.getAge() != null) {
                specification = specification.and(buildSpecification(criteria.getAge(), Student_.age));
            }
            if (criteria.getGender() != null) {
                specification = specification.and(buildSpecification(criteria.getGender(), Student_.gender));
            }
            if (criteria.getStudentName() != null) {
                specification = specification.and(buildStringSpecification(criteria.getStudentName(), Student_.name));
            }
//            if (criteria.getTeacher() != null) {
//                specification = specification.and(buildSpecification(criteria.getTeacher(),
//                        root -> root.join(Student_.teacher, JoinType.LEFT).get(Teacher_.id)));
//            }
//            if (criteria.getLanguage() != null) {
//                specification = specification.and(buildSpecification(criteria.getLanguage(),
//                        root -> root.join(Student_.languages, JoinType.LEFT).get(StudentLanguage_.language)));
//            }

//            specification = specification.and((root, criteriaQuery, criteriaBuilder) ->
//                    criteriaQuery.where(criteriaQuery.get))

        }
        return specification;
    }

}
