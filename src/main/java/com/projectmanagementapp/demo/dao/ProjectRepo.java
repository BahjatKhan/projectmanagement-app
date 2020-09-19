package com.projectmanagementapp.demo.dao;

import com.projectmanagementapp.demo.entities.Project;
import org.springframework.data.repository.CrudRepository;

public interface ProjectRepo extends CrudRepository<Project,Long> {

}
