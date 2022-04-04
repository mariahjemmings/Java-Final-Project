package finalp;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

public class testing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		ArrayList <String> cards = new ArrayList <String>();

		String[] suits = {"spades", "diamonds", "hearts", "clubs"};
		
		card a = new card ();
		
		
		for (int i=2; i<=14; i++) {
			for (int j=0; j<4; j++) {
				
				a.setValue(i);
				a.setName(a.getValue() + " of " + suits[j]);
				cards.add(a.getName());}}
		
		System.out.println(cards);
		player y = new player ();
		deck x = new deck ();
		System.out.println(x.Shuffle());
		System.out.println(x.Draw());
		System.out.println(y.draw(x));
		System.out.println(y.flip());
		y.describe("Mariah","27");
	}}
	

	
	

		
		


				






