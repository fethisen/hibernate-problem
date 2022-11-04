package com.lombok.hibernateproblem.controller;

import com.lombok.hibernateproblem.service.DepartmentService;
import com.lombok.hibernateproblem.service.dto.DepartmentDTO;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DepartmentController {

    private DepartmentService departmentService;

    public DepartmentController(DepartmentService departmentService) {
        this.departmentService = departmentService;
    }

    @GetMapping("/department/{departmentId}")
    public ResponseEntity<DepartmentDTO> getDepartment(@PathVariable Integer departmentId) {
        return ResponseEntity.ok(departmentService.getDepartment(departmentId));
    }

}
