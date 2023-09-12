package com.yokeh.hotel.Repository;

import com.yokeh.hotel.Entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
    List<Employee> findBySurname(String surname);
    Employee findById(long id);
}
