package sasa.jovanovic.cruddemo.service;

import sasa.jovanovic.cruddemo.entity.Employee;

import java.util.List;

public interface EmployeeService {

    List<Employee> findAll();

    Employee findById(long id);

    void save(Employee employee);

    void deleteById(long id);
}
