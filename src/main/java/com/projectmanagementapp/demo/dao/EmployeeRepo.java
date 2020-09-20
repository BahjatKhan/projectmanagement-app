package com.projectmanagementapp.demo.dao;

import com.projectmanagementapp.demo.entities.Employee;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface EmployeeRepo extends CrudRepository<Employee,Long> {
    List<Employee> findAll();
}
