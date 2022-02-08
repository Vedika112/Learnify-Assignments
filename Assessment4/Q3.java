
public class Q3 {
public double compoundInterest(double p,double r,double t) {
		double ci = p*(Math.pow((1 + r/ 100), t));
      return ci;
	}
	public int power(int n,int p) {
		int pow=1,i=0;
		while(i!=p) {
			pow=pow*n;
			i++;}
		return pow;
	}
	public void swap(int a,int b) {
		int c;
		c=a;
		a=b;
		b=c;
		System.out.println("no after swappind is "+a+" "+b);}
	public static void main(String[] args) {
		Q3 obj=new Q3();
		System.out.println("CI will be "+obj.compoundInterest(1000.0, 5.0, 5));
		System.out.println("power of a no is "+obj.power(7, 2));
		obj.swap(10, 12);
	}
	
}
