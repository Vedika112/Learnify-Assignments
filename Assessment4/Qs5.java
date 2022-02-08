
public class Qs5 {
	public static void main(String[] args) {
		int marks=65;
		char grade;
		if(marks>=80) {
			grade='A';
			
		}
		else if(marks>=60 && marks<80)
			grade='B';
		else if(marks>=40 && marks<60)
			grade='C';
		else
			grade='D';
	System.out.println("grade of student is "+grade);
	
	}

}
