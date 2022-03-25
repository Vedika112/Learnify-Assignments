package com.ia.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;

import com.ia.entity.Employee;

@Repository
public class EmpDaoImp implements Empdao {
    @PersistenceContext
	EntityManager entity;
	@Override
	public Employee addEmployee(Employee e) {
		entity.persist(e);
		return entity.find(Employee.class, e.getEpid());
	}

	@Override
	public Employee updateEmployee(Employee e) {
		
		return entity.merge(e);
	}

	@Override
	public String deleteEmployee(int eid) {
		Employee e=entity.find(Employee.class, eid);
		if(e!=null) {
			entity.remove(e);
			return "employee deleted";}
			else {
				return "no employee found";
			}
		}
	

	@Override
	public Employee getEmployee(int eid) {
		// TODO Auto-generated method stub
		return entity.find(Employee.class,eid);
	}

	@Override
	public List<Employee> getAllEmployee() {
		TypedQuery<Employee> res=entity.createQuery("Select e from Employee e",Employee.class);
		return res.getResultList();
		
	}

}
