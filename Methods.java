package week3ArraysAndMethods;

public class Methods {

	public static void main(String[] args) {
		// declare variables
		
		String firstName = "Bob";
		String lastName = "Ross";
		String fullName = createFullName (firstName, lastName);
		String fullName2 = createFullName("Sam", lastName);
		System.out.println(fullName);
		System.out.println(fullName2);
		
	}//main method
	
	public static String createFullName(String x, String y) {
		return  x + " " + y;
		
	}// end createFullName

}//end class Methods
