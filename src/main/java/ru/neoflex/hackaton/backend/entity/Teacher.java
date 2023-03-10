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
@Table(name = "teacher")
public class Teacher {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "teacher_id")
    private Long teacherId;

    @Column(name = "email")
    private String email;

    @Column(name = "password")
    private String password;

    @Column(name = "last_name")
    private String lastName;

    @Column(name = "firstName")
    private String firstName;

    @Column(name = "company")
    private String company;

    @Column(name = "position")
    private String position;

    @Column(name = "role")
    private String role;


    @Override
    public String toString() {
        return "Teacher{" +
                "teacherId=" + teacherId +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", lastName='" + lastName + '\'' +
                ", firstName='" + firstName + '\'' +
                ", company='" + company + '\'' +
                ", position='" + position + '\'' +
                ", role='" + role + '\'' +
                '}';
    }

    //-----------------------------//
    @OneToMany(mappedBy = "teacher",
            fetch = FetchType.LAZY,
            cascade = CascadeType.ALL)
    List<Course> courses = new ArrayList<>();

    public void addCourse(Course course){
        this.courses.add(course);
        course.setTeacher(this);
    }
    public void removeCourse(Course course){
        this.courses.remove(course);
        course.setTeacher(null);
    }

}
