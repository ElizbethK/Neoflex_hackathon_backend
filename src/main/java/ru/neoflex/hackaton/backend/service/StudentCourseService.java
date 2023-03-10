package ru.neoflex.hackaton.backend.service;


import org.modelmapper.ModelMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import ru.neoflex.hackaton.backend.dto.EnrollStudentDto;
import ru.neoflex.hackaton.backend.dto.StudentCourseDto;
import ru.neoflex.hackaton.backend.entity.StudentCourse;
import ru.neoflex.hackaton.backend.repository.StudentCourseRepository;

import java.util.List;

@Service
public class StudentCourseService {
    private static final Logger logger = LoggerFactory.getLogger(StudentCourseService.class);
    @Autowired
    StudentCourseRepository studentCourseRepository;
    @Autowired
    private ModelMapper modelMapper;
    @Autowired
    StudentService studentService;
    @Autowired
    CourseService courseService;

    public StudentCourse getById(Long id){
        return (studentCourseRepository.findById(id)).get();
    }


    public ResponseEntity<String> joinTheCourse(EnrollStudentDto enrollStudentDto){
        logger.info("Получен {}", enrollStudentDto);

        Long studentId = enrollStudentDto.getStudentId();
        logger.info("Получен id студента {}", studentId);

        Long courseId = enrollStudentDto.getCourseId();
        logger.info("Получен id курса {}", courseId);
            return ResponseEntity.ok("OK, Вы записаны на курс");
    }

    public StudentCourseDto convertToStudentDto(StudentCourse studentCourse) {
        return modelMapper.map(studentCourse, StudentCourseDto.class);
    }

    public List<Long> findStudentsCourseId(Long id){
        return studentCourseRepository.getStudentsCourseId(id);
    }

}
