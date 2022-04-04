package finalp;
import java.io.*;
import java.util.*;

public class deck{
	public ArrayList <Integer> cards = new ArrayList <> ();
	public ArrayList <String> cardNames= new ArrayList <> ();
	

	public String[] suits = {"spades", "diamonds", "hearts", "clubs"};
	card a = new card ();
	

	
	public deck () {
		
		for (int i=2; i<=14; i++) {
			for (int j=0; j<4; j++) {
				a.setValue(i);
				a.setName(a.getValue()+ " of " + suits[j]);
				cards.add(a.getValue());
				
			
		}}
	}
		


			

		



	

	public ArrayList<Integer> Shuffle (){

		
		Collections.shuffle(cards);
		
		return cards;}
		

		
			
		
			public int Draw () {
				cards.add(cards.remove(0));
				
				return cards.get(51);

			}}




