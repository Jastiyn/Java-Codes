package FOP;
import java.util.Scanner;

public class Coordinates {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		float X = scan.nextFloat();
		float Y = scan.nextFloat();
		
		if (X == 0 && Y == 0) {
			System.out.printf("Origem\n");
			
		} else if (X == 0) {
			System.out.printf("Eixo Y\n");
			
		} else if (Y == 0) {
			System.out.printf("Eixo X\n");
			
		} else if (X > 0 && Y > 0) {
			System.out.printf("Q1\n");
			
		} else if (X > 0 && Y < 0) {
			System.out.printf("Q4\n");
		
		} else if (X < 0 && Y > 0) {
			System.out.printf("Q2\n");
			
		} else if (X < 0 && Y < 0) {
			System.out.printf("Q3\n");
			
		}

	}

}
