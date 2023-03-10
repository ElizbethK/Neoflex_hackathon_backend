package ru.neoflex.hackaton.backend.dto;


import lombok.*;
import ru.neoflex.hackaton.backend.entity.Teacher;

import java.util.List;

@Data
@Setter
@Getter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class CourseDto {
    private Long id;
    private String title;
    private int hours;
    private String teacher;
    private boolean isAvailable;
    private String image;
    private String dateOfPublishing;
    private List<ShortLessonDto> lesson;

    public void setTeacherInfo(Teacher teacher) {
        this.teacher = teacher.getLastName() + " " + teacher.getFirstName();
    }

}
