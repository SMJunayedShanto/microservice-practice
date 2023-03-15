package com.shanto.microservice.departmentservice.service;

import com.shanto.microservice.departmentservice.dto.DepartmentDto;
import com.shanto.microservice.departmentservice.model.Department;
import com.shanto.microservice.departmentservice.repository.DepartmentRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class DepartmentServiceImpl implements DepartmentService {

    private DepartmentRepository departmentRepository;

    @Override
    public DepartmentDto saveDepartment(DepartmentDto departmentDto) {

        Department department = new Department(
                departmentDto.getId(),
                departmentDto.getDepartmentName(),
                departmentDto.getDepartmentCode(),
                departmentDto.getDepartmentDescription()
        );

        Department savedDepartment = departmentRepository.save(department);

        DepartmentDto departmentDto1 = new DepartmentDto(
                savedDepartment.getId(),
                savedDepartment.getDepartmentName(),
                savedDepartment.getDepartmentCode(),
                savedDepartment.getDepartmentDescription()
        );

        return departmentDto1;
    }

    @Override
    public DepartmentDto getDepartmentByCode(String code) {

        Department department = departmentRepository.findByDepartmentCode(code);

        DepartmentDto departmentDto = new DepartmentDto(
                department.getId(),
                department.getDepartmentName(),
                department.getDepartmentCode(),
                department.getDepartmentDescription()
        );

        return departmentDto;
    }
}
