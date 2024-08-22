package com.yokeh.employee.Repository;

import com.yokeh.employee.Entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
    List<Employee> findBySurname(String surname);
    List<Employee> findAll();
    Employee findById(int id);
}
