
public class StringMethods {

	public static void main(String[] args) {
		String s1="Good";
		String s2="Morning!";
		String str= new String("india");
	    System.out.println(s1.charAt(3));
		System.out.println(s2.compareTo(s1));
		System.out.println(s1.concat(s2));
		System.out.println(s1.isEmpty());
		System.out.println(s1.toUpperCase());
		System.out.println(s1.getClass());
		System.out.println(s1.contains(s2));
		System.out.println(s1.equals(str));
		System.out.println(s1.endsWith(str));
		System.out.println(s2.indexOf('g'));
		System.out.println(s1.intern());
		System.out.println(s1.codePointBefore(3));
		System.out.println(s1.toCharArray());	}
}
		

