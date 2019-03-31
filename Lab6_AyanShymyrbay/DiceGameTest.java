//Created by Ayan Shymyrbay 23/02/2018

import java.util.Scanner;

public class DiceGameTest {
	public static void main(String [] args) {
		
		// Test Game
		Game game = new Game();
		
		//Invoking play method
		game.play();
		
		//Printing out the winner and his/her score
		System.out.println("The winner is " + game.winner().name + " with score "+game.winner().score);
	}
}
