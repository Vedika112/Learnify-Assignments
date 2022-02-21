package casestudy;

import java.util.HashMap;
import java.util.Iterator; 
import java.util.Map.Entry; 
import java.util.Set;
import java.util.Scanner;


public class EmpClient {
public static void main(String[] args) {
	//using hashmap as database
	HashMap<Integer,Employee> emp=new HashMap();
	int pid=100;
	while(true) {
		System.out.println("Employee Management System");
		System.out.println("1.Add Employee");
		System.out.println("2.Update Employee");
		System.out.println("3.Delete Employee");
		System.out.println("4.Get Employee");
		System.out.println("5.Get All Employee");
		Scanner sc=new Scanner(System.in);
		int input=sc.nextInt();
		switch(input) {
		case 1:
			//To add employee
			System.out.println("Provide details to add an Employee");
			System.out.println("Enter Employee Name");
			String ename=sc.next();
			System.out.println("Enter Employee Code");
			int ecode=sc.nextInt();
			System.out.println("Enter Employee Email");
			String eemail=sc.next();
			System.out.println("Enter Employee Address");
			String eadd=sc.next();
			System.out.println("Enter Employee Pincode");
			int epin=sc.nextInt();			
		    Employee e=new Employee(ename,eadd,eemail,ecode,epin);
			emp.put(++pid,e);
			System.out.println("Item added successfully");
		    break;
		   
		case 2:
			 //for updating employee details
			System.out.println("Enter Employee Id to be updated");
			  int pid1=sc.nextInt();
			System.out.println("Enter Employee Name");
			  String ename1=sc.next();
			System.out.println("Enter Employee Code");
			  int ecode1=sc.nextInt();
			System.out.println("Enter Employee Email");
			  String eemail1=sc.next();
			System.out.println("Enter Employee Address");
			  String eadd1=sc.next();
			System.out.println("Enter Employee Pincode");
			  int epin1=sc.nextInt();			
		    Employee e1=new Employee(ename1,eadd1,eemail1,ecode1,epin1);
			emp.put(pid1,e1);
			System.out.println("Item updated  successfully"+""+pid1);
			break;
		
		case 3:
			// delete employeee details
			System.out.println("Enter Employee Id to be Deleted");
			int pid2=sc.nextInt();
			emp.remove(pid2);
			System.out.println("Employee deleted successfully"+pid2);
		    break;
		    
		case 4:
			//get employee by using their ids
			System.out.println("Enter Employee Id");
			int pid3=sc.nextInt();
			System.out.println(emp.get(pid3));
			break;
			
		case 5:
			//get all employee details
			Set<Entry<Integer,Employee>> s=emp.entrySet();
			Iterator<Entry<Integer,Employee>> iter=s.iterator();
			while(iter.hasNext()) {
				Entry<Integer,Employee> i=iter.next();
				System.out.println(i.getKey()+""+i.getValue());}
			break;
		default:
			System.out.println("Please choose between 1 to 5");
			
		}
		
	}
	
}
}
