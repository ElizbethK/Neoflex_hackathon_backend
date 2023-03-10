package ru.neoflex.hackaton.backend.entity;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import ru.neoflex.hackaton.backend.enums.Role;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@Entity
@Table(name = "student")
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "student_id")
    private Long id;

    @Column(name = "email")
    private String email;

    @Column(name = "password")
    private String password;

    @Column(name = "last_name")
    private String lastName;

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "role")
    private String role;


    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", lastName='" + lastName + '\'' +
                ", firstName='" + firstName + '\'' +
                ", role='" + role + '\'' +
                '}';
    }

    //--------------------------------//
    @OneToMany(mappedBy = "student",
            fetch = FetchType.LAZY,
            cascade = CascadeType.ALL)
    List<LessonScore> lessonScores = new ArrayList<>();

    public void addLessonScore(LessonScore lessonScore){
        this.lessonScores.add(lessonScore);
        lessonScore.setStudent(this);
    }
    public void removeLessonScore(LessonScore lessonScore ){
        this.lessonScores.remove(lessonScore);
        lessonScore.setStudent(null);
    }


    @OneToMany(mappedBy = "student",
            fetch = FetchType.LAZY,
            cascade = CascadeType.ALL)
    List<StudentCourse> studentCourses = new ArrayList<>();

    public void addStudentCourse(StudentCourse studentCourse){
        this.studentCourses.add(studentCourse);
        studentCourse.setStudent(this);
    }
    public void removeStudentCourse(StudentCourse studentCourse){
        this.studentCourses.remove(studentCourse);
        studentCourse.setStudent(null);
    }

}
