/*
 * 25/03/2023
 * Receber a, b e c para calcular x
*/
//=========================================================================================================

package fatec.alc.aula_03;
import java.util.Scanner;

/**
 * SegundoGrau
 */
public class SegundoGrau {
	public static void main(String[] args) {
		double	a, b, c, delta, x1, x2;
		Scanner scanner = new Scanner(System.in);

		System.out.print("Digite o coeficiente a: ");
		a = scanner.nextDouble();
		System.out.print("Digite o coeficiente b: ");
		b = scanner.nextDouble();
		System.out.print("Digite o coeficiente c: ");
		c = scanner.nextDouble();

		if (a == 0)
			System.out.println("Coeficiente deve ser a != 0");
		else
		{
			delta = (b * b) - 4 * a * c;
			if (delta > 0)
			{
				x1 = (-b + Math.sqrt(delta)) / (2 * a);
				x2 = (-b - Math.sqrt(delta)) / (2 * a);
				System.out.println("x1 = " + x1);
				System.out.println("x2 = " + x2);
			}
			else
				System.out.println("A raiz não é um número real");
		}
		scanner.close();
	}
}