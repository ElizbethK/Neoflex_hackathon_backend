package ru.neoflex.hackaton.backend.dto;

import lombok.*;

import java.util.List;

@Data
@Setter
@Getter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class StudentQuestionAnswerDto {
    private int questionId;
    private List<ShortAnswerDto> answers;
}
