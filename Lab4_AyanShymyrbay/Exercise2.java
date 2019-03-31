// Created by Ayan Shymyrbay 9/02/18
//Check whether string is palindrome or not


import java.util.Scanner;

public class Exercise2 {
	public static void main(String[]args){
		Scanner scan = new Scanner(System.in);
		String s,s2,reverse="";
		System.out.print("Enter string: ");
		s = scan.nextLine();
		s2 = s.toLowerCase();
		int count = s2.length();
		
		for(int i = count - 1; i >= 0 ; i-- ){
			reverse = reverse + s2.charAt(i);
		}
		
		if(s2.equals(reverse)){
			System.out.println(s + " is a palindrome!");
		}
		else{
			System.out.println(s + " is not a palindrome!");
		}
		scan.close();
	}

}
