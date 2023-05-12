/*
 * 21. Faça um programa que receba dois números. Calcule e mostre:
 *	• a soma dos números pares desse intervalo de números, incluindo os números digitados;
 *	• a multiplicação dos números ímpares desse intervalo, incluindo os digitados;
*/

import java.util.Scanner;

public class TwoMagicNumbers {
	public static void main(String[] args) {
		Scanner	scanner = new Scanner(System.in);
		int		a, b;

		System.out.print("Digite o valor de a: ");
		a = scanner.nextInt();
		System.out.print("Digite o valor de b: ");
		b = scanner.nextInt();
		if (a > b)
			calculation(a, b);
		else
			calculation(b, a);
		scanner.close();
	}
	private static void calculation(int max, int min)
	{
		int	sum, mult;

		sum = 0;
		mult = 1;
		while (max >= min)
		{
			if (max % 2 == 0)
				sum += max;
			else
				mult *= max;
			max--;
		}
		if (mult == 1 && max != 1 && min != 1)
			mult = 0;
		System.out.println("A soma dos pares é: " + sum);
		System.out.println("A multiplicação dos ímpares é: " + mult);
	}
}
