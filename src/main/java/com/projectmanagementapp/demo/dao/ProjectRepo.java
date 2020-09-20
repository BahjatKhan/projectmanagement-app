package com.projectmanagementapp.demo.dao;

import com.projectmanagementapp.demo.entities.Project;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface ProjectRepo extends CrudRepository<Project,Long> {

    List<Project> findAll();
}
