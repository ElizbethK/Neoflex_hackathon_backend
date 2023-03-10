package ru.neoflex.hackaton.backend.dto;

import lombok.*;
import ru.neoflex.hackaton.backend.entity.Teacher;

@Data
@Setter
@Getter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class ShortCourseDTO {
    private Long id;
    private String title;
    private int hours;
    private String teacher;
    private boolean isAvailable;
    private String image;

    public void setTeacherInfo(Teacher teacher) {
        this.teacher = teacher.getLastName() + " " + teacher.getFirstName();
    }

}
