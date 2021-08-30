package io.github.UdayHE.department.controller;

import io.github.UdayHE.department.entity.Department;
import io.github.UdayHE.department.service.DepartmentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * Created by udayhegde
 */
@RestController
@Slf4j
@RequestMapping("/departments")
public class DepartmentController {

    @Autowired
    private DepartmentService departmentService;

    @PostMapping("/")
    public Department saveDepartment(@RequestBody Department department) {
        log.info("In DepartmentController -> saveDepartment()");
        return departmentService.saveDepartment(department);
    }

    @GetMapping("/{id}")
    public Department getDepartment(@PathVariable("id") Long departmentId) {
        log.info("In DepartmentController -> getDepartment()");
        return departmentService.getDepartment(departmentId);
    }
}
