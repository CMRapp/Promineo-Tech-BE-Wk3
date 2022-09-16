package week3ArraysAndMethods;

public class Students {

	public static void main(String[] args) {
		
		//declare variables
		String studentName1 = "Tom Sawyer";
		String studentName2 = "Jack Smith";
		String studentName3 = "Bill Turner";
		
		String[] students = new String[3]; //array
		
		students[0] = "Tom Sawyer";
		students[1] = "Jack Smith";
		students[2] = "Bill Turner";
		
		System.out.println(students[0]);
		System.out.println(students[1]);
		System.out.println(students[2]);
		System.out.println();
		
		//for loop walks through array and prints contents (time saver!)
		for (int i=0; i < students.length; i++) {
			System.out.println(students[i]);
		}
		
		System.out.println();
		
		//enhanced for loop (bigger time saver!)
		for (String student: students) {
			System.out.println(student);
		}
	
	}// end main

}// end class Students
