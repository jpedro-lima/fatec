/*
 * 25/03/2023
 * Receber a e b para calcular x
*/
//=========================================================================================================

package fatec.alc.aula_03;

import java.util.Scanner;

public class AreaTrapezio {
	public static void main(String[] args) {
		Scanner	scanner = new Scanner(System.in);
		double	b1, b2, h, area;

		System.out.print("Digite a base maior: ");
		b1 = scanner.nextDouble();
		System.out.print("Digite a base menor: ");
		b2 = scanner.nextDouble();
		System.out.print("Digite a altura: ");
		h = scanner.nextDouble();
		if (b1 > 0 && b2 > 0 && h > 0)
		{
			area = ((b1 + b2) * h) / 2;
			System.out.println("Area = " + area);
		}
		else
			System.out.println("Os valores devem ser positivos");
		scanner.close();
	}
}