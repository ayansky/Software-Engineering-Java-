//Created by Ayan Shymyrbay 23/02/2018

public class Player {
	//instance variables
	int id;
	String name;
	int score;
	
	//no-arg constructor 
	Player(){
	}
	
	//Parameterized constructor with arguments id and name
	Player(int id, String name){
		this();
		this.id = id;
		this.name = name;
	}
	
	public void updateScore(Dice d1, Dice d2) {
		int sum = d1.randomNumber + d2.randomNumber;
		if(sum%2==0) {
			score+= 0 ;
		}
		else {
			score+= sum;
		}
	}
	
	public String toString() {
		return name +"'s score is [ " + score+" ]";
	}
}
