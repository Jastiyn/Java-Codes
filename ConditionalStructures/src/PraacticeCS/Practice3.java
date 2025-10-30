package PraacticeCS;

import java.util.Scanner;

public class Practice3 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int a = in.nextInt();
		int b = in.nextInt();
		int c = in.nextInt();
		
		if (a > b && a > c) {
			System.out.println("The greatest: " + a);
		}
		if (b > a && b > c) {
			System.out.println("The greatest: " + b);
		}
		if (c > b && c > a) {
			System.out.println("The greatest: " + c);
		}
	}

}
