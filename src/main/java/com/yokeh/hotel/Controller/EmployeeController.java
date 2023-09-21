package com.yokeh.hotel.Controller;

import com.yokeh.hotel.Entity.Employee;
import com.yokeh.hotel.Repository.EmployeeRepository;
import org.hibernate.boot.jaxb.SourceType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/Employee")
public class EmployeeController {
    @Autowired
    EmployeeRepository repository;
    @RequestMapping("/getallemployee")
    public List<Employee> getAllEmployee(){
        System.out.println("getAllemployee");
        List<Employee> employees = new ArrayList<>();
        employees.addAll(repository.findAll());
        System.out.println("" + employees);
        return employees;
    }

    @RequestMapping("/{id}")
    public Employee findById(@PathVariable("id") int id){
        System.out.println("findbyid");
        System.out.println("" + repository.findById(id));
        return repository.findById(id);
    }

}
