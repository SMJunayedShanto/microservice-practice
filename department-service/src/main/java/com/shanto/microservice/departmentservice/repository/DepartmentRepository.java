package com.shanto.microservice.departmentservice.repository;

import com.shanto.microservice.departmentservice.model.Department;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DepartmentRepository extends JpaRepository<Department,Long> {

    Department findByDepartmentCode(String code);
}
