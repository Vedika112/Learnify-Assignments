package casestudy;

public class Employee {
private String empName,empEmail,empAdd;
private int empCode,empSalary;

//getters and setters
public String getEmpName() {
	return empName;
}
public void setEmpName(String empName) {
	this.empName = empName;
}
public String getEmpEmail() {
	return empEmail;
}
public void setEmpEmail(String empEmail) {
	this.empEmail = empEmail;
}
public String getEmpAdd() {
	return empAdd;
}
public void setEmpAdd(String empAdd) {
	this.empAdd = empAdd;
}
public int getEmpCode() {
	return empCode;
}
public void setEmpCode(int empCode) {
	this.empCode = empCode;
}
public int getEmpSalary() {
	return empSalary;
}
public void setEmpSalary(int empSalary) {
	this.empSalary = empSalary;
}

//param constructor
public Employee(String empName, String empEmail, String empAdd, int empCode, int empSalary) {
	super();
	this.empName = empName;
	this.empEmail = empEmail;
	this.empAdd = empAdd;
	this.empCode = empCode;
	this.empSalary = empSalary;
}
@Override
public String toString() {
	return "Employee [empName=" + empName + ", empEmail=" + empEmail + ", empAdd=" + empAdd + ", empCode=" + empCode
			+ ", empSalary=" + empSalary + "]";
}

}
