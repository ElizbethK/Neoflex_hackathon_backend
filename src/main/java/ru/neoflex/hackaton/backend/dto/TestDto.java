package ru.neoflex.hackaton.backend.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

import java.util.List;

@Data
@Setter
@Getter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class TestDto {
    private Long id;
    private String title;
    private List<QuestionDto> questionDtoList;
}
