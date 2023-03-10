package ru.neoflex.hackaton.backend.dto;

import lombok.*;

@Data
@Setter
@Getter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class StudentCourseDto {
    private Long id;
    private Long studentId;
    private Long courseId;
    private Boolean isSubscribed;
}
