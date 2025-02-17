package com.crudoperation.springboot_fundamental.service;

import com.crudoperation.springboot_fundamental.entity.Department;
import com.crudoperation.springboot_fundamental.repo.DepartmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DepartmentService {

    @Autowired
    private DepartmentRepository departmentRepository;

    public Department addDepartment(Department department) {
        return departmentRepository.save(department);
    }
    public List<Department> getAllDepartments() {
        return departmentRepository.findAll();
    }
    public Department getDepartmentById(int id) {
        return departmentRepository.findById(id).orElse(null);
    }
    public void deleteDepartment(Department department) {
        departmentRepository.delete(department);
    }
    public Department UpdateDepartment(int id,Department department) {
        return departmentRepository.findById(id).map(department1 -> {
                 department1.setName(department.getName());
                 return departmentRepository.save(department1);
        }).orElse(null);

    }

}
