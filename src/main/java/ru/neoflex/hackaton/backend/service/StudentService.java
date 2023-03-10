package ru.neoflex.hackaton.backend.service;

import org.modelmapper.ModelMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.neoflex.hackaton.backend.dto.StudentDto;
import ru.neoflex.hackaton.backend.entity.Student;
import ru.neoflex.hackaton.backend.repository.StudentRepository;

import java.util.Optional;


@Service
public class StudentService {
    private static final Logger logger = LoggerFactory.getLogger(StudentService.class);

    @Autowired
    private ModelMapper modelMapper;
    @Autowired
    private StudentRepository studentRepository;

    public Student getById(Long studentId) {
        logger.info("Передан id = {}", studentId);
        Optional<Student> optionalStudent = studentRepository.findById(studentId);
        logger.info("Найден {} ", optionalStudent);

        Student student = optionalStudent.get();
        logger.info("Распечатан {}", student);
        return student;
    }

    public StudentDto convertToStudentDto(Student student) {
        return modelMapper.map(student, StudentDto.class);
    }

}
