package Act4;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		Sales s = new Calculation();
		
		s.setSales();
		
		System.out.println("\n____________________");
		s.GetAve();
		s.GetMaxValue();
		s.GetMinValue();
		System.out.println("____________________");

	}

}
