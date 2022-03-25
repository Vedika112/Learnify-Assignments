package com.ia.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ia.dao.Empdao;
import com.ia.entity.Employee;
@Service
@Transactional
public class EmpServiceImp implements EmpService {

    @Autowired
	Empdao dao;
	
	@Override
	public Employee addEmployee(Employee e) {
		
		return dao.addEmployee(e);
	}

	@Override
	public Employee updateEmployee(Employee e) {
		// TODO Auto-generated method stub
		return dao.updateEmployee(e);
	}

	@Override
	public String deleteEmployee(int eid) {
		// TODO Auto-generated method stub
		return dao.deleteEmployee(eid);
	}

	@Override
	public Employee getEmployee(int eid) {
		// TODO Auto-generated method stub
		return dao.getEmployee(eid);
	}

	@Override
	public List<Employee> getAllEmployee() {
		// TODO Auto-generated method stub
		return dao.getAllEmployee();
	}

}
