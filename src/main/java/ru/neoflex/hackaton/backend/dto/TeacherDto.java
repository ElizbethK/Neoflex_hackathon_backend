package ru.neoflex.hackaton.backend.dto;

import lombok.*;

@Data
@Setter
@Getter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class TeacherDto {
    private Long id;
    private String lastName;
    private String firstName;

}
