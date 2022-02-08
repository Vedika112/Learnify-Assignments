
public class Q6 {
public static void main(String[] args) {
	int a=0,b=1,n=5,c;
	System.out.print(a+" ");
	System.out.print(b+" ");
	for(int i=0;i<n;i++) {
		c=a+b;
		a=b;
		b=c;
		System.out.print(c+" ");
		
	}
	
}
}
