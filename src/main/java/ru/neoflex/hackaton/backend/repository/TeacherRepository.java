package ru.neoflex.hackaton.backend.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.neoflex.hackaton.backend.entity.Teacher;

import java.util.Optional;


@Repository
public interface TeacherRepository extends JpaRepository<Teacher, Long> {
    Teacher findByEmail(String email);
    Optional<Teacher> findById(Long id);

}
