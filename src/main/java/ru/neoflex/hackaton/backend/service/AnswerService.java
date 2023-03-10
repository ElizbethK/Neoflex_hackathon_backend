package ru.neoflex.hackaton.backend.service;

import org.modelmapper.ModelMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.neoflex.hackaton.backend.dto.AnswerDto;
import ru.neoflex.hackaton.backend.entity.Answer;
import ru.neoflex.hackaton.backend.repository.AnswerRepository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class AnswerService {
    private static final Logger logger = LoggerFactory.getLogger(ru.neoflex.hackaton.backend.controller.TestController.class);

    @Autowired
    AnswerRepository answerRepository;

    @Autowired
    ModelMapper modelMapper;


    public int getAnswerCosts(int questionId, int answerId){
        return answerRepository.getValueOfAnswer(questionId, answerId);
    }

    public List<Answer> getAnswersByQuestionId(Long id){
        return  answerRepository.findAnswersByQuestionId(id);
    }

    public List<AnswerDto> getAnswerDtoListByQuestionId(Long id){
         return convertAnswerToAnswerDtoList(answerRepository.findAnswersByQuestionId(id));
    }

    public AnswerDto getAnswerById(Long id){
        Optional<Answer> answer = answerRepository.findById(id);
        return convertToAnswerDto(answer);
    }


    public List<AnswerDto> convertAnswerToAnswerDtoList(List<Answer> answerList){
        List<AnswerDto> answerDtoList = new ArrayList<>();
        for (Answer answer:answerList) {
            AnswerDto answerDto = new AnswerDto(answer.getAnswerId(), answer.getVariant());
            answerDtoList.add(answerDto);
        }
        return answerDtoList;
    }

    public Integer defineQuantityOfRightVariants(Integer questionId){
        return answerRepository.getQuantityOfRightVariants(questionId);
    }

    public AnswerDto convertToAnswerDto(Optional<Answer> answer) {
        return modelMapper.map(answer, AnswerDto.class);
    }
}
