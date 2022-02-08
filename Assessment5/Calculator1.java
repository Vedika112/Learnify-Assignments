
public class Calculator1 {
	int a,b;
	public  void sumOfTwoNos(int a,int b) {
		System.out.println("instance method without return type sum of nos is "+(a+b));
	}
	public int subOfTwoNos(int a,int b) {
		return a-b;
	}

	public static void main(String[] args) {
		Calculator1 c=new Calculator1();
		c.sumOfTwoNos(12, 100);
		System.out.println("instance method with return type  sub of two nos is "+c.subOfTwoNos(100, 50));
	}
}
