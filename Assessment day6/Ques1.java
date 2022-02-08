
public class DefaultValue {
	byte b;short s;long l;
	int a;
	char ch;float f;double d;boolean bl;
	static int in;static float fs;
	static boolean bls;static long ls;static char chs;static double ds;
	static byte bs;static short ss;
	public  static void printDataOfStatic() {
	System.out.println("default value of static byte is "+bs);
	System.out.println("default value of static short is "+ss);
	System.out.println("default value of static int is "+in);
	System.out.println("default value of static long  is "+ls);
	System.out.println("default value of static float  is "+fs);
	System.out.println("default value of static double is "+ds);
	System.out.println("default value of static char  is "+chs);
	System.out.println("default value of static boolean  is "+bls);
}
public static void main(String[] args) {
DefaultValue d=new DefaultValue();
DefaultValue.printDataOfStatic();
	System.out.println("default value of byte is "+d.b);
	System.out.println("default value of short is "+d.s);
	System.out.println("default value of int is "+d.a);
	System.out.println("default value of long is "+d.l);
	System.out.println("default value of char is "+d.ch);
	System.out.println("default value of float is "+d.f);
	System.out.println("default value of double is "+d.d);
	System.out.println("default value of boolean is "+d.bl);

}
}
