
public class Employee {
int empId;
String empName,empDept;
Employee(){
	empId=101;
	empName="Jeorge";
	empDept="Management";
}
void printData() {
	System.out.println(empId+" "+empName+" "+empDept);
}
public static void main(String[] args) {
	Employee e=new Employee();
	e.printData();
}

}
