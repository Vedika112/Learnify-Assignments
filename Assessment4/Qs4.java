
public class Qs4 {
public static void main(String[] args) {
	double temp, sqroot;
	int n=625;
	sqroot = n/ 2;
	
	do {
		temp = sqroot;
		sqroot = (temp + (n / temp))/2;
	} while((temp - sqroot) != 0);
	
	System.out.println("\nThe Square Root of a Number  " + sqroot);
}

}

