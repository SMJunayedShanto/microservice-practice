package com.shanto.microservice.studentservice.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.stereotype.Service;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class APIResponseDto {
    StudentDto studentDto;
    DepartmentDto departmentDto;
}
