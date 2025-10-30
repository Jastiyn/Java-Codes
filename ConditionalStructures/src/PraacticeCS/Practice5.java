package PraacticeCS;

import java.util.Scanner;
public class Practice5 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		float taxes = scan.nextFloat();
		
		if (taxes >= 0 && taxes <= 2000.00) {
			System.out.printf("Isento");
		} else if (taxes >= 2000.01 && taxes <= 3000.00) {
			System.out.printf("R$ %.2f\n", taxes * .08);
		} else if (taxes >= 3000.01 && taxes <= 4500.00) {
			System.out.printf("R$ %.2f\n", taxes * .18);
		} else if (taxes > 4500.00) {
			System.out.printf("R$ %.2f\n", taxes * .28);
		}

	}

}
