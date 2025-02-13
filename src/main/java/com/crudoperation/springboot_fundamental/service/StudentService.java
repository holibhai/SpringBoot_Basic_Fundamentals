package com.crudoperation.springboot_fundamental.service;

import com.crudoperation.springboot_fundamental.entity.Student;
import com.crudoperation.springboot_fundamental.repo.StudentRepositoy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

import static org.springframework.data.jpa.domain.AbstractPersistable_.id;

@Service
public class StudentService {

    @Autowired
    private StudentRepositoy studentRepositoy;

    public  Student saveStudent(Student student)
    {
        return studentRepositoy.save(student);
    }

    public List<Student> getAllStudent(){
        return studentRepositoy.findAll();
    }
    public Optional<Student> getStudentById(int id)
    {
        return studentRepositoy.findById(id);
    }
    public Student UpdateStudent(int id ,Student UpdateStudent){
        return studentRepositoy.findById(id).map(student -> {
            student.setName(UpdateStudent.getName());
            student.setAge(UpdateStudent.getAge());
            student.setEmail(UpdateStudent.getEmail());
            return studentRepositoy.save(student);
        }).orElse(null);
    }

    public void deleteStudent(int id){
        studentRepositoy.deleteById(id);
    }
}
