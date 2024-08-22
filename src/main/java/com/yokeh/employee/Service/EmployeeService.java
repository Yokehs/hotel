package com.yokeh.employee.Service;

import com.yokeh.employee.Entity.Employee;
import com.yokeh.employee.Exceptions.NotFoundExceptions;
import com.yokeh.employee.Repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {
    @Autowired
    private EmployeeRepository employeeRepository;

    public EmployeeService(EmployeeRepository employeeRepository){
        this.employeeRepository = employeeRepository;
    }
    public List<Employee> findAll(){
        System.out.println("Содержимое findAll: " + employeeRepository.findAll());
        return employeeRepository.findAll();
    }
    public Employee findById(Integer id){
        return employeeRepository.findById(id).orElseThrow(NotFoundExceptions::new);
    };
    
}
