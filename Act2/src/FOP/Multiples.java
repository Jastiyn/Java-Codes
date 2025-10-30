package FOP;
import java.util.Scanner;

public class Multiples {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		
		int A = scan.nextInt();
		int B = scan.nextInt();
		
		if (A % B == 0 || B % A ==0) {
			System.out.println("Sao Multiplos");
			
		} else {
			System.out.println("Nao sao Mutiplos");
			
		}
	}

}
