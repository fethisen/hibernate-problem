package com.lombok.hibernateproblem.service;

import com.lombok.hibernateproblem.entity.Department;
import com.lombok.hibernateproblem.entity.Employee;
import com.lombok.hibernateproblem.repository.DepartmentRepository;
import com.lombok.hibernateproblem.service.dto.DepartmentDTO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Service
@Transactional
@Slf4j
public class DepartmentServiceImpl implements DepartmentService {

    private DepartmentRepository deptRepo;

    public DepartmentServiceImpl(DepartmentRepository deptRepo) {
        this.deptRepo = deptRepo;
    }

    @Override
    public DepartmentDTO getDepartment(Integer departmentId) {
        Optional<Department> optionalDepartment = deptRepo.findWithEmployeesNoLocationByDepartmentId(departmentId);
        return null;
    }
}
