package finalp;

public class Card {
	
		private  int value;
		private String name;
		
	
		public Card () {};
		public Card (int Value, String Name) {
			this.value = value;
			this.name = name;
		
			
		}

		public int getValue() {
			return value;
		}
		public void setValue(int value) {
			this.value = value;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;}
		
		public void describe (Card a) {
			System.out.println("This card is "+ a);}
			
	
	}
		
	



