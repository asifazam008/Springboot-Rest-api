package com.demo.Springboot.repository;

import com.demo.Springboot.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface StudentRepo extends JpaRepository<Student, UUID> {
}
