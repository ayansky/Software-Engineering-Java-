//Exercise 4. Calculating an approximation of Pi number
// by using 'for loop' 100,500,1000,5000,10 000 times
import java.lang.*;

public class CalculatingPi {

	public static void main(String[] args) {
		
		int a = 100;
		int b = 500;
		int c = 1000;
		int d = 5000;
		int e = 10000;
		System.out.println("When 'for loop' is run "+ a + " times, Pi is " +PiApprox(a) );
		System.out.println("When 'for loop' is run "+ b + " times, Pi is " +PiApprox(b) );
		System.out.println("When 'for loop' is run "+ c + " times, Pi is " +PiApprox(c) );
		System.out.println("When 'for loop' is run "+ d + " times, Pi is " +PiApprox(d) );
		System.out.println("When 'for loop' is run "+ e + " times, Pi is " +PiApprox(e) );
	}
	
	//Function used to approximate Pi number
	public static double PiApprox( int n) {
		 
		double P=0;// initializing P(Pi) variable
		int i;
		double denominator = 1;//initializing denominator
	    //For loops by using given (Leibniz) formula
	      for (i = 0; i < n; i++) {
	 
	         if (i % 2 == 0) {
	            P = P + (1 / denominator);
	         } else {
	            P = P - (1 / denominator);
	         }
	         denominator = denominator + 2;
	      }
	     
	      return P*4;
}
}
	