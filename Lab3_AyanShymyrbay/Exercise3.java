//Created by Ayan Shymyrbay 2/Feb/18
//Exercise 3. Middle character
import java.util.Scanner;
public class Exercise3 {
  public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int start;
        int end;
        System.out.print("Input a string: ");
        String a = input.nextLine();
        if (a.length() % 2 == 0)
        {
            start = a.length() / 2 - 1;
            end = 2;
        }
        else
        {
            start = a.length() / 2;
            end = 1;
        }
        System.out.print("The middle character in the string is " + a.substring(start,start+end)+"\n");
        input.close();
    }
}
 