package week3ArraysAndMethods;

import java.util.Scanner;

public class Week3Labs {

		public static void main(String[] args) {
		
		System.out.println("Christian M Rapp | Promineo Tech BE");
		System.out.println("Week 3 Labs");
		System.out.println();
		
				
		int[] intArray = {1,5,2,8,13,6};
		System.out.println("1) First element in the array: " + intArray[0]);
		System.out.println("2) Last element in the array: " + intArray[intArray.length-1]);
		System.out.println("3) Printing element 6 of the array causes an OutOfBoundsExcepton error.");
		System.out.println("4) Printing element 1- of the array causes an OutOfBoundsExcepton error.");
		
		System.out.print("5) Traditional for loop for printing out array contents: ");
		for(int i=0; i < intArray.length; i++) {
			System.out.print(intArray[i] + " ");
		}
		System.out.println();
		
		System.out.print("6) Enhanced for loop for printing out array contents: ");
		for(int ints : intArray) {
			System.out.print(ints + " ");
		}
		System.out.println();
		
		System.out.print("7) Sum of numbers in the array: ");
		int sum = 0;
		for (int ints: intArray) {
			sum += ints;
		}
		System.out.print(sum);
		System.out.println();
		
		System.out.print("8) Average of numbers in the array: ");
		int average = sum / intArray.length;	
		System.out.print(average);
		System.out.println();
		
		System.out.print("9) Odd in the array: ");
		for (int ints : intArray) {
			if (ints % 2 !=0) {
				System.out.print(ints + " ");
			}
		}
		System.out.println();
		
		String[] nameArray = new String[] {"Sam", "Sally", "Thomas", "Robert"};
		System.out.print("11) Sum of all the letters in the array ");
		int letterSum = 0;
		for (String name : nameArray) {
			letterSum += name.length();
		}
		System.out.print(letterSum);
		
			
		
		/********************************************/
		
		System.out.println("\n\nMETHODS:");
		printGreeting("Christian");
		System.out.println("Hello, " + printGreeting2("Christian Rapp")+ "!");
		
		System.out.print("T/F Letters in string are greater than number: " + numberOfLetters("Pineapple", 5));
		System.out.println();
		
		String[] wordArray = {"Apples","Oranges", "Grapefruit", "Bananas"};
		System.out.println("T/F Is word string in the array: " + stringExists(wordArray, "Elephant"));
		
		System.out.print("The smallest number in the array is: " + smallestNumber(intArray));
		
		double[] dblArray = {22.6, 99.2, 60, 88.6, 42.3};
		System.out.print("\nThe average of the double array is: " + calculateAverage(dblArray));
		
		System.out.print("\nThe string length of the string array is: " );
		int[] nameLengths = extractStringLengths(wordArray);
			for (int number : nameLengths) {
				System.out.print(number + " ");
			}
		System.out.println();
		
		System.out.println("T/F The sum of the strings with even letters is\n   greater than the strings with odd letters: " + hasMoreEvenWordCharacters(wordArray));
		
		System.out.println("\nNOTE: Comparison below is CASE SENSITIVE");
		System.out.println("tacocat is a palimdrome: " + isPalindrome("tacocat"));
		System.out.println("TacoCat is a palimdrome: " + isPalindrome("TacoCat"));
		System.out.println("christian is a palindrome: " + isPalindrome("christian"));
		
	}//end main
	
		public static void printGreeting(String name) {
			System.out.println("Hello, "+ name +"!");
		}
		
		public static String printGreeting2(String name2) {
			return name2;
		}

		public static boolean numberOfLetters(String word, int number) {
			return word.length() > number;
		}
		
		public static boolean stringExists(String[] strArray, String string) {
			for (String words : strArray) {
				if (words.equals(string)) {
					return true;
				}
			}
			return false;
		}
		
		public static int smallestNumber (int[] intArray) {
			int holder = intArray[0];
			for (int number : intArray) {
				if (holder > number) {
					holder = number;
			}
		}
			return holder;
		}
		
		public static double calculateAverage(double[] numbers) {
			double sum = 0;
			for (double number : numbers) {
				sum += number;			
			}
			return sum / numbers.length;
		}
		
		public static int[] extractStringLengths(String[] strings) {
			int[] results = new int[strings.length];
			for(int i=0; i < strings.length; i++) {
				results[i] = strings[i].length();
			}
			return results;
		}
		
		public static boolean hasMoreEvenWordCharacters(String[] strArray) {
			int evenLetters = 0;
			int oddLetters = 0;
			
			for (String string : strArray) {
				if (string.length() % 2 ==0) {
					evenLetters += string.length();
				} else {
					oddLetters += string.length();
				}
			}
			return evenLetters > oddLetters;
		}
		
		public static boolean isPalindrome(String string) {
			for(int i=0; i < string.length() / 2; i++ ) {
				if (string.charAt(i) != string.charAt(string.length() - i - 1)) {
					return false;
				}
			}
			return true;
		}

}//end class Week3Labs