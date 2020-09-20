package com.projectmanagementapp.demo.controllers;

import com.projectmanagementapp.demo.dao.EmployeeRepo;
import com.projectmanagementapp.demo.entities.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/employees")
public class EmployeeController {

        @Autowired
        private EmployeeRepo employeeRepo;

        @GetMapping("/new")
        public String getEmployee(Model model){

            Employee employee= new Employee();
            model.addAttribute("employee",employee);
            return "new-employee";

        }

        @PostMapping("/save/employee")
        public String saveEmployee(Employee employee,Model model){
            employeeRepo.save(employee);
            return "redirect:/employees/new";
        }


}
