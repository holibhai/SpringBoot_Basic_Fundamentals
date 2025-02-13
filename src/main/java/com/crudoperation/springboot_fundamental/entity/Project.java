package com.crudoperation.springboot_fundamental.entity;

import jakarta.persistence.*;

import java.util.HashSet;
import java.util.Set;

@Entity
public class Project {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private String description;

    @ManyToMany(mappedBy = "project")
    private Set<Student> student=new HashSet<>();

    public Project(int id, String name, String description, Set<Student> student) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.student = student;
    }

    public Project() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Set<Student> getStudentset() {
        return student;
    }

    public void setStudentset(Set<Student> studentset) {
        this.student = studentset;
    }
}
