package finalp;

import java.util.Scanner;

public class App {



	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		while (true) {
			Scanner kb  = new Scanner(System.in);
			Deck b = new Deck();
			Player player1=new Player();
			Player player2=new Player();
		b.Shuffle();
		
		
		for (int i=0;i<52;i++) {
			
			if (i%2==0) {
				player1.draw(b);
			}
			else if (i%2!=0){
				player2.draw(b);
				
			}}
		
			
		
	
			for (int i=0; i<=25; i++) {
				
				Card player1Value= player1.flip();
				Card player2Value=player2.flip();


				if (player1Value.getValue()>player2Value.getValue()){
					player1.incrementScore();}
				else if (player2Value.getValue()>player1Value.getValue()){
					player2.incrementScore();}
				
				
			
			
			
			
			
			
			
			
			
			
			
			
			
			}
			System.out.println("FINAL SCORES: WHO IS OUR WINNER???");
		System.out.println("Player 1: " + player1.score);
		System.out.println("Player 2: " + player2.score);
		
		if (player1.score>player2.score) {
			
			System.out.println("CONGRATULATIONS PLAYER 1!!! PLAY AGAIN? Y OR N");
			String response = kb.nextLine();
				if (response.equals("N")) {
					System.out.println("THANK YOU FOR PLAYING!");
					break;}
				else if (!response.equalsIgnoreCase("N")&&!response.equalsIgnoreCase("Y")) {
					System.out.println("INVALID RESPONSE");
					break;}
				
		}
			else if (player2.score>player1.score) {
				System.out.println("CONGRATULATIONS PLAYER 2!!! PLAY AGAIN? Y OR N");
				String response = kb.nextLine();
				if (response.equalsIgnoreCase("N")) {
					System.out.println("THANK YOU FOR PLAYING!");
					break;}
				else if (!response.equalsIgnoreCase("N")&&!response.equalsIgnoreCase("Y")) {
					System.out.println("INVALID RESPONSE");
				break;}}
			
					
				
			
				
				
			
			else if (player2.score==player1.score){
				System.out.println("IT'S A TIE. PLAY AGAIN? TYPE Y OR N");
				String response = kb.nextLine();
						if (response.equalsIgnoreCase("N")) {
							System.out.println("THANK YOU FOR PLAYING!");
							break;}
						else if (!response.equals("N")&&!response.equals("Y")) {
							System.out.println("INVALID RESPONSE");
						break;}}
				
			}
		
			
	

	}}
		
				
				
			
				

				
			
				
					
				
	
	
				
			
		
			
			
		
		
		

	


