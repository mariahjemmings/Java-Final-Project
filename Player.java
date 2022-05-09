package finalp;

import java.util.ArrayList;

public class Player {
	int score;
	
	
	public Player () {
		 score = 0;
	}
	public ArrayList <Card> hand = new ArrayList <> ();
	public ArrayList <Card> list = new ArrayList <> ();
	
	public String name;
	Card a = new Card();


	
	
	
	
	
	Deck deck = new Deck();
	
	public void describe (String nameOfPlayer, String ageofPlayer) {
		System.out.println("Player Name: "+ nameOfPlayer);
		System.out.println("Player Age: " + ageofPlayer);
		for (int i=0; i<hand.size(); i++) {
			a.describe(hand.get(i)); 
			
		}}
		public Card flip () {
			hand.add(hand.remove(0));
			return hand.get(hand.size()-1);
		
	}
	
	public Card draw (Deck deck) {
		hand.add(deck.Draw());
	return hand.get(hand.size()-1);}
	
		
		
		public int incrementScore () {
			return score+=1;
		}
	}

