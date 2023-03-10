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
@Table(name = "question")
public class Question {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "question_id")
    private Long questionId;

    @Column(name = "title")
    private String title;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="lesson_test_id", nullable = false)
    private LessonTest lessonTest;


    @Override
    public String toString() {
        return "Question{" +
                "questionId=" + questionId +
                ", title='" + title + '\'' +
                ", lessonTest=" + lessonTest +
                '}';
    }

    //-----------------------//
    @OneToMany(mappedBy = "question",
            fetch = FetchType.LAZY,
            cascade = CascadeType.ALL)
    List<Answer> answers = new ArrayList<>();

    public void addAnswer(Answer answer){
        this.answers.add(answer);
        answer.setQuestion(this);
    }
    public void removeAnswer(Answer answer){
        this.answers.remove(answer);
        answer.setQuestion(null);
    }
}
