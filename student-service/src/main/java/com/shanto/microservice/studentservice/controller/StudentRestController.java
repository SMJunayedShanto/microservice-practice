package com.shanto.microservice.studentservice.controller;

import com.shanto.microservice.studentservice.dto.APIResponseDto;
import com.shanto.microservice.studentservice.dto.StudentDto;
import com.shanto.microservice.studentservice.service.StudentService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/student/")
@AllArgsConstructor
public class StudentRestController {

    private StudentService studentService;

    @PostMapping("create")
    public ResponseEntity<StudentDto> saveStudent(@RequestBody StudentDto studentDto){

        return new ResponseEntity<>(studentService.saveStudent(studentDto), HttpStatus.CREATED);
    }

    @GetMapping("{student-id}")
    public ResponseEntity<APIResponseDto> getById(@PathVariable("student-id") Long id){

        APIResponseDto apiResponseDto = studentService.getByStudentId(id);

        return new ResponseEntity<>(apiResponseDto, HttpStatus.OK);
    }
}
