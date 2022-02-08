
public class Q4 {
	
public int rectangle(int a,int b) {
	return a*b;
}
public void circle(double r) {
	System.out.println("area of circle is "+3.14*r*r);
	System.out.println("Circumference of circle is "+2*3.14*r);
}
public void ascii(char c) {
	System.out.println("ASCII value of character "+c+"is"+(int)c);
}
public static void main(String[] args) {
	Q4 obj=new Q4();
    System.out.println("Area of Rectangle"+obj.rectangle(7, 8));
	obj.circle(10);
	obj.ascii('a');
}
}
