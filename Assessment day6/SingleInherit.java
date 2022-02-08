
class A{
	void print() {
		System.out.println("I am parent class");
	
	}}

class B extends A{
	void printChild() {
		System.out.println("I am child class");
	}}
public class SingleInherit {

public static void main(String[] args) {
	B obj=new B();
	obj.print();
	obj.printChild();
	
	
}
}