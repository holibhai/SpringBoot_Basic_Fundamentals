package com.crudoperation.springboot_fundamental.repo;

import com.crudoperation.springboot_fundamental.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepositoy extends JpaRepository<Student, Integer> {

}
