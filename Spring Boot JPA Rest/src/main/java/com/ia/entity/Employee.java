package com.ia.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Springboot")
public class Employee {
@Id
private int epid;
private String ename;
private int esal;
private String eadd;
public int getEpid() {
	return epid;
}
public void setEpid(int epid) {
	this.epid = epid;
}
public String getEname() {
	return ename;
}
public void setEname(String ename) {
	this.ename = ename;
}
public int getEsal() {
	return esal;
}
public void setEsal(int esal) {
	this.esal = esal;
}
public String getEadd() {
	return eadd;
}
public void setEadd(String eadd) {
	this.eadd = eadd;
}


public Employee() {
	// TODO Auto-generated constructor stub
}
public Employee(int epid, String ename, int esal, String eadd) {
	super();
	this.epid = epid;
	this.ename = ename;
	this.esal = esal;
	this.eadd = eadd;
}
@Override
public String toString() {
	return "Employee [epid=" + epid + ", ename=" + ename + ", esal=" + esal + ", eadd=" + eadd + "]";
}

}
