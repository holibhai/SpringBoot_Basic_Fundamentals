package com.crudoperation.springboot_fundamental.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Setter
@Getter
@Entity
public class Department {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;


    @OneToMany(mappedBy = "department",cascade = CascadeType.ALL)
    private List<Student> student;

    public Department(int id, String name, List<Student> student) {
        this.id = id;
        this.name = name;
        this.student = student;
    }

    public Department() {

    }

}
