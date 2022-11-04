package com.lombok.hibernateproblem.service;


import com.lombok.hibernateproblem.service.dto.DepartmentDTO;

public interface DepartmentService {
    DepartmentDTO getDepartment(Integer departmentId);
}
