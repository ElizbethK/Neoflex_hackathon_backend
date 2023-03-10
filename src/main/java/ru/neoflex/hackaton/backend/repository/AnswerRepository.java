package ru.neoflex.hackaton.backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import ru.neoflex.hackaton.backend.entity.Answer;

import java.util.List;



@Repository
public interface AnswerRepository extends JpaRepository<Answer, Long> {

    @Query(value = "SELECT * from answer where question_id = :questionId ", nativeQuery = true)
    List<Answer> findAnswersByQuestionId(Long questionId);

    @Query(value = "SELECT * FROM public.check_question( :questionId , :answerId )", nativeQuery = true)
    int getValueOfAnswer(@Param("questionId") int questionId, @Param("answerId") int answerId);

    @Query(value = "SELECT * FROM public.check_quantity_answers( :questionId )",nativeQuery = true)
    Integer getQuantityOfRightVariants(@Param("questionId") Integer questionId);
}
