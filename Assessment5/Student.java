
public class Student {

	int studentId,studentRollNo;
	String studentName,studentGrade;
	void assign() {
		studentId=342;
		studentRollNo=12;
		studentName="John";
		studentGrade="A";
		
	}
	void print() {
		System.out.println(studentId);
		System.out.println(studentRollNo);
		System.out.println(studentName);
		System.out.println(studentGrade);
	}
	public static void main(String[] args) {
		Student s=new Student();
		s.assign();
		s.print();
	}
}
