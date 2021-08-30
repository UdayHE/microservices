package io.github.UdayHE.department.service;

import io.github.UdayHE.department.entity.Department;
import io.github.UdayHE.department.repository.DepartmentRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by udayhegde
 */
@Service
@Slf4j
public class DepartmentService {

    @Autowired
    private DepartmentRepository departmentRepository;

    public Department saveDepartment(Department department) {
        log.info("In DepartmentService -> saveDepartment()");
        return departmentRepository.save(department);
    }

    public Department getDepartment(Long departmentId) {
        log.info("In DepartmentService -> getDepartment()");
        return departmentRepository.findByDepartmentId(departmentId);
    }
}
