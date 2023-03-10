package ru.neoflex.hackaton.backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import ru.neoflex.hackaton.backend.entity.Question;

import java.util.List;

@Repository
public interface QuestionRepository extends JpaRepository<Question, Long> {
    @Query(value = "SELECT  * from question where lesson_test_id = :testId ", nativeQuery = true)
    List<Question> findQuestionsByTestId(Long testId);

}
