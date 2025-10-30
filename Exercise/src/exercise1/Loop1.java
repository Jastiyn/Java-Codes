package exercise1;

import java.util.Scanner;

public class Loop1 {

	public static void main(String[] args) {
		
		int num;
		int positive = 0;
		Scanner scan = new Scanner(System.in);
		
		for (int i=0; i<6; i++) {
			num = scan.nextInt();
			if (num > 0) {
				positive ++;
			}
		}
		System.out.println(positive);

	}

}
