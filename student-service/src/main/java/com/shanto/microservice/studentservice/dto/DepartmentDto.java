package com.shanto.microservice.studentservice.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class DepartmentDto {

    private Long id;

    private String departmentName;

    private String departmentCode;

    private String departmentDescription;
}
