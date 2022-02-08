
class PrivateClass {
private int a=10;
public int b=12;
private void show() {
	System.out.println("I am private");
}
}
public class PrivateAccess extends PrivateClass{
	public static void main(String[] args) {
		PrivateAccess p=new PrivateAccess();
		System.out.println(p.a);
		p.show();
		System.out.println(p.b);
	}
}
