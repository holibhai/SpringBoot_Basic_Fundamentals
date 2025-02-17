package com.crudoperation.springboot_fundamental.repo;

import com.crudoperation.springboot_fundamental.entity.Project;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProjectRepositoty extends JpaRepository<Project, Integer> {

}
