class Animal{
	
	void print() {
		System.out.println("This is Parent class");
	}
}
class Dog extends Animal{
	void print() {
		System.out.println("This is Child Class");
	}
}

public class Override {
public static void main(String[] args) {
	Dog d=new Dog();
	d.print();
}
}
