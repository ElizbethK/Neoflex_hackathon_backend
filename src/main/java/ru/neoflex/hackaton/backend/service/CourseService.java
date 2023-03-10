package ru.neoflex.hackaton.backend.service;

import org.modelmapper.ModelMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.neoflex.hackaton.backend.dto.CourseDto;
import ru.neoflex.hackaton.backend.dto.ShortCourseDTO;
import ru.neoflex.hackaton.backend.dto.ShortLessonDto;
import ru.neoflex.hackaton.backend.entity.Course;
import ru.neoflex.hackaton.backend.entity.Lesson;
import ru.neoflex.hackaton.backend.entity.Teacher;
import ru.neoflex.hackaton.backend.repository.CourseRepository;
import ru.neoflex.hackaton.backend.repository.LessonRepository;
import ru.neoflex.hackaton.backend.repository.StudentCourseRepository;
import ru.neoflex.hackaton.backend.repository.TeacherRepository;
import ru.neoflex.hackaton.backend.util.MapperUtil;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class CourseService {
    private static final Logger logger = LoggerFactory.getLogger(CourseService.class);
    @Autowired
    private CourseRepository courseRepository;
    @Autowired
    private TeacherRepository teacherRepository;
    @Autowired
    private LessonRepository lessonRepository;
    @Autowired
    private StudentCourseRepository studentCourseRepository;
    @Autowired
    private ModelMapper modelMapper;

    public Course getCourseByCourseId(Long id){
        return courseRepository.findCourseByCourseId(id);
    }


    public Course getCourseById(Long courseId) {
        logger.info("Передан id = {}", courseId);
       Course course = courseRepository.findCourseByCourseId(courseId);
        return course;
    }

    public List<Course> getAll(){
        return courseRepository.findAll();
    }


    public List<ShortCourseDTO> getAllShortCourses(){
        List<Course> courses = courseRepository.findAll();
        return convertToShortCourseDtoList(courses);
    }

    public List<ShortCourseDTO> getByTagOrTitle(String tagOrTitle){
        List<Course> courses = courseRepository.findByTagOrTitle(tagOrTitle);
        return convertToShortCourseDtoList(courses);
    }


    public List<ShortCourseDTO>  getAllStudentsCoursesId(Long studentId){
        logger.info("Получен id = {}", studentId);
        List<Long> coursesId = studentCourseRepository.getStudentsCourseId(studentId);

        logger.info("Получен массив из id курсов студента {}", coursesId);
        List<Course> courses = new ArrayList<>();
        int size = coursesId.size();
        logger.info("Количество курсов студента = {}", size);
        for(int i = 0; i < size; i++){
            courses.add(getCourseById(coursesId.get(i)));
        }
        return convertToShortCourseDtoList(courses);
    }

//-------------------------------------//

    public List<ShortCourseDTO> convertToShortCourseDtoList(List<Course> courses){
        List<ShortCourseDTO> allShortCourses = new ArrayList<>();
        int size = courses.size();
        for(int i  = 0; i < size; i++ ){
            Course course = courses.get(i);
            ShortCourseDTO shortCourseDTO = new ShortCourseDTO();
            shortCourseDTO.setId(course.getCourseId());
            shortCourseDTO.setTitle(course.getTitle());
            shortCourseDTO.setHours(course.getHours());
            Long teacherId = course.getTeacher().getTeacherId();
            Optional<Teacher> optionalTeacher = teacherRepository.findById(teacherId);
            shortCourseDTO.setTeacherInfo(optionalTeacher.get());
            shortCourseDTO.setAvailable(course.isAvailable());
            shortCourseDTO.setImage(course.getImage());

            allShortCourses.add(shortCourseDTO);
        }
        return allShortCourses;
    }

    public CourseDto convertToCourseDto(Course course){
        CourseDto courseDto = new CourseDto();
        courseDto.setId(course.getCourseId());
        courseDto.setTitle(course.getTitle());
        courseDto.setHours(course.getHours());
        Long teacherId = course.getTeacher().getTeacherId();
        Optional<Teacher> optionalTeacher = teacherRepository.findById(teacherId);
        courseDto.setTeacherInfo(optionalTeacher.get());
        courseDto.setAvailable(course.isAvailable());
        courseDto.setImage(course.getImage());
        courseDto.setDateOfPublishing(String.valueOf(course.getDateOfPublishing()));
        List<Lesson> lessons = lessonRepository.findAllByCourseId(course.getCourseId());
        courseDto.setLesson(convertToShortLessonDtoList(lessons));
        return courseDto;
    }

    public List<ShortLessonDto> convertToShortLessonDtoList(List<Lesson> lessons){
        List<ShortLessonDto> allShortLessons = new ArrayList<>();
        for (Lesson lesson:lessons) {
            ShortLessonDto shortLessonDto = new ShortLessonDto();
            shortLessonDto.setId(lesson.getLessonId());
            shortLessonDto.setTitle(lesson.getTitle());

            allShortLessons.add(shortLessonDto);
        }
        return allShortLessons;
    }

    public List<ShortLessonDto> getAllLessons() {
        List<Lesson> lessons = lessonRepository.findAll();
        return MapperUtil.convertList(lessons,this::convertToShortLessons);
    }

    public List<Lesson> getAllLessonsByCourseId(Long courseId) {
        return lessonRepository.findAllByCourseId(courseId);
    }

    private ShortLessonDto convertToShortLessons(Lesson lesson) {
        return modelMapper.map(lesson, ShortLessonDto.class);
    }

}
