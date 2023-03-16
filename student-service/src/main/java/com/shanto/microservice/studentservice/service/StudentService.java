package com.shanto.microservice.studentservice.service;

import com.shanto.microservice.studentservice.dto.APIResponseDto;
import com.shanto.microservice.studentservice.dto.StudentDto;
import com.shanto.microservice.studentservice.model.Student;

public interface StudentService {

    StudentDto saveStudent(StudentDto student);

    APIResponseDto getByStudentId(Long id);
}
