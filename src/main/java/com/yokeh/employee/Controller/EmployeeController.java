package com.yokeh.employee.Controller;

import com.yokeh.employee.Entity.Employee;
import com.yokeh.employee.Service.EmployeeService;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
public class EmployeeController {

    private EmployeeService employeeService;

    public EmployeeController(EmployeeService employeeService){
        this.employeeService = employeeService;
    }

    @RequestMapping(path = "/", method = RequestMethod.GET)
    public String getAllEmployee(){
        System.out.println("Вызов из контроллера employeeService.findAll()");
        return "employees";
    }
    @RequestMapping(path = "/all", method = RequestMethod.GET)
    public List getAllEmployee1(){
        System.out.println("Вызов из контроллера employeeService.findAll()");
        List <Employee> employees = employeeService.findAll();
        return employees;
    }

    @RequestMapping(path = "/findbyid", method = RequestMethod.GET, params = "id")
    public Employee findById(@RequestParam("id") int id){
        System.out.println("Вызов из контроллера employeeService.findById(id)");
        System.out.println("" + employeeService.findById(id));
        return employeeService.findById(id);
    }

}
