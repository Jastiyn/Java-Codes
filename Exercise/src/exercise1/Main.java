package exercise1;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int sum = a;
		
		while (a < 100) {
				a = scan.nextInt();
				sum += a;
				
			}
		System.out.println("Done");
		}

	}

