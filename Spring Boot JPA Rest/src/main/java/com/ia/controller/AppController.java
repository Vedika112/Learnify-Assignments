package com.ia.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ia.entity.Employee;
import com.ia.service.EmpService;

@RestController
@RequestMapping("/employee") //http//localhost:5435/employee
public class AppController {
	@Autowired
	EmpService service;
	@PostMapping("/addEmployee")   //http//localhost:5435/employee/addEmployee
	public Employee addEmployee(@RequestBody Employee e) {
		return service.addEmployee(e);
	}
	
	@PutMapping("/updateEmployee")  //http//localhost:5435/employee/updateEmploye
	public Employee updateEmployee(@RequestBody Employee e) {
		return service.updateEmployee(e);
	}
	@GetMapping("/getEmployee/{eid}")  //http//localhost:5435/employee/getEmployee{eid}
	public Employee getEmployee(@PathVariable("eid")int eid) {
		return service.getEmployee(eid);
	}
    @DeleteMapping("/deleteEmployee/{eid}")  //http//localhost:5435/employee/deleteEmploye{eid}
	public String deleteEmployee(@PathVariable("eid")int eid) {
		return service.deleteEmployee(eid);
	}  
    @GetMapping("/getAllEmployee")       //http//localhost:5435/employee/getAllEmployee
    public List<Employee> getAllEmployee(){
    	return service.getAllEmployee();
    }
}
