package ru.neoflex.hackaton.backend.dto;

import lombok.*;

@Data
@Setter
@Getter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class ShortLessonDto {
    private Long id;
    private String title;
}
