package ru.neoflex.hackaton.backend.entity;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@Entity
@Table(name = "course")
public class Course {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "course_id")
    private Long courseId;

    @Column(name = "title")
    private String title;

    @Column(name = "description")
    private String description;

    @Column(name = "hours")
    private int hours;

    @Column(name = "image")
    private String image;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="teacher_id", nullable = false)
    private Teacher teacher;


    @Column(name = "is_available")
    private boolean isAvailable;

    @Column(name = "date_of_publishing")
    private LocalDate dateOfPublishing;



    @Override
    public String toString() {
        return "Course{" +
                "courseId=" + courseId +
                ", title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", hours=" + hours +
                ", image='" + image + '\'' +
                ", teacher=" + teacher +
                ", isAvailable=" + isAvailable +
                ", dateOfPublishing=" + dateOfPublishing +
                '}';
    }

    //----------------------------//
    @OneToMany(mappedBy = "course",
            fetch = FetchType.LAZY,
            cascade = CascadeType.ALL)
    List<Lesson> lessons = new ArrayList<>();

    public void addLesson(Lesson lesson){
        this.lessons.add(lesson);
        lesson.setCourse(this);
    }
    public void removeLesson(Lesson lesson){
        this.lessons.remove(lesson);
        lesson.setCourse(null);
    }


    @OneToOne(mappedBy = "course",
            cascade = CascadeType.ALL,
            fetch = FetchType.LAZY)
    private Tag tag;



    @OneToMany(mappedBy = "course",
            fetch = FetchType.LAZY,
            cascade = CascadeType.ALL)
    List<StudentCourse> studentCourses = new ArrayList<>();

    public void addStudentCourse(StudentCourse studentCourse){
        this.studentCourses.add(studentCourse);
        studentCourse.setCourse(this);
    }
    public void removeStudentCourse(StudentCourse studentCourse){
        this.studentCourses.remove(studentCourse);
        studentCourse.setCourse(null);
    }




}
