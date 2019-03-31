//Exercise 2. Fibonacci Series

public class Exercise2 {
    public static void main(String[] args) {
        //Initializing current value and previous value
    	int current = 1;
        int previous = 0;
        int hold;
        //Printing out a first term of the series
        System.out.print(" " +previous);
        
        //Calculating the values of consecutive terms and printing them
        while(current < 10000){
            System.out.print(" "+ current);
            hold = current;
            current = current + previous;
            previous = hold;

        }
    }
}
