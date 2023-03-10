package ru.neoflex.hackaton.backend.entity;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@Entity
@Table(name = "lesson")
public class Lesson {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "lesson_id")
    private Long lessonId;

    @Column(name = "title")
    private String title;

    @Column(name = "content")
    private String content;

    @Column(name = "media")
    private String media;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "lesson_test_id")
    private LessonTest lessonTest;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="course_id", nullable = false)
    private Course course;

    @Override
    public String toString() {
        return "Lesson{" +
                "lessonId=" + lessonId +
                ", title='" + title + '\'' +
                ", content='" + content + '\'' +
                ", media='" + media + '\'' +
                ", lessonTest=" + lessonTest +
                ", course=" + course +
                '}';
    }

    //-----------------------------------------//
    @OneToMany(mappedBy = "lesson",
            fetch = FetchType.LAZY,
            cascade = CascadeType.ALL)
    List<LessonScore> lessonScores = new ArrayList<>();

    public void addLessonScore(LessonScore lessonScore){
        this.lessonScores.add(lessonScore);
        lessonScore.setLesson(this);
    }
    public void removeLessonScore(LessonScore lessonScore ){
        this.lessonScores.remove(lessonScore);
        lessonScore.setLesson(null);
    }

}
