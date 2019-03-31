//Created by Ayan Shymyrbay 2/Feb/18
//Exercise 4. Leap or Not Leap Year
import java.util.Scanner;

public class Exercise4 {

	public static void main(String []args) {
		//Creating a Scanner object
		Scanner input = new Scanner(System.in);
		int year;
		System.out.print("Enter a year: ");
		year = input.nextInt();
		input.close();
		boolean leap;
		
		if(year % 4 == 0)
        {
            if( year % 100 == 0)
            {
                if ( year % 400 == 0)
                    leap = true;
                else
                    leap = false;
            }
            else
                leap = true;
        }
        else {
            leap = false;
        }

        if(leap==true)
            System.out.println(year + " is a leap year.");
        else
            System.out.println(year + " is not a leap year.");
    }
}