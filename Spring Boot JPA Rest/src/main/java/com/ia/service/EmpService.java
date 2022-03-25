package com.ia.service;

import java.util.List;

import com.ia.entity.Employee;

public interface EmpService {

	Employee addEmployee(Employee e);
	Employee updateEmployee(Employee e);
	String deleteEmployee(int eid);
	Employee getEmployee(int eid);
	List<Employee> getAllEmployee();
	
}
