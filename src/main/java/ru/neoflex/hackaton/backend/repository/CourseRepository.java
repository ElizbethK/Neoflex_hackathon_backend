package ru.neoflex.hackaton.backend.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import ru.neoflex.hackaton.backend.entity.Course;


import java.util.List;
import java.util.Optional;

@Repository
public interface CourseRepository extends JpaRepository<Course, Long> {
    Optional<Course> findById(Long id);

    @Query(value = "SELECT * from course where course_id =:courseId ", nativeQuery = true)
    Course findCourseByCourseId(Long courseId);

    @Query(value = "select exists(select * from course where course_id=:id) ", nativeQuery = true)
    Boolean isExistCourseById(Long id);

    List<Course> findAll();

    @Query(value = "select * from course c join tag t on c.course_id = t.course_id \n" +
            "where t.tag_name LIKE %:tagOrTitle% or c.title LIKE %:tagOrTitle% ", nativeQuery = true)
    List<Course> findByTagOrTitle(String tagOrTitle);

}
