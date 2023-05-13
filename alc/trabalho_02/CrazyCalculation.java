/*
 * 30. Faça programas para calcular as seguintes sequências:
 *	1 + 2 + 3 + 4 + 5 + ... + n
 *	1 − 2 + 3 − 4 + 5 + ... + (2n − 1)
 *	1 + 3 + 5 + 7 + ... + (2n − 1)
*/
import java.util.Scanner;

public class CrazyCalculation {
	public static void main(String[] args) {
		Scanner	scanner = new Scanner(System.in);
		int		nb;

		System.out.print("Digite um número inteiro: ");
		nb = scanner.nextInt();
		if (nb <= 0)
			System.out.println("Número inválido");
		else
		{
			System.out.println("\tREGRAS\n" +
			"I: 1 + 2 + 3 + 4 + 5 + ... + n\n" +
			"II: 1 − 2 + 3 − 4 + 5 + ... + (2n − 1)\n" +
			"III: 1 + 3 + 5 + 7 + ... + (2n − 1)");
			System.out.println("=======================================");

			System.out.println("I: " + (nb * (nb + 1)) / 2);
			System.out.println("II: " + nb);
			System.out.println("III: " + (nb * nb));

			redundantCode(nb);
		}
		scanner.close();
	}
	private static void redundantCode(int nb)
	{
		int sum, sumOdd, subSum, dupNb;

		sum = 0;
		sumOdd = 0;
		subSum = 0;
		dupNb = nb * 2;
		while (--dupNb > 0)
		{
			if (dupNb <= nb)
				sum += dupNb;
			if (dupNb % 2 != 0)
			{
				subSum += dupNb;
				sumOdd += dupNb;
			}
			else
				subSum -= dupNb;
		}
		System.out.println("==== I'm a redundant code `(*>﹏<*)′ ====");
		System.out.println("I: " + sum);
		System.out.println("II: " + subSum);
		System.out.println("III: " + sumOdd);
	}
}
