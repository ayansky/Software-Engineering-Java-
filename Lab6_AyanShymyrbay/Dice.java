//Created by Ayan Shymyrbay 23/02/2018

import java.util.Random;

public class Dice {
	int randomNumber;
	// no-arg constructor
	Dice(){
		
	};
	
	public int roll() {
		// Generating random number 
		Random rand = new Random();
		randomNumber = rand.nextInt(6) + 1;
		return randomNumber;
	}

}
