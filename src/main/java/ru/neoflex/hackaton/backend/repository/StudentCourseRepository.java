package ru.neoflex.hackaton.backend.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import ru.neoflex.hackaton.backend.entity.StudentCourse;

import java.util.List;
import java.util.Optional;

@Repository
public interface StudentCourseRepository extends CrudRepository<StudentCourse, Long> {
    Optional<StudentCourse> findById(Long id);

    @Query(value = "INSERT INTO student_course (student_id, course_id ) VALUES ( 1 , 1 ) ", nativeQuery = true)
    void write(@Param("studentId") long studentId , @Param("courseId") long courseId );

    @Query(value = "select distinct course_id from student_course where student_id =:id ", nativeQuery = true)
    List<Long> getStudentsCourseId(Long id);
}
