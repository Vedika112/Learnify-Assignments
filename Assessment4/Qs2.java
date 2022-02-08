
public class Qs2 {
public static void main(String[] args) {
	
	int n=1221,rem,rev=0;
	int temp=n;
	while(n>0) {
		rem=n%10;
		rev=rem+rev*10;
		n=n/10;
	}
	if (temp==rev)
		System.out.println("Palindrone");
	else
		System.out.println("Not");
}
}
