package ru.neoflex.hackaton.backend.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.neoflex.hackaton.backend.entity.Student;

import java.util.Optional;


@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {
    Student findByEmail(String email);
    Optional<Student> findById(Long id);
}
