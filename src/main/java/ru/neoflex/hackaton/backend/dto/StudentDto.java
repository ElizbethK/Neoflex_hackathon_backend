package ru.neoflex.hackaton.backend.dto;

import lombok.*;

import javax.persistence.Column;

@Data
@Setter
@Getter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class StudentDto {
    private Long id;
    private String email;
    private String password;
    private String lastName;
    private String firstName;
    private String role;
}
