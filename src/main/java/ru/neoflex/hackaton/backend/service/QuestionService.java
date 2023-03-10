package ru.neoflex.hackaton.backend.service;

import org.modelmapper.ModelMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.neoflex.hackaton.backend.dto.QuestionDto;
import ru.neoflex.hackaton.backend.entity.Question;
import ru.neoflex.hackaton.backend.repository.QuestionRepository;

import java.util.ArrayList;
import java.util.List;

@Service
public class QuestionService {
    private static final Logger logger = LoggerFactory.getLogger(ru.neoflex.hackaton.backend.controller.TestController.class);

    @Autowired
    QuestionRepository questionRepository;
    @Autowired
    ModelMapper modelMapper;
    @Autowired
    AnswerService answerService;


    public List<Question> getQuestionsByTestId(Long id){
        return  questionRepository.findQuestionsByTestId(id);
    }

    public List<QuestionDto> getQuestionDtoListByTestId(Long id){
        return  convertAnswerToAnswerDtoList(questionRepository.findQuestionsByTestId(id));
    }

    public List<QuestionDto> convertAnswerToAnswerDtoList(List<Question> questionList){
        List<QuestionDto> questionDtoList = new ArrayList<>();
        for (Question question:questionList) {
            QuestionDto questionDto = new QuestionDto();
            questionDto.setId(question.getQuestionId());
            questionDto.setQuestion(question.getTitle());
            questionDto.setAnswerDtoList(answerService.getAnswerDtoListByQuestionId(question.getQuestionId()));

            questionDtoList.add(questionDto);
        }
        return questionDtoList;
    }

}
