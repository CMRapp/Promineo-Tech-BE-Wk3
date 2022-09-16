package week3ArraysAndMethods;

import java.util.Scanner;

public class Practice {
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
	displaySquare(getUserInput());

	}// end main

	
// *****************************************************************************
    
    public static int[] getUserInput() {
    	int[] userArray = {0,0,0,0,0,0,0,0,0};
    	int intInput = 0;
    	
    	for (int i = 0; i < userArray.length; i++) {
    		System.out.print("Enter a number 1-9: ");  
			intInput = sc.nextInt();
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
    	
    	
}// end practice

