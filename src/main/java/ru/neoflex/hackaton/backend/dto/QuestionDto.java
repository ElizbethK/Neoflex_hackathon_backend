package ru.neoflex.hackaton.backend.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

import java.util.ArrayList;
import java.util.List;


@Data
@Setter
@Getter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class QuestionDto {
    private Long id;
    private String question;
    private List<AnswerDto> answerDtoList;

}
