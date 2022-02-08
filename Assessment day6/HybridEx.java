class Super {
	void superClass() {
		System.out.println("This is super class");}
}
class Sub extends Super{
	void subclass() {
		System.out.println("This is subclass");
	}
}
class Sub1 extends Super{
	void subclass1() {
		System.out.println("this is subclass1");
	}
}
class Sub2 extends Super{
	void subclass2() {
		System.out.println("this is subclass2");
	}
}
public class HybridEx {
public static void main(String[] args) {
	Sub s=new Sub();
	Sub1 s1=new Sub1();
	Sub2 s2=new Sub2();
	s1.subclass1();
	s1.superClass();
	s.subclass();
	s2.subclass2();}
}
