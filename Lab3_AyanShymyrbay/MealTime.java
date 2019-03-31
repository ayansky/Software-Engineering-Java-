//Exercise 5. MealTime 
import java.util.Scanner;

public class MealTime {
	
	public static void main(String[] args) {
		//Part a. Just asking question
		Scanner scan = new Scanner(System.in);
		String meal[]= {"breakfast","lunch","dinner"};
		for(int i=0; i<3;i++) {
			repeatAskWhatYouAteFor(meal[i]);
			String yourMeal = scan.nextLine();
			System.out.println("You had " + yourMeal + " for " +meal[i]+".\n");
		}
		//Part b. Ask,Input,Answer
		askWhatYouAteFor("breakfast");
		askWhatYouAteFor("lunch");
		askWhatYouAteFor("dinner");
		scan.close();
  }
	public static void askWhatYouAteFor(String meal) {
		Scanner scan = new Scanner(System.in);
		System.out.println("What did you eat for "+meal+"?");
		String yourMeal = scan.nextLine();
		System.out.println("You had " + yourMeal + " for " +meal+".\n");
	}
	public static void repeatAskWhatYouAteFor(String meal) {
		System.out.println("What did you eat for "+meal+"?");
	}
}