package ru.neoflex.hackaton.backend.entity;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;

@Getter
@Setter
@Entity
@ToString
@Table(name = "student_course")
@RequiredArgsConstructor
public class StudentCourse {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "student_course_id")
    private Long studentCourseId;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="student_id", nullable = false)
    private Student student;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="course_id", nullable = false)
    private Course course;

}
