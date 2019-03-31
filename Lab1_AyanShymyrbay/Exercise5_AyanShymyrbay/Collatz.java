//Exercise 5 (first). Collatz Conjecture 
import java.lang.*;

public class Collatz { 
	public static void main(String[] args) {
		
		//Run configuration-> Arguments-> Variable (number) e.g. 25
		int n = Integer.parseInt(args[0]);
		System.out.print("Enter an integer n: " + n +"\n");
		collatz(n);
		System.out.println();
	}
	
	// Function collatz() that implements Collatz conjecture 
	public static void collatz(int n) {
		System.out.print(n + " ");
		if (n == 1) {
			return; 
		} else if (n % 2 == 0) {
			collatz(n / 2);
		} else {
		  collatz(n * 3 + 1);
		}	 	
	}

}