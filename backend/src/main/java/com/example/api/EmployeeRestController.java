package com.example.api;

import com.example.models.EmployeeDTO;
import com.example.services.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@CrossOrigin
@RestController
public class EmployeeRestController {

    @Autowired
    EmployeeService empService;

    @RequestMapping("/")
    public String helloWorld() {
        return "Hello World";
    }
    @GetMapping("/employees")
    public List<EmployeeDTO> getAllEmployees() {
        return empService.getAll();
    }
}
