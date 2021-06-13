package com.example.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.models.EmployeeDTO;
import com.example.repositories.EmployeeRepository;

@CrossOrigin
@RestController
@RequestMapping("/")
public class EmployeeRestController {
	
	@Autowired
	private EmployeeRepository empRepo;
	
	@CrossOrigin
	@GetMapping("employees")
	public List<EmployeeDTO> getEmployees() {
		return this.empRepo.findAll();
	}
}
