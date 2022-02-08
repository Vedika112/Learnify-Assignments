class SuperClass {
	void superClass() {
		System.out.println("This is super class");}
}
class SubClass extends SuperClass{
	void subclass() {
		System.out.println("This is subclass");
	}
}
class SubClass1 extends SuperClass{
	void subclass1() {
		System.out.println("this is subclass1");
	}
}
public class HieraricalEx {
public static void main(String[] args) {
	SubClass s=new SubClass();
	SubClass1 s1=new SubClass1();
	s1.subclass1();
	s1.superClass();
	s.subclass();
}
}
