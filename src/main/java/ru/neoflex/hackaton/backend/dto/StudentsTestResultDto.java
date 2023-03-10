package ru.neoflex.hackaton.backend.dto;

import lombok.*;

import java.util.List;

@Data
@Setter
@Getter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class StudentsTestResultDto {
    private Long testId;
    private List<StudentQuestionAnswerDto> questionAnswerList;
}
