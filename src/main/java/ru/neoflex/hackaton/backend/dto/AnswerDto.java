package ru.neoflex.hackaton.backend.dto;

import lombok.*;

@Data
@Setter
@Getter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class AnswerDto {
    private Long id;
    private String variant;
}
