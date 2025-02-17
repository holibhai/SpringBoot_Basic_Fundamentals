package com.crudoperation.springboot_fundamental.controller;

import com.crudoperation.springboot_fundamental.entity.Department;
import com.crudoperation.springboot_fundamental.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/department")
public class DepartmentController {

    @Autowired
    private  DepartmentService departmentService;

    @PostMapping("/add")
    public Department addDepartment(@RequestBody Department department) {
        return departmentService.addDepartment(department);
    }

    @DeleteMapping("/delete")
    public void deleteDepartment(@RequestBody Department department) {
        departmentService.deleteDepartment(department);
    }

    @GetMapping("/{id}")
    public Department getDepartmentById(@PathVariable int id) {
        return departmentService.getDepartmentById(id);
    }

    @GetMapping("/getAll")
    public List<Department> getAllDepartments() {
        return departmentService.getAllDepartments();
    }

    public Department updateDepartment(@PathVariable int id,@RequestBody Department department) {
        return departmentService.UpdateDepartment(id, department);
    }
}
