package xyz.saulmmbp.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import xyz.saulmmbp.entities.Employee;
import xyz.saulmmbp.services.EmployeeService;

@Controller
@RequestMapping("/employees")
public class EmployeeController {

    private EmployeeService employeeService;
    
    @Autowired
    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }



    @GetMapping("/list")
    public String listEmployees(Model model) {
        List<Employee> employees = employeeService.findAll();
        
        model.addAttribute("employees", employees);
        
        return "employees-list";
    }
}
