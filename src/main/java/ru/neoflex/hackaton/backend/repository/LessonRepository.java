package ru.neoflex.hackaton.backend.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import ru.neoflex.hackaton.backend.entity.Lesson;


import java.util.List;
import java.util.Optional;


@Repository
public interface LessonRepository extends JpaRepository<Lesson, Long> {
    Optional<Lesson> findById(Long id);

    List<Lesson> findAll();

    @Query(value = "SELECT * from lesson where course_id =:courseId ", nativeQuery = true)
    List<Lesson> findAllByCourseId(Long courseId);


    @Query(value = "SELECT * from lesson l join lesson_test lt\n" +
            "    on l.lesson_test_id = lt.lesson_test_id\n" +
            "    where l.lesson_id =:lessonId ", nativeQuery = true)
    List<Lesson> findAllByLessonIdIsFinished(Long lessonId);
}
