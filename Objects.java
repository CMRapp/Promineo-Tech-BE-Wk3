package week3ArraysAndMethods;

import java.util.Arrays;
import java.util.Scanner;

public class Objects {

	public static void main(String[] args) {
		// declare variables
		
		int age = 34; 							//Primitive data type (just a value) lowercase
		
		String name = "Sample Text"; 				//object (has properties & methods)
		System.out.println(name.length()); 		// dot (.) notation
		System.out.println(name.charAt(6));
		System.out.println(name.toUpperCase());
		System.out.println(name.toLowerCase());
		System.out.println(name.concat("!!"));
		System.out.println(name.replace('e', 'E'));
		
		Scanner s= new Scanner(System.in);
		
		int[] numbers = {1,27,99,32,2};			// object containing Primitives 
		System.out.println(numbers.length);
		System.out.println(Arrays.toString(numbers));
		int[] numbers2 = numbers.clone();
		numbers[2] = 3;
		
		if (Arrays.equals(numbers, numbers2)) {
			System.out.println("The arrays are equal");
		} else {
			System.out.println("The arrays are not equal.");
		}
		
		int[] numbers3 = {1,22,90,5};
		Arrays.fill(numbers,8);
		System.out.println(Arrays.toString(numbers));
		
		
		
	}//end main

}// class Objects
