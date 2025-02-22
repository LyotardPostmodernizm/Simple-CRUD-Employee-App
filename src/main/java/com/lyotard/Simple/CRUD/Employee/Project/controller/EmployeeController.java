package com.lyotard.Simple.CRUD.Employee.Project.controller;


import com.lyotard.Simple.CRUD.Employee.Project.Entity.Employee;
import com.lyotard.Simple.CRUD.Employee.Project.Service.EmployeeService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequiredArgsConstructor
@RequestMapping("/employees")
public class EmployeeController {

    private final EmployeeService employeeService;


    @GetMapping("/list") // Çalışanların listelenmesini sağlayan sayfayı dönüyoruz.
    public String listEmployees(Model theModel) {

        List<Employee> employees = employeeService.findAll();
        theModel.addAttribute("employees", employees);

        return "list-employees";
    }

    @GetMapping("/add") // Employee'nin eklenmesini sağlayacak formu döndürüyoruz.
    public String addEmployee(Model theModel) {
        Employee employee = new Employee();
        theModel.addAttribute("employee", employee);
        return "add-employee";
    }

    @PostMapping("/save")
    public String saveEmployee(@ModelAttribute("employee") Employee theEmployee) {
        employeeService.save(theEmployee); // Çalışanı veritabanına kaydediyoruz.
        return "redirect:/employees/list"; // Çalışanın birden fazla kez submit edilmesini engellemek için tekrar employee list sayfasını döndürüyoruz.
    }

    @GetMapping("/update")
    public String updateEmployee(@RequestParam("id") int id, Model model){
        Employee employee = employeeService.findById(id);
        model.addAttribute("employee", employee);


        return "add-employee";
    }

    @GetMapping("/delete")
    public String deleteEmployee(@RequestParam("id") int id) {
        employeeService.deleteById(id);
        return "redirect:/employees/list";
    }




}










