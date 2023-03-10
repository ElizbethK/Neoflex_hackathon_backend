package ru.neoflex.hackaton.backend.service;

import org.modelmapper.ModelMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.neoflex.hackaton.backend.dto.*;
import ru.neoflex.hackaton.backend.entity.LessonTest;
import ru.neoflex.hackaton.backend.repository.TestRepository;

import java.util.ArrayList;
import java.util.List;

@Service
public class TestService {
    private static final Logger logger = LoggerFactory.getLogger(ru.neoflex.hackaton.backend.controller.TestController.class);
    @Autowired
    TestRepository testRepository;
    @Autowired
    ModelMapper modelMapper;
    @Autowired
    QuestionService questionService;
    @Autowired
    AnswerService answerService;


    public TestDto getTestDtoListByTestId(Long id){
        return convertTestListToTestDtoList(testRepository.findTestByTestId(id));
    }

    public TestDto convertTestListToTestDtoList(LessonTest lessonTest){
        TestDto testDto = new TestDto();
        testDto.setId(lessonTest.getLessonTestId());
        testDto.setTitle(lessonTest.getTitle());
        testDto.setQuestionDtoList(questionService.getQuestionDtoListByTestId(lessonTest.getLessonTestId()));
        return testDto;
    }

    public double calculateStudentResult(StudentsTestResultDto resultDto) {
        logger.info("Получен {}", resultDto);

        List<StudentQuestionAnswerDto> multipleChoiceQuestions = new ArrayList<>();
        List<StudentQuestionAnswerDto> singleChoiceQuestions = new ArrayList<>();

        //Достаем лист вопросов:
        List<StudentQuestionAnswerDto> questionsList = resultDto.getQuestionAnswerList();

        //Количество вопросов в тесте:
        int questionsQuantity = questionsList.size();

        //Проверить каждый вопрос на предмет наличия множественного выбора
        for(int i = 0; i < questionsQuantity; i++){

            //Из листа всех вопросов достаем вопрос и извлекаем его id
            StudentQuestionAnswerDto question = questionsList.get(i);
            Integer questionId = question.getQuestionId();

            //Смотрим количество верных вариантов ответов в этом вопросе
            Integer quantityOfRightVariants = answerService.defineQuantityOfRightVariants(questionId);


            //Если у вопроса более 1 правильного ответа, добавляем его в лист с вопросами с множественным выбором
            // иначе - в лист с 1 правильным вариантом
            if(quantityOfRightVariants > 1){
                multipleChoiceQuestions.add(question);
                logger.info("Вопрос с id = {} - c множественным выбором", questionId);
            } else {
                singleChoiceQuestions.add(question);
            logger.info("Вопрос с id = {} - c единственным вариантом", questionId);
            }
        } double studentResult = Double.valueOf(calculateResultInMultiplyChoice(multipleChoiceQuestions)
                + calculateResultInSingleChoice(singleChoiceQuestions));
        studentResult = (studentResult * 100)/questionsQuantity;

        return studentResult;
    }

    //Вычисление баллов за вопросы с множественными вариантами
    public Integer calculateResultInMultiplyChoice(List<StudentQuestionAnswerDto> multipleChoiceQuestions){
        int result = 0;
        List<ShortAnswerDto> answers = new ArrayList<>();
        for (StudentQuestionAnswerDto question : multipleChoiceQuestions) {
            //Смотрим количество верных вариантов ответов в этом вопросе
            Integer quantityOfRightVariants = answerService.defineQuantityOfRightVariants(question.getQuestionId());
            logger.info("количество верных вариантов ответов в question_id = {} = {}", question.getQuestionId(), quantityOfRightVariants);
               answers = question.getAnswers();
            for (ShortAnswerDto answer:answers) {
               result = result + answerService.getAnswerCosts(question.getQuestionId(), answer.getAnswerId());
            }
           if (result == quantityOfRightVariants){
                result = 1;
           } else result = 0;
        } return result;
    }

    //Вычисление баллов за вопросы с единственным верным вариантом
    public Integer calculateResultInSingleChoice(List<StudentQuestionAnswerDto> singleChoiceQuestions){
        int result = 0;
        List<ShortAnswerDto> answers = new ArrayList<>();
        for (StudentQuestionAnswerDto question : singleChoiceQuestions) {
            answers = question.getAnswers();
            for (ShortAnswerDto answer:answers) {
                result = result + answerService.getAnswerCosts(question.getQuestionId(), answer.getAnswerId());
            }
        } return result;
    }
}
