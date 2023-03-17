package com.shanto.microservice.studentservice.repository;

import com.shanto.microservice.studentservice.dto.DepartmentDto;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@org.springframework.cloud.openfeign.FeignClient(name = "DEPARTMENT-SERVICE")
public interface FeignClient {
    @GetMapping("/api/department/{department-code}")
    public DepartmentDto getByDepartmentCode(@PathVariable("department-code") String code);
}
