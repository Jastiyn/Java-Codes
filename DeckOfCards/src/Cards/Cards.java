package Cards;
	import java.util.Random;
	
public class Cards {
		String [] SUITS = {"Clubs", "Spades", "Hearts", "Diamonds"};
		String [] ROWS = {"King", "Queen", "Jack", "10", "9", "8", "7", "6", "5", "4", "3", "2", "Ace"};
		
	void PickedCards () {
		Random shfl = new Random();
		
		for (int i = 0; i < 4; i++) {
			int S = shfl.nextInt(SUITS.length);
			int R = shfl.nextInt(ROWS.length);
			if (SUITS.equals ("Diamonds") && SUITS.equals ("Hearts")) {
				System.out.println(SUITS [S] + " of " + ROWS [R] +  "Red");
			}
			else if (SUITS.equals ("Spades") && SUITS.equals ("Clubs")){
				System.out.println(SUITS [S] + " of " + ROWS [R] + " Black");
				
			}
			
			System.out.println( ROWS [R] + " OF " + SUITS [S]);
		}
	}

	public static void main(String[] args) {
		System.out.println("_____Your 4 cards_____");
		System.out.println("");
		Cards c = new Cards();
		c.PickedCards();
       System.out.println("______________________");
	}

}
