/*
 * 25/03/2023
 * Receber a e b para calcular x
*/
//=========================================================================================================


package fatec.alc.aula_03;
import	java.util.Scanner;

public class PrimeiroGrau {
	public static void main(String[] args) {
		double	a, b, x;
		Scanner	scanner = new Scanner(System.in);

		System.out.print("Digite o coeficiente a: ");
		a = scanner.nextDouble();
		System.out.print("Digite o coeficiente b: ");
		b = scanner.nextDouble();

		if (a == 0)
			System.out.println("Coeficiente deve ser a != 0");
		else
		{
			x = -b/a;
			System.out.println("x = " + x);
		}
		scanner.close();
	}
}