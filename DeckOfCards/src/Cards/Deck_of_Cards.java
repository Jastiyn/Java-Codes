package Cards;
import java.util.Random;
import java.util.Scanner;

public class Deck_of_Cards {
	String[] SUITS = {"Clubs", "Hearts", "Spades", "Diamonds"};
	String[] ROWS = {"Ace", "1", "2", "3", "4", "5", "6", "7", "8", "9","10", "Jack", "Queen", "King"};
	
	public static void Homepage() {
		Scanner scan = new Scanner(System.in);
		System.out.println("-------------------------------");
		System.out.println("Pick Again Bitch!!!");
		System.out.println("[1] Continue");
		System.out.println("[2] Exit");
		System.out.println("-------------------------------");
		String choice = scan.next();

		if (choice.equals("1")) {
			System.out.println("Shuffling...");
			Deck_of_Cards c = new Deck_of_Cards();
	        c.PickedCards();
		} else if (choice.equals("2")) {
			System.out.println("Exit");
		} else {
			System.out.println("[ERROR] Choose 1 or 2 only");
			Homepage();
		}

	}
	
	void PickedCards (){
        Random shfl = new Random();
        
        for (int i = 0; i < 4; i++){
            int S = shfl.nextInt(SUITS.length);
            int R = shfl.nextInt(ROWS.length);
            
            System.out.println(ROWS [R] + " of " + SUITS [S]);
        }
        Homepage();
    }

    public static void main(String[] args) {
        System.out.println("_ Your 4 Cards _");
        System.out.println("");
        Deck_of_Cards c = new Deck_of_Cards();
        c.PickedCards();
        System.out.println("___________________");
    }
}
