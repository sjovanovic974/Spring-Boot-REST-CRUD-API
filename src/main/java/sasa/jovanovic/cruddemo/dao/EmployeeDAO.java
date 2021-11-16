package sasa.jovanovic.cruddemo.dao;

import sasa.jovanovic.cruddemo.entity.Employee;

import java.util.List;

public interface EmployeeDAO {

    List<Employee> findAll();
}
