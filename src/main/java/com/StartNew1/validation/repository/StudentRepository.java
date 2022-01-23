package com.StartNew1.validation.repository;

import com.StartNew1.validation.models.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student ,Long> {
}
