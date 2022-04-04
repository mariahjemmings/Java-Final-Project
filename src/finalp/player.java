package finalp;

import java.util.ArrayList;

public class player {
	int score;
	
	
	public player () {
		 score = 0;
	}
	public ArrayList <Integer> hand = new ArrayList <> ();
	public ArrayList <String> list = new ArrayList <> ();
	
	public String name;
	card card = new card ();
	deck deck = new deck();
	
	public void describe (String nameOfPlayer, String ageofPlayer) {
		System.out.println("Player Name: "+ nameOfPlayer);
		System.out.println("Player Age: " + ageofPlayer);
		for (int i=0; i<hand.size(); i++) {
			System.out.println(card.describe(hand.get(i))); 
			
		}}
		public int flip () {
			hand.add(hand.remove(0));
			return hand.get(hand.size()-1);
		
	}
	
	public int draw (deck deck) {
		hand.add(deck.Draw());
	return hand.get(hand.size()-1);}
	
		
		
		public int incrementScore () {
			return score+=1;
		}
	}

