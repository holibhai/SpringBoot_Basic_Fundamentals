package com.crudoperation.springboot_fundamental.controller;


import com.crudoperation.springboot_fundamental.entity.Student;
import com.crudoperation.springboot_fundamental.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/students")
public class StudentController {
    @Autowired
    private StudentService studentService;


    @PostMapping("/add")
    public Student crateStudent(@RequestBody Student student) {
        return studentService.saveStudent(student);
    }
    @GetMapping("getStudents")
    public List<Student> getAllStudents() {
        return studentService.getAllStudent();
    }
    @PutMapping("{id}")
    public Student UpdateStudent(@PathVariable int id, @RequestBody Student student) {
        return studentService.UpdateStudent(id, student);
    }
    @DeleteMapping("/{id}")
    public void deleteStudent(@PathVariable int id) {
        studentService.deleteStudent(id);
    }



}
