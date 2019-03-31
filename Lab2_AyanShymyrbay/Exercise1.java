//Exercise 1. Finding Greatest Common Divisor of Two Numbers
import java.util.Scanner;

public class Exercise1 {
	public static int GCD(int a, int b) {
		int c;
		int r;
		//if a < b swap them
		if(a < b) {
			c = a;
			a = b;
			b = c;
		}
		if(a%b==0) {
			r = b;
			return r;
		}
		else {
			r = a%b;
			a = b;
			b = r;
			return GCD(a,b);
		}
	}
	
	public static void main(String []args) {
		//Creating a Scanner object
		Scanner number = new Scanner(System.in);
		int a;
		int b;
		System.out.print("Enter two integer numbers: ");
		a = number.nextInt();
		b = number.nextInt();
		
		System.out.println("GCD of " +a+ " and " +b+" is "+GCD(a,b));
	}
}
