package xyz.saulmmbp.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import xyz.saulmmbp.entities.Employee;
import xyz.saulmmbp.repositories.EmployeeRepository;

@Service
public class EmployeeServiceImpl implements EmployeeService {
    
    private EmployeeRepository employeeRepository;

    @Autowired
    public EmployeeServiceImpl(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    @Override
    public List<Employee> findAll() {
        List<Employee> employees = (List<Employee>) employeeRepository.findAll();
        
        return employees;
    }

    @Override
    public Employee findById(int id) {
        Optional<Employee> result = employeeRepository.findById(null);
        
        Employee employee = result.orElseThrow(() -> new RuntimeException("Not Found Employee ID - " + id));
        
        return employee;
    }

    @Override
    public void save(Employee employee) {
        employeeRepository.save(employee);
    }

    @Override
    public void deleteById(int id) {
        employeeRepository.deleteById(id);
    }

}
