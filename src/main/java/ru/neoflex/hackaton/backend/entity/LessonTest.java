package ru.neoflex.hackaton.backend.entity;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@Entity
@Table(name = "lesson_test")
public class LessonTest {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "lesson_test_id")
    private Long lessonTestId;

    @Column(name = "title")
    private String title;

    @Column(name = "isfinished")
    private Boolean isFinished;

    @Override
    public String toString() {
        return "LessonTest{" +
                "lessonTestId=" + lessonTestId +
                ", title='" + title + '\'' +
                '}';
    }

    //----------------------//
    @OneToMany(mappedBy = "lessonTest",
            fetch = FetchType.LAZY,
            cascade = CascadeType.ALL)
    List <Question> questions = new ArrayList<>();

    public void addQuestion(Question question){
        this.questions.add(question);
        question.setLessonTest(this);
    }
    public void removeQuestion(Question question){
        this.questions.remove(question);
        question.setLessonTest(null);
    }

    @OneToOne(mappedBy = "lessonTest",
            cascade = CascadeType.ALL,
            fetch = FetchType.LAZY)
    private Lesson lesson;

}
