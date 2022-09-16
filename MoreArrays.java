package week3ArraysAndMethods;

import java.util.Scanner;

public class MoreArrays {

		static Scanner sc = new Scanner(System.in);
		
	public static void main(String[] args) {
		// declare variables
		
		String[] products = new String[5];
		
		products[0] = "Carrots";
		products[1] = "Pineapples";
		products[2] = "Tomatoes";
		products[3] = "Potatoes";
		products[4] = "Cereal";
		
		for (String product : products) {
			System.out.println("Product : " + product);
		}
		
		int[] multiplesof3 = new int[10];
		
		for (int i = 1; i <= multiplesof3.length; i++) {
			multiplesof3[i - 1] = i * 3;
			System.out.println("number: " + multiplesof3[i-1]);
		}// end for
		
		int[] multiplesOf5 = new int [10];
		for (int i = 0; i < multiplesOf5.length; i++){
			multiplesOf5[i] = (i+1) * 5;
			System.out.println(multiplesOf5[i]);
		}// end for
		
		
	}// end main
	
	

}//end class MoreArrays
