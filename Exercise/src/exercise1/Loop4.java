package exercise1;
import java.util.Scanner;

public class Loop4 {

	public static void main(String[] args) {
		int num, factorial = 1;
		int number = 0;
		Scanner input = new Scanner(System.in);
		
		System.out.println("Input number: ");
		num = input.nextInt();
		
		for (num= 1; num <= factorial; num++) {
			factorial *= num;
			
		}
		System.out.println("Factorial: " + factorial);

	}

}
