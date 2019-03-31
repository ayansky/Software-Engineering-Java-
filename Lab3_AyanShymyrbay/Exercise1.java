//Created by Ayan Shymyrbay 2/Feb/18
//Exercise 1. Convert Binary to Hexadecimal and Octal
import java.util.Scanner;

public class Exercise1 {
	
	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the binary number: ");
		int binaryNum = input.nextInt();
		toHexForm(binaryNum);
		toOctForm(binaryNum);
		input.close();
	}
	public static void toHexForm(int bin) {
		char hexForm[] = new char[100000];
		int group4,a;
		int i=1;
		char hex[]= {'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
		while(bin != 0) {
			a =1;
			group4 = 0;
			//anyBinaryNumber%10 results either 1 or 0
			//below 'for-loop' converts binary to decimal
			//by grouping by 4 for hexadecimal 
			for( int j=1; j < 5; j++) {
				int  rem= bin % 10;
				group4 = group4 + rem * a;
				a = a *2;
				bin = bin / 10;
			}
			
			hexForm[i++] = hex[group4];
		}
		System.out.print("Hexadecimal value: ");
		for ( int j = i - 1; j > 0; j--) {
		System.out.print(hexForm[j]);	
		}
	}
	public static void toOctForm(int bin) {
		int octForm[] = new int[100000];
		int group3,a;
		int i=1;
		while(bin != 0) {
			a =1;
			group3=0;
			//anyBinaryNumber%10 results either 1 or 0
			//below 'for-loop' converts binary to decimal
			//by grouping by 3 for octal 
			for( int k=1; k < 4; k++) {
				int  rem= bin % 10;
				group3 = group3 + rem * a;
				a = a *2;
				bin = bin / 10;
			}
			
			octForm[i++]=group3;
		}
		System.out.print("\nOctal value: ");
		for ( int j = i - 1; j > 0; j--) {
		System.out.print(octForm[j]);	
		}
	}
}