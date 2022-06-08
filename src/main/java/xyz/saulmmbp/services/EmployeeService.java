package xyz.saulmmbp.services;

import java.util.List;

import xyz.saulmmbp.entities.Employee;

public interface EmployeeService {

    public List<Employee> findAll();
    
    public Employee findById(int id);
    
    public void save(Employee employee);
    
    public void deleteById(int id);
}
