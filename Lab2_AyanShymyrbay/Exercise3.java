//Exercise 3. Triangle
import java.util.Scanner;

public class Exercise3 {
    public static void main(String[]args){
        //Creating a Scanner object
        Scanner input = new Scanner(System.in);

        int n; //Input number
        int count=1;
        int column=1;
        System.out.print("Enter a number n: ");
        n = input.nextInt();

        //number of rows depending on the input number(count)
        for( int row=1; count < n; row++){

            if(n - count > column) {
                for(column = 0; column < row; column++){
                    //double space between numbers
                    if(count<=10) {
                        System.out.print( count+ "  " );
                        count++;
                    }
                    //one space between numbers
                    else{
                        System.out.print( count+ " " );
                        count++;
                    }
                }//end of row
                System.out.print("\n");
            }
        }//end of for loop,triangle is done
    }//end of main
}//end of class

