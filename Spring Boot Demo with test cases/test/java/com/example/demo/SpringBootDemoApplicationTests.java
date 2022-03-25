package com.example.demo;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.ia.SpringBootDemoApplication;
import com.ia.entity.Employee;
import com.ia.service.EmpService;

@SpringBootTest(classes = SpringBootDemoApplication.class)
class SpringBootDemoApplicationTests {
@Autowired	
EmpService service;
	
	@Test
	void testAdd(){
		Employee e=new Employee(101,"star",19930,"Jaipur");
		Employee emp=service.addEmployee(e);
		assertEquals(emp.getEname(),"star");
	}

}
