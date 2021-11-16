package sasa.jovanovic.cruddemo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import sasa.jovanovic.cruddemo.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}
