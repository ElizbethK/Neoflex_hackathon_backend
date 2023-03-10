package ru.neoflex.hackaton.backend.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity
@Table(name = "answer")
public class Answer {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "answer_id")
    private Long answerId;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="question_id", nullable = false)
    private Question question;

    @Column(name = "variant")
    private String variant;

    @Column(name = "value")
    private int value;

    @Override
    public String toString() {
        return "Answer{" +
                "answerId=" + answerId +
                ", question=" + question +
                ", variant='" + variant + '\'' +
                ", value=" + value +
                '}';
    }
}
