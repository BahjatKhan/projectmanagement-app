package com.projectmanagementapp.demo.controllers;

import com.projectmanagementapp.demo.dao.EmployeeRepo;
import com.projectmanagementapp.demo.dao.ProjectRepo;
import com.projectmanagementapp.demo.entities.Employee;
import com.projectmanagementapp.demo.entities.Project;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class HomeController {

    @Autowired
    private ProjectRepo projectRepo;

    @Autowired
    private EmployeeRepo employeeRepo;


    @GetMapping("/")
    public String getHomePage(Model model){
        List<Project> projects= projectRepo.findAll();
        model.addAttribute("list",projects);

        List<Employee> employees= employeeRepo.findAll();
        model.addAttribute("listOfEmployees",employees);
        return "main/home";
    }
}
