//Exercise 1. Reading an integer number entered by the user

import java.util.Scanner; // program uses class Scanner

public class GetInteger {
	public static void main( String[] args) {
		//Create a Scanner object
		Scanner input = new Scanner( System.in);
		
		int number;
		
		System.out.print("Enter any integer number: ");
		number = input.nextInt();
		
		System.out.println("The number entered by the user: " +number);
	}

}
