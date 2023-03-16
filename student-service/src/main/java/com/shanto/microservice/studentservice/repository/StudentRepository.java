package com.shanto.microservice.studentservice.repository;

import com.shanto.microservice.studentservice.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student,Long> {
}
