package com.example.demo.student;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface StudentRepository
        extends JpaRepository<Student, Long> {
    //SELECT * FROM student WHERE email = ?
    @Query(value = "SELECT * FROM Student  WHERE s.email =?1", nativeQuery = true)//sql puro

    Optional<Student> findStudentByEmail(String email);
}
