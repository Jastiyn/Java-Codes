package Cards;
import java.util.Scanner;
import java.util.Random;

public class main {

	public static void main(String[] args) {
		Menu();

	}
	public static void Menu() {
		Scanner in = new Scanner (System.in);
		System.out.println("---------------------------------");
		System.out.println("Do you want to play cards?");
		System.out.println("[Start]");
		System.out.println("[Exit]");
		System.out.println("---------------------------------");
		String pick = in.next().toLowerCase();
		
		if (pick.equals("start")) {
			main.Start();
		}
		else if (pick.equals("exit")) {
			System.exit(0);
		}
		else {
			System.out.println("None of the choices, try again");
			main.Menu();
		}
		
	}
	public static void Start() {
		Scanner in = new Scanner (System.in);
		System.out.println("---------------------------------");
		System.out.println("Ready to pick your cards?");
		System.out.println("[Play]");
		System.out.println("[Cancel]");
		System.out.println("[Exit]");
		System.out.println("---------------------------------");
		String pick = in.next().toLowerCase();
		
		if (pick.equals("play")) {
			main.Shuffle();
		}
		else if (pick.equals("cancel")) {
			main.Menu();
		}
		else if (pick.equals("exit")) {
			System.exit(0);
		}
		else {
			System.out.println("None of the choices, try again");
			main.Start();
		}
	}
	public static void Shuffle() {
		String [] SUITS = {"Clubs", "Spades", "Hearts", "Diamonds"};
		String [] ROWS = {"King", "Queen", "Jack", "10", "9", "8", "7", "6", "5", "4", "3", "2", "Ace"};
		Random shfl = new Random();
		
		System.out.println("---------------------------------");
		for (int i = 0; i < 4; i++) {
			int S = shfl.nextInt(SUITS.length);
			int R = shfl.nextInt(ROWS.length);
			
			System.out.println( ROWS [R] + " OF " + SUITS [S]);
			
		}
		System.out.println("---------------------------------");
		main.Replay();

	}
	public static void Replay() {
		
		System.out.println("---------------------------------");
		System.out.println("Want to play again?");
		System.out.println("[Yes]");
		System.out.println("[No]");
		System.out.println("---------------------------------");
		Scanner in = new Scanner (System.in);
		String pick = in.next().toLowerCase();
		
		
		if (pick.equals("yes")) {
			main.Shuffle();
		}
		else if (pick.equals("no")) {
			System.exit(0);
		}
		else {
			System.out.println("None of the choices, try again");
			main.Replay();
		}
	}

}
