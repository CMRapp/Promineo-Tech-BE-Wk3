package week3ArraysAndMethods;

public class Equality {

	public static void main(String[] args) {
		// declare variables
		
		String a = new String("Hello");
		String b = new String("Hello");
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(a == b);
		System.out.println("equals() method: " + a.equals(b));
		
		int x = 5;
		int y = 5;
		
		System.out.println(x);
		System.out.println(y);
		System.out.println(x == y);
		
		String c = new String("Hello");
		String d = c;
		
		System.out.println(c);;
		System.out.println(d);
		System.out.println(c == d);
	}

}
