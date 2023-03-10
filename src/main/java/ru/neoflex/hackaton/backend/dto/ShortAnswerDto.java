package ru.neoflex.hackaton.backend.dto;

import lombok.*;

@Data
@Setter
@Getter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class ShortAnswerDto {
    private Long answerId;

    public Integer getAnswerId() {
        return Math.toIntExact(answerId);
    }
}
