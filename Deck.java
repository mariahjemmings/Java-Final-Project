package finalp;
import java.io.*;
import java.util.*;

public class Deck{
	public List <Card> cards = new ArrayList <> ();
	
	

	public String[] suits = {"spades", "diamonds", "hearts", "clubs"};
	
	
	
	
	public Deck () {
		
		for (int i=2; i<=14; i++) {
			for (int j=0; j<4; j++) {
				
				Card b = new Card ();
				b.setValue(i);
				b.setName(" of " + suits[j]);
				
				cards.add(b);
				
			
		}}
	}
	


			

		



	

	public List<Card> Shuffle (){

		
		Collections.shuffle(cards);
		
		return cards;}
		

		StringBuilder c = new StringBuilder ();
		
		List<Card> list = new ArrayList<Card>();
			
		
			public Card Draw () {
				cards.add(cards.remove(0));
				
				return cards.get(51);

			}}




