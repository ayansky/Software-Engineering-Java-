//Created by Ayan Shymyrbay 23/02/2018

import java.util.Scanner;

public class Game {
	//instance variables
	public Player playerA; 
	public Player playerB; 
	public Player playerC;
	
	public Dice d1;
	public Dice d2;
	
	// no-arg constructor 
	Game(){
		playerA = new Player(201445540, "Ayan");
		playerB = new Player(201539221, "Miras");
		playerC = new Player(201459020, "Adilya");
		
		d1 = new Dice();
		d2 = new Dice();
	}
	
	// returns the winner player 
	Player winner(){
			Player winner = null;
			if((playerA.score > playerB.score)&&(playerA.score > playerC.score)) {
				winner = playerA;
			}else if((playerB.score > playerA.score)&&(playerB.score > playerC.score)) {
				winner = playerB;
			}else if((playerC.score > playerA.score)&&(playerC.score > playerA.score)){
				winner = playerC;
			}
			return winner;
	}
	
	public void play() {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the number of rounds: "); 
		int n = scan.nextInt();
		System.out.println("/////////// start ////////////");
		
		for(int i = 1; i <= n; i++) {
			
			d1.roll();
			d2.roll();
			playerA.updateScore(d1, d2);
			d1.roll();
			d2.roll();
			playerB.updateScore(d1, d2);
			d1.roll();
			d2.roll();
			playerC.updateScore(d1, d2);
			System.out.println("After " + i + " round");
			System.out.println(playerA.toString());
			System.out.println(playerB.toString());
			System.out.println(playerC.toString());
			System.out.println();
			
		}
		System.out.println("///////////// end ///////////////");
		scan.close();
	}
}
