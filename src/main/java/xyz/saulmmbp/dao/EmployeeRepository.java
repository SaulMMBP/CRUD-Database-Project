package xyz.saulmmbp.repositories;

import org.springframework.data.repository.CrudRepository;

import xyz.saulmmbp.entities.Employee;

public interface EmployeeRepository extends CrudRepository<Employee, Integer> {

}