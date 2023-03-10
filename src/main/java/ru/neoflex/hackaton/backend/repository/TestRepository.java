package ru.neoflex.hackaton.backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import ru.neoflex.hackaton.backend.entity.LessonTest;


@Repository
public interface TestRepository extends JpaRepository<LessonTest, Long> {

    @Query(value = "SELECT  * from lesson_test where lesson_test_id = :testId ", nativeQuery = true)
    LessonTest findTestByTestId(Long testId);
}
