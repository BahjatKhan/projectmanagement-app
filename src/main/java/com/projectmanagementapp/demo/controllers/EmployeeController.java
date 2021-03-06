package com.projectmanagementapp.demo.controllers;

import com.projectmanagementapp.demo.dao.EmployeeRepo;
import com.projectmanagementapp.demo.entities.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/employees")
public class EmployeeController {

        @Autowired
        private EmployeeRepo employeeRepo;

        @GetMapping
        public String displayEmployees(Model model){
            List<Employee> employee = employeeRepo.findAll();
            model.addAttribute("listEmployee",employee);
            return "employee/list-employee";
        }
        @GetMapping("/new")
        public String getEmployee(Model model){

            Employee employee= new Employee();
            model.addAttribute("employee",employee);
            return "employee/new-employee";

        }

        @PostMapping("/save/employee")
        public String saveEmployee(Employee employee,Model model){
            employeeRepo.save(employee);
            return "redirect:/employees";
        }


}
