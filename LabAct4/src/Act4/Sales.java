package Act4;
import java.util.Arrays;
import java.util.Scanner;

abstract class Sales {
	double[] Sales = new double[6];
	
	abstract void GetAve();
	abstract void GetMaxValue();
	abstract void GetMinValue();
	
	
	void setSales() {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter Sales: ");
		
		for (int i = 0; i < 6; i++) {
			double sale = 0;
			System.out.println("Enter Sale no." + (i +1) + ": ");
			sale = in.nextDouble();
			
			Sales[i] = sale;
		}
		
		System.out.println("\nHere are all the sales that you entered:");
		double[] copy = Arrays.copyOf(Sales, Sales.length);
		System.out.println(Arrays.toString(copy));
	
	}

}
