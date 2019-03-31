//Exercise 3. Summation of two entered integer numbers and check the type and sign of the sum

import java.util.Scanner; // program uses class Scanner

public class AdditionNumbers {
	public static void main( String[] args) {
		//Create a Scanner object
		Scanner input = new Scanner( System.in);
		
		int number1;
		int number2;
		int sum;
		
		//Prompt a user to enter two integer numbers
		System.out.print("Enter two decimal numbers: ");
		number1 = input.nextInt();
		number2 = input.nextInt();
		
		// arithmetic summation of numbers
		sum = number1 + number2;
		
		System.out.println("The sum of " +number1+ " and " +number2+ " is " +sum);
		
		//Identifying the sign and type(even/odd) of the sum
		if( sum == 0) {
			//Special case when sum is zero
			System.out.println("The number is zero");
		}
		else if (sum < 0) {
			//Sum is negative 
			if (sum%2 == 0) {
				//Sum is even
				System.out.println(+sum+ " is negative and even");
			}
			else {
				//Sum is odd
				System.out.println(+sum+ " is negative and odd");
			}
	    }
		else {
			////Sum is positive
			if (sum%2 == 0) {
				//Sum is even
				System.out.println(+sum+ " is positive and even");
			}
			else {
				//Sum is odd
				System.out.println(+sum+ " is positive and odd");
			}
		}
			
		}

}

