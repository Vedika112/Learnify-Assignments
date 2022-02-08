
public class Employees {
	public void EmpDetails(String EmpName,int EmpCode){
		System.out.println(EmpName+" "+EmpCode);
		
	}
public static void main(String[] args) {
	Employees[] e= new Employees[9];
e[0]=new Employees();	
e[1]=new Employees();	
e[2]=new Employees();	
e[0].EmpDetails("Joseph",1121);
e[1].EmpDetails("John",1023);
e[2].EmpDetails("Marry",1432);
}
}
