
public class Student1 {

	int studentId;
	String studentName;
	Student1() {
		System.out.println("In default constructor");
		}
      Student1(int studentId,String studentName) {
    	  System.out.println("in parameterized construct");
		System.out.println(studentId);
		
		System.out.println(studentName);
		
	}
	public static void main(String[] args) {
		Student1 s=new Student1();
		Student1 s1=new Student1(131,"John");
	}
}
