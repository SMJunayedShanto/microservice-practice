package com.shanto.microservice.studentservice.service;

import com.shanto.microservice.studentservice.dto.APIResponseDto;
import com.shanto.microservice.studentservice.dto.DepartmentDto;
import com.shanto.microservice.studentservice.dto.StudentDto;
import com.shanto.microservice.studentservice.model.Student;
import com.shanto.microservice.studentservice.repository.StudentRepository;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
@AllArgsConstructor
public class StudentServiceImpl implements StudentService {

    private StudentRepository studentRepository;

    private RestTemplate restTemplate;

    @Override
    public StudentDto saveStudent(StudentDto studentDto) {
        Student student = new Student(
          studentDto.getId(),
          studentDto.getFirstName(),
          studentDto.getLastName(),
          studentDto.getDepartmentCode()
        );

        Student savedStudent = studentRepository.save(student);

        StudentDto studentDto1 = new StudentDto(
          student.getId(),
          student.getFirstName(),
          student.getLastName(),
          student.getDepartmentCode()
        );

        return studentDto1;
    }

    @Override
    public APIResponseDto getByStudentId(Long id) {

        Student student = studentRepository.findById(id).get();

        DepartmentDto departmentDto = restTemplate.getForEntity("http://localhost:8080/api/department/"+student.getDepartmentCode(), DepartmentDto.class).getBody();

        StudentDto studentDto = new StudentDto(
          student.getId(),
          student.getFirstName(),
          student.getLastName(),
          student.getDepartmentCode()
        );

        APIResponseDto apiResponseDto = new APIResponseDto(studentDto, departmentDto);

        return apiResponseDto;
    }
}
