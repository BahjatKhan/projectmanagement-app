package com.projectmanagementapp.demo.controllers;

import com.projectmanagementapp.demo.dao.ProjectRepo;
import com.projectmanagementapp.demo.entities.Project;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/projects")
public class ProjectController {

    @Autowired
    private ProjectRepo projectRepo;

    @GetMapping
    public String displayProjects(Model model){
        List<Project> project = projectRepo.findAll();
        model.addAttribute("listProjects",project);
        return "project/list-project";
    }
    @GetMapping("/new")
    public String displayProjectForn(Model model){
        Project project =new Project();
        model.addAttribute("project",project);
        return "project/new-project";
    }

    //saving data to database
    @PostMapping("/save")
    public String createProject(Project project,Model model){
        projectRepo.save(project);
        //Using redirect to prevent duplicate submission
        return "redirect:/projects/new";
    }


}
