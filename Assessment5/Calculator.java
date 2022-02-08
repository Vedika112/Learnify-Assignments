
public class Calculator {
	int a,b;
	public static void sumOfTwoNos(int a,int b) {
		System.out.println("without return type sum of nos is "+(a+b));
	}
	public static int subOfTwoNos(int a,int b) {
		return a-b;
	}

	public static void main(String[] args) {
		Calculator.sumOfTwoNos(12, 100);
		System.out.println("with return type sub of two nos is "+Calculator.subOfTwoNos(100, 50));
	}
}
