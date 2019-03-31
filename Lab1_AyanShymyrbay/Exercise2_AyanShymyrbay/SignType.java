//Exercise 2. Identifying the sign and the type of the entered number

import java.util.Scanner; // program uses class Scanner

public class SignType {
	public static void main( String[] args) {
		//Create a Scanner object
		Scanner input = new Scanner( System.in);
		
		int number;
		//Prompt a user to input a number
		System.out.print("Enter any integer number: ");
		number = input.nextInt();
		
		//Conditions to check type&sign of the number
		if( number == 0) {
			//Special case when the number is zero
			System.out.println("The number is zero");
		}
		else if (number < 0) {
			//When number is negative
			if (number%2 == 0) {
				//When number is even
				System.out.println(+number+ " is negative and even");
			}
			else {
				//When number is odd
				System.out.println(+number+ " is negative and odd");
			}
	    }
		else {
			//When number is positive
			if (number%2 == 0) {
				//When number is even
				System.out.println(+number+ " is positive and even");
			}
			else {
				//When number is odd
				System.out.println(+number+ " is positive and odd");
			}
		}
			
		}

}

