package exercise1;

import java.util.Scanner;

public class Loop5 {

	public static void main(String[] args) {
		int sum = 0;
		for (int i=1000; i<=3000; i++) {
			if(i % 2 == 0) {
				sum += i;
			}
		}
		System.out.println(sum);

	}

}
