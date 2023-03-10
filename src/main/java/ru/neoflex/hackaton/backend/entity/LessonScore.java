package ru.neoflex.hackaton.backend.entity;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;

@Getter
@Setter
@Entity
@Table(name = "lesson_score")
public class LessonScore {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "lesson_score_id")
    private Long lesson_score_id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="student_id", nullable = false)
    private Student student;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="lesson_id", nullable = false)
    private Lesson lesson;

    @Column(name = "score")
    private int score;

}
