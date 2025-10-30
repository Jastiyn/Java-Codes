package exercise1;

import java.util.Scanner;

public class Loop2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int N;
		int sum = 1;
		System.out.print("Input number: ");
		N = scan.nextInt();
		System.out.println("The first natural number of N is = " + N);
		
		for (int i = 1; i <= N; i++) {
			System.out.println(i);
			sum += 1;
		}
		System.out.println("The sum of the N is: " + sum);

	}

}
