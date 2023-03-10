package ru.neoflex.hackaton.backend.dto;


import lombok.*;


@Data
@Setter
@Getter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class LessonDto {
    private Long id;
    private String title;
    private String content;
    private String media;
}
