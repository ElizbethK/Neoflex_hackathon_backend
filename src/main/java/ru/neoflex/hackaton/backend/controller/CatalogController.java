package ru.neoflex.hackaton.backend.controller;

import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import ru.neoflex.hackaton.backend.dto.*;
import ru.neoflex.hackaton.backend.entity.Course;
import ru.neoflex.hackaton.backend.service.CourseService;
import ru.neoflex.hackaton.backend.service.StudentCourseService;
import ru.neoflex.hackaton.backend.service.StudentService;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class CatalogController {
    private static final Logger logger = LoggerFactory.getLogger(CatalogController.class);
    @Autowired
    private CourseService courseService;
    @Autowired
    private StudentService studentService;
    @Autowired
    private StudentCourseService studentCourseService;
    @Autowired
    ModelMapper modelMapper;

    @GetMapping
    public String test(){
        return "hello";
    }

    @GetMapping("/catalog")
    public List<ShortCourseDTO> getAllCourses(){
        return courseService.getAllShortCourses();
    }

    @GetMapping("/catalog/{course_id}")
    public CourseDto getCourseById(@PathVariable(value = "course_id") Long courseId){
        Course course = courseService.getCourseById(courseId);
        CourseDto courseDto = courseService.convertToCourseDto(course);
        return courseDto;
    }

    @GetMapping("/search/{text}")
    public List<ShortCourseDTO> getByTagOrTitle(@PathVariable String text){
        return courseService.getByTagOrTitle(text);
    }

    @GetMapping("/lk/{studentId}")
    public List<ShortCourseDTO> getAllStudentCourses(@PathVariable(value = "studentId") Long studentId){
        return courseService.getAllStudentsCoursesId(studentId);
    }

    @PostMapping("/enroll")
    public ResponseEntity<String> joinStudentToTheCourse(@RequestBody EnrollStudentDto enrollStudentDto){
        return studentCourseService.joinTheCourse(enrollStudentDto);
    }

}
