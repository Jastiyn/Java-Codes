package FOP;
import java.util.Scanner;

public class Simple {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int A = scan.nextInt();
		int B = scan.nextInt();
		int C = scan.nextInt();
		
		if (A < B && A < C) {
			System.out.println(A);
			
			if (B < C) {
				System.out.println(B);
				System.out.println(C);
				
			} else {
				System.out.println(C);
				System.out.println(B);
				
			}
		} else if (B < A && B < C) {
			System.out.println(B);
			
			if (A < C) {
				System.out.println(A);
				System.out.println(C);
				
			} else {
				System.out.println(C);
				System.out.println(A);
				
			}
		} else if (C < A && C < B) {
			System.out.println(C);
			
			if (A < B) {
				System.out.println(A);
				System.out.println(B);
				
			} else {
				System.out.println(B);
				System.out.println(A);
				
			}
		}
		
		System.out.println("");
		System.out.println(A);
		System.out.println(B);
		System.out.println(C);

	}

}
