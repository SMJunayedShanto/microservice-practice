package com.shanto.microservice.departmentservice.service;

import com.shanto.microservice.departmentservice.dto.DepartmentDto;
import com.shanto.microservice.departmentservice.model.Department;

public interface DepartmentService {

    DepartmentDto saveDepartment(DepartmentDto departmentDto);
    DepartmentDto getDepartmentByCode(String code);
}
