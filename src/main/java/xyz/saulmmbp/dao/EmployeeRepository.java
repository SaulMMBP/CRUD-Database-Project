package xyz.saulmmbp.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import xyz.saulmmbp.entities.Employee;

public interface EmployeeRepository extends CrudRepository<Employee, Integer> {

    public List<Employee> findAllByOrderByLastNameAsc();  
}