package xyz.saulmmbp.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

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
        
        return "employees/employees-list";
    }
    
    @GetMapping("/addemployee")
    public String showAddEmployeeForm(Model model) {
        Employee employee = new Employee();
        
        model.addAttribute("employee", employee);
        
        return "employees/employee-form";
    }
    
    @GetMapping("/updateemployee")
    public String showUpdateEmployeeForm(@RequestParam("employeeId") int id, Model model) {
        Employee employee = employeeService.findById(id);
        
        model.addAttribute("employee", employee);
        
        return "employees/employee-form";
    }
    
    @PostMapping("/save")
    public String saveEmployee(Employee employee) {
        employeeService.save(employee);
        
        return "redirect:/employees/list";
    }
    
    @GetMapping("/delete")
    public String deleteEmployee(@RequestParam("employeeId") int id) {
        employeeService.deleteById(id);
        
        return "redirect:/employees/list";
    }
}
