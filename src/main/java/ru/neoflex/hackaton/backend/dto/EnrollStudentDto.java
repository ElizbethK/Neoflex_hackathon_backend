package ru.neoflex.hackaton.backend.dto;


import lombok.*;

@Data
@Setter
@Getter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class EnrollStudentDto {
    private Long studentId;
    private Long courseId;
}
