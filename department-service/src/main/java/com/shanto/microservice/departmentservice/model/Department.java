package com.shanto.microservice.departmentservice.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Generated;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "departments")
public class Department {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String departmentName;

    private String departmentCode;

    private String departmentDescription;

    public Department(String departmentName, String departmentCode, String departmentDescription) {
        this.departmentName = departmentName;
        this.departmentCode = departmentCode;
        this.departmentDescription = departmentDescription;
    }
}
