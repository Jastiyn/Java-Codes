package FOP;
import java.util.Scanner;

public class Salary {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		float Salary = scan.nextFloat();
		
		if (Salary >= 0 && Salary <= 400.00) {
			System.out.printf("Novo salario: %.2f\n", ((Salary * .15) + Salary));
			System.out.printf("Reajuste ganho: %.2f\n", Salary * .15);
			System.out.println("Em percentual: 15 %");
			
		} else if (Salary >= 400.01 && Salary <= 800.00) {
			System.out.printf("Novo salario: %.2f\n", ((Salary * .12) + Salary));
			System.out.printf("Reajuste ganho: %.2f\n", Salary * .12);
			System.out.println("Em percentual: 12 %");
		
		} else if (Salary >= 800.01 && Salary <= 1200.00) {
			System.out.printf("Novo salario: %.2f\n", ((Salary * .10) + Salary));
			System.out.printf("Reajuste ganho: %.2f\n", Salary * .10);
			System.out.println("Em percentual: 10 %");
		
		} else if (Salary >= 1200.01 && Salary <= 2000.00) {
			System.out.printf("Novo salario: %.2f\n", ((Salary * .07) + Salary));
			System.out.printf("Reajuste ganho: %.2f\n", Salary * .07);
			System.out.println("Em percentual: 7 %");
		
		} else if (Salary >= 2000.01) {
			System.out.printf("Novo salario: %.2f\n", ((Salary * .04) + Salary));
			System.out.printf("Reajuste ganho: %.2f\n", Salary * .04);
			System.out.println("Em percentual: 4 %");
		
		}

	}

}
