//Created by Ayan Shymyrbay 2/Feb/18
//Exercise 2. Counter
import java.util.Scanner;
public class Exercise2 {
    
 public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
	 	System.out.print("Enter a string: ");
		String a = input.nextLine();
		countFromString(a);
		input.close();
	}
	public static void countFromString(String s){
		char[] ch = s.toCharArray();
		int letter = 0;
		int space = 0;
		int number = 0;
		int other = 0;
		for(int i = 0; i < s.length(); i++){
			if(Character.isLetter(ch[i])){
				letter ++ ;
			}
			else if(Character.isDigit(ch[i])){
				number ++ ;
			}
			else if(Character.isSpaceChar(ch[i])){
				space ++ ;
			}
			else{
				other ++;
			}
		}
		System.out.println("No. of letters: " + letter);
		System.out.println("No. of spaces: " + space);
		System.out.println("No. of numbers: " + number);
		System.out.println("No. of other characters: " + other);
			}
}