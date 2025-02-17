package com.crudoperation.springboot_fundamental.service;

import com.crudoperation.springboot_fundamental.entity.Project;
import com.crudoperation.springboot_fundamental.repo.ProjectRepositoty;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProjectService {

    @Autowired
    private ProjectRepositoty projectRepositoty;

    public Project addProject(Project project) {
        return projectRepositoty.save(project);
    }
}
