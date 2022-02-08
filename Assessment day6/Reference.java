
public class Reference {
int a=100;
	void m1(Reference r) {
		r.a=500;
		System.out.println(a);

	}
	public static void main(String[] args) {
		Reference r=new Reference();
		r.m1(r);
		
	}
}
