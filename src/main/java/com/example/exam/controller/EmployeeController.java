package com.example.exam.controller;

import com.example.exam.entity.EmployeeEntity;
import com.example.exam.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;
import java.util.Map;

@Controller
public class EmployeeController {
    @Autowired
    EmployeeService employeeService;
    @GetMapping({"/","/index"})
        public String index(Model model) {
        List<EmployeeEntity> employees = employeeService.getAllEmployee();
        model.addAttribute("employees",employees);
        return "index";
        }
    @GetMapping({"/add"})
    public String add(Model model){
        return "add";
    }
    @PostMapping({"/insert"})
    public String insertProduct(Model model, @RequestParam Map<String, String> params) {
        String name = params.get("name");
        String wage = params.get("wage");
        EmployeeEntity productEntity = new EmployeeEntity(name,wage);
        employeeService.saveEmployee(productEntity);
        return "redirect:/" ;
    }
    }

