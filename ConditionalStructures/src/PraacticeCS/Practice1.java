package PraacticeCS;

import java.util.Scanner;

public class Practice1 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int A = in.nextInt();
		int B = in.nextInt();
		int C = in.nextInt();
		int D = in.nextInt();
		int sum1 = C + D;
		int sum2 = A + B;
		
		if (B > C && D > A && sum1 > sum2 && C >= 0 && D >= 0 && A % 2 == 0) {
		System.out.println("Valores aceitos");
		
		} else {
			System.out.println("Valores nao aceitos");
		}
		
	}

}
