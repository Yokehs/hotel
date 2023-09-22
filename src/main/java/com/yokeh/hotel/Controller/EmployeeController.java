package com.yokeh.hotel.Controller;

import com.yokeh.hotel.Entity.Employee;
import com.yokeh.hotel.Service.EmployeeService;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.sound.midi.Soundbank;
import java.util.List;


@RestController
@RequestMapping(value = "/employee")
public class EmployeeController {

    private EmployeeService employeeService;

    public EmployeeController(EmployeeService employeeService){
        this.employeeService = employeeService;
    }

    @RequestMapping(path = "/", method = RequestMethod.GET)
    public String getAllEmployee(Model model){
        System.out.println("Вызов из контроллера employeeService.findAll()");
        List <Employee> employees = employeeService.findAll();
        //model.addAttribute("employees", employeeService.findAll());
        model.addAttribute("employees", employees);
        return "employees";
    }

    @RequestMapping("/{id}")
    public Employee findById(@PathVariable("id") int id){
        System.out.println("Вызов из контроллера employeeService.findById(id)");
        System.out.println("" + employeeService.findById(id));
        return employeeService.findById(id);
    }

}
