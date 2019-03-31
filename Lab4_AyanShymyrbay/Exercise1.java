// Created by Ayan Shymyrbay 9/02/18
//Reverse entered integer number

import java.util.Scanner;

public class Exercise1 {
	public static void main(String []args){
		//Create a Scanner object
		Scanner scan = new Scanner(System.in);
		int num;
		int reverseNum = 0;
		System.out.print("Enter the number: ");
		num = scan.nextInt();
		while(num!=0){
			reverseNum = reverseNum*10;
			reverseNum = reverseNum + num%10;
			num = num/10;
			
		}
		System.out.println("The reverse of the number is: " + reverseNum);
		scan.close();
	}//end main

}//end class
