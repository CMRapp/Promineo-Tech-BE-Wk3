package week3ArraysAndMethods;

import java.util.Scanner;
/**
 * Promineo Tech BE Weeks 3-4 Coding Assignment
 * Christian M Rapp
 * @author cmrap
 * 
 * Note: Although not required for this assignment, the list solutions to the assignment questions have been
 * made into a menu-driven program. Although the application of the menu system may not be memory efficient, it
 * utilizes skills and techniques we were shown in this week's lessons. This is an effort to continue to grow my
 * skills as a developer and use as many skills/techniques that we were shown in the training videos and labs. 
 * It also, in my opinion, makes the output of each question easier to read so that anyone viewing the program will
 * not have to scroll through the console window to view the solution for each question. 
 *
 */

public class ArraysAndMethods {
	
	static Scanner s = new Scanner(System.in); // accessible anywhere
	static String header = "\nChristian M Rapp | Promineo Tech BE WKs 3-4\nArrays and Methods Programming Assignment\n";
	static  String divider = "_________________________________________________________________________________________";
	
	
	public static void main(String[] args) {
		
		int decision = 0; //used for holding user's menu choice
		
		//declare and initialize arrays for non method questions
		String[] names = new String[] {"Sam", "Tommy", "Tim", "Sally", "Buck", "Bob"}; // question 2
		
		int[] nameLengths = new int[names.length]; // create array with same length as names | questions 5&6
		
		int[] numArray = new int[] {25,25,25,26}; // question 9
		
		double[] dblArray = new double[] {25,25,25,25}; // question 10
		
		double[] dbl1 = new double[] {88.7, 92.5, 100, 67.3, 78.9}; // question 11			
		double[] dbl2 = new double[] {22.6, 99.2, 60, 88.6, 42.3};
		
		while(decision != -1){
			showMenu();
			decision = s.nextInt();	
		
			if (decision < -1 || decision >13) {
				System.out.println("*** PLEASE PICK A VALID OPTION ***");
			} else if (decision == 1){
				question1();
			} else if (decision == 2){
				question2(names);
			} else if (decision == 3) {
				System.out.println(divider + "\n3) How do you access the last element of any array?");
				System.out.println("By using array.length - 1 (ex: intArray[intArray.length-1])\n" + divider);
			} else if (decision == 4) {
				System.out.println(divider + "\n4) How do you access the first element of any array?");
				System.out.println("By using the array 0 position. (ex: intArray[0])\n" + divider);
			} else if (decision == 5 || decision == 6) {
				question5(names, nameLengths);
			} else if (decision == 7) {
				System.out.println("\n" + divider);
				System.out.println("QUESTION 7 OUTPUT:");
				System.out.println("\nConcatenating - values passed 'Hello' and 5: " + concatenateString("Hello", 5));
				System.out.println("\n" + divider);
			} else if (decision == 8) {
				System.out.println("\n" + divider);
				System.out.println("\nQUESTION 8 OUTPUT:");
				System.out.println("Strings concatenated are: " + fullName("Christian", "Rapp"));
				System.out.println("\n" + divider);
			} else if(decision ==9) {
				System.out.println("\n" + divider);
				System.out.println("\nQUESTION 9 OUTPUT:");
				System.out.println("Contents of the array: ");
				for(int array : numArray) {
					System.out.print(array + " ");
				}
				System.out.println("\nThe sum of the ints in the array are greater than 100: " + arrayMath(numArray));
				System.out.println("\n" + divider);
			} else if(decision == 10) {
				System.out.println("\n" + divider);
				System.out.println("\nQUESTION 10 OUTPUT:");
				System.out.println("Array contents: ");
				for(double array : dblArray) {
					System.out.print(array + " ");
				}
				System.out.println("\nThe average of the numbers in the array is: " + calculateAverage(dblArray));
				System.out.println("\n" + divider);
			} else if (decision == 11) {
				System.out.println("\n" + divider);
				System.out.println("\nQUESTION 11 OUTPUT:");
				System.out.print("Array 1 contents: ");
					for(double array1 : dbl1) {
						System.out.print(array1 + " ");
					}
				System.out.print("\nArray 2 contents: ");
					for(double array2 : dbl2) {
						System.out.print(array2 + " ");
					}
				System.out.println("\nAverage of array1 > array 2: " + calculateAverage2(dbl1,dbl2));
				System.out.println("\n" + divider);
			} else if (decision == 12) {
				System.out.println("\n" + divider);
				System.out.println("\nQUESTION 12 OUTPUT:");
				System.out.println("willBuy Drink = true if isHotOutside = true and moneyInPocket > 10.50");
				System.out.println("Values passed: true, 10.0\nWill Buy Drink: " + willBuyDrink(true, 10.0));
				System.out.println("\n" + divider);
			} else if (decision == 13) {
				System.out.println("\n" + divider);
				System.out.println("SODUKU SQUARE");
				showMessage();
				displaySquare(getUserInput());
				System.out.println("\n" + divider);
			}
			
		}// end while
					
	}//end main

	//QUESTION 1	*****************************************************************
	public static void question1() {
			System.out.println(divider + "\n");
			System.out.println("QUESTION 1 OUTPUT:\nOriginal array contained the numbers 3,9, 23 , 64, 2, 8, 28, 93. (49 added for step b)");	
			
			int[] ages = new int[] {3,9,23,64,2,8,28,93,49};   // 49 was added for step 1b
			
			//declare variables
			int result = 0;
			int arrayLength = ages.length;
			
			// 1a & 1b
			System.out.println("1a) was 93 before adding to the array.");
			System.out.print("1b) reflects new age added to the array: ");
			result += (ages[arrayLength - 1] - ages[result]);
			System.out.println(result);
			
			// 1c
			System.out.print("1c) Average age of the ages in the array: ");
			int intCollector = 0;
			for (int age : ages) {
				intCollector += age;
			}
			
			System.out.println((intCollector / arrayLength) + "." + (intCollector % arrayLength));
			System.out.println("\n" + divider);
		}// question 1
	
	//QUESTION 2 *****************************************************************
	public static void question2(String[] names) {
	
	System.out.println("\n" + divider);
	System.out.println("QUESTION 2 OUTPUT:");
	System.out.print("The array contains the values: ");
	
	for(String name : names) {
		System.out.print(name + " ");
	}
		//2a	
		System.out.print("\n2a) The average number of letters per name is : ");
		double letterCount = 0.0;
			for (int i=0; i < names.length; i++) {
				letterCount += names[i].length();
			}
		System.out.print(letterCount/names.length);
		System.out.println();
				
		
		//2b
		String strCollector = "";
		for (String name : names) {
			strCollector += name + " ";
		}
		System.out.print("2b) The array strings concatenated together with space: " + strCollector);
		System.out.println("\n" + divider);
	}//question 2
	
	//QUESTION 5 *****************************************************************
	public static void question5(String[] names, int[] nameLengths) {
	
	/* Create a new array of int called nameLengths. Write a loop to iterate over
	 * the previously created names array and add the length of each name to the
	 * nameLengths array. */
	
	System.out.println("\n" + divider);
	System.out.println("QUESTION 5 & 6 OUTPUT:");
	System.out.print("The array contains the values: ");
	
	for(String name : names) {
		System.out.print(name + " ");
	}
		
	for (int i = 0; i < names.length; i++) {
		nameLengths[i] = names[i].length();
	} // end for
	
	System.out.print("\nThe length of names in the array are: ");
	for (int number : nameLengths) {
		System.out.print(number + " ");
	}
	
System.out.println("\n\nQUESTION 6 OUTPUT:");
	
	System.out.print("The sum of the elements in the nameLengths array is: ");
	int sum = 0;
	for(int value : nameLengths) {
		sum += value;
	}
	System.out.print(sum);
	System.out.println("\n" + divider);
	}//question 5 & 6
	
	//QUESTION 7 *****************************************************************
	public static String concatenateString(String word, int n) {
		
		//declare variables
		String strOutput="";
		
		for(int i=1; i <= n; i++) {
			strOutput += word;
		}
		return strOutput;
	}//end concatenateString
	
		
	//QUESTION 8 *****************************************************************
	public static String fullName(String firstName, String lastName) {
		
		//declare variables
		String strOutput = "";
		
		strOutput = firstName + " " + lastName;
		return strOutput;
	}// end fullName
	
	//QUESTION 9 *****************************************************************
	public static boolean arrayMath(int[] numbers) {
		//declare variables
		int sum = 0;
		for (int number : numbers) {
			sum += number;
		} //end for
		
		if (sum > 100){
			return true;
		} else {
			return false;
		}//if/else
	
		}//end arrayMath
	
	
	//QUESTION 10 *****************************************************************
	public static double calculateAverage(double[] numbers) {
		double sum = 0;
		for (double number : numbers) {
			sum += number;			
		}
		
		return sum / numbers.length;
	}//end calculateAverage
	
	//QUESTION 11 *****************************************************************
	public static boolean calculateAverage2(double[] nums1, double[] nums2) {
		//declare variables
		double sum1 = 0;
		double sum2 = 0;
		
		for (double number1 : nums1) {
			sum1 += number1;			
		}
		
		for (double number2 : nums2) {
			sum2 += number2;			
		}
		
		if ((sum1 / nums1.length) > sum2 / nums2.length) {
			return true;
		} else {
			return false;
		}
		
	}//end calculateAverage2	
	
	//QUESTION 12 *****************************************************************
	public static boolean willBuyDrink(boolean hotOutside, double money) {
		if(hotOutside == true && money >10.50) {
			return true;
		}else {
			return false;
		}
	}//end question 12
	
	
	// QUESTION 13 (custom methods) ************************************************
	public static int[] getUserInput() {
    	int[] userArray = {0,0,0,0,0,0,0,0,0};
    	int intInput = 0;
    	
    	for (int i = 0; i < userArray.length; i++) {
    		System.out.print("Enter a number 1-9: ");  
			intInput = s.nextInt();
			if (intInput > 0 && intInput < 10 && !numExists(userArray, intInput)) {
				userArray[i] = intInput;
			} else {
				System.out.print("\nINVALID INPUT | Please enter a value 1-9: ");
				i = i - 1;
			}
    	}
    	 return userArray;
    }// end getUserInput
    
    	 public static boolean numExists (int[] userArray, int userInput) {
    		 
    		 for (int i = 0; i < userArray.length; i++) {
    			 if (userArray[i] == userInput) {
    				 System.out.println("That number already exists. Please enter a new number 1-9");
    				 return true;
    			 }
    			}
    		 return false;
    	 }// end numExists
    	 
    	 
    	 /* method displaySquare will accept a user defined array and then create a 3x3 array representing a
    	  * standard square in a soduku problem and will the populate and display the user-defined square
    	  */

    	 public static void  displaySquare(int[] userArray) {
    		 
    		 int[][] sodukuSquare = new int[3][3];  // create 3x3 grid
    		 int indexCounter = 0;					// create counter to track user array index
    		 
    		 System.out.println("\nYOUR CUSTOM SQUARE:\n");
    		 for (int i = 0; i < 3; i++) {
    			 for (int j = 0; j < 3; j++) {
    				 if (j < 3 ) {
    					 sodukuSquare[i][j] = userArray[indexCounter];
    					 indexCounter ++;
    				 } 
    				 else if (j >= 3 && j < 6) {
    					 sodukuSquare[i][j] = userArray[indexCounter];
    					 indexCounter ++;
    				 } 
    				 else {
    					 sodukuSquare[i][j] = userArray[indexCounter];
    					 indexCounter ++;
    				 }
    			 } //end for j
    		 }//end for i
    		 
    		 //display the square
    		 
    		 for (int i = 0; i < 3; i++) {
    			 for (int j = 0; j < 3; j++) {
    				 System.out.print(sodukuSquare[i][j] + " ");
    			 }
    			 System.out.println();
    		 }
    		 System.out.println("\nResearch Credit:\n"
    		 		+ "https://www.geeksforgeeks.org/different-ways-to-declare-and-initialize-2-d-array-in-java/");
    	 
    		 
    	 }// end displaySquare
	
	
	// Custom Method #2 showMessage displays a message about the xTables custom method
	public static void showMessage() {
		System.out.println("This method was designed to enhance skills learned in Week 3 of the Promineo Tech BE Course.\n"
				+ "This assignment consists of 3 methods that together allow the user to create a custon 3x3 soduku square.\n"
				+ "The getUserInput method takes the asks the user to enter an integer 1-9 the integers are to be stored in an array.\n"
				+ "Input is verified to be in range and then checked by the boolean function numExists to make sure the user\n"
				+ "number has not been duplicated. Once all 9 numbers have been verified and entered, the displaySquare method\n"
				+ "is called. The displaySquare method takes the passed one dimensional array and creates a 3x3 multidimensional\n"
				+ "array and loads it. The method then iterates through the multidimensional array and prints it to the console"
				+ "\n\nThis method also includes a method call to the showMessage method that displays this message.\n\n");
	}
	
	public static void showMenu() {
		
		System.out.println(header);
		System.out.println("Please pick an option or enter -1 to exit.");
		System.out.println("1) Question 1a-c | ages array");
		System.out.println("2) Question 2 a-b | names array");
		System.out.println("3) Question 3 Answer");
		System.out.println("4) Question 4 Answer");
		System.out.println("5) Question 5 & 6 | nameLengths");
		System.out.println("7) Question 7 | String Concatenation");
		System.out.println("8) Question 8 | Full Name");
		System.out.println("9) Question 9 | Sum of array");
		System.out.println("10) Question 10 | Average of doubles");
		System.out.println("11) Question 11 | Average of two arrays");
		System.out.println("12) Question 12 | willBuyDrink");
		System.out.println("13) Question 13 | Soduku Square| Custom Method(s)");
	}//end show menu
	
	
   	}//end class ArraysAndMethods
