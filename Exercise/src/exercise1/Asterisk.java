package exercise1;

import java.util.Scanner;

public class Asterisk {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		String a = scan.next();
		String c = "";
		char b;
		
		// for (int i = 0; i < a.length(); i++) {
			// char y = a.charAt(i);
			// System.out.print(y + "*"); }
		for (int i = 0; i<a.length(); i ++) {
			b = a.charAt(i);
			c = b+c;
			
		}
		System.out.println(c);

	}

}
