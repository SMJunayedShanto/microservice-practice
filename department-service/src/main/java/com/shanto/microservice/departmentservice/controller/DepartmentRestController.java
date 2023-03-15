package com.shanto.microservice.departmentservice.controller;

import com.shanto.microservice.departmentservice.dto.DepartmentDto;
import com.shanto.microservice.departmentservice.service.DepartmentService;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@AllArgsConstructor
@RequestMapping("api/department/")
public class DepartmentRestController {

    private DepartmentService departmentService;

    @PostMapping("create")
    public ResponseEntity<DepartmentDto> saveDepartment(@RequestBody DepartmentDto departmentDto){

        return new ResponseEntity<>(departmentService.saveDepartment(departmentDto), HttpStatus.CREATED);
    }

    @GetMapping("{department-code}")
    public ResponseEntity<DepartmentDto> getByDepartmentCode(@PathVariable("department-code") String code){
        DepartmentDto departmentDto = departmentService.getDepartmentByCode(code);

        return new ResponseEntity<>(departmentDto, HttpStatus.OK);
    }
}
