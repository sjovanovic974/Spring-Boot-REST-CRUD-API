package sasa.jovanovic.cruddemo.dao;

import sasa.jovanovic.cruddemo.entity.Employee;

import java.util.List;

public interface EmployeeDAO {

    List<Employee> findAll();

    Employee findById(long id);

    void save(Employee employee);

    void deleteById(long id);
}
