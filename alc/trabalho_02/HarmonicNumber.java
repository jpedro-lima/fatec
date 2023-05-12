/*
 * 27. Em Matemática, o número harmônico designado por H(n) define-se como sendo a soma da série harmônica:
 * 		H(n) = 1 + 1/2 + 1/3 + 1/4 + ... + 1/n
 * Faça um programa que leia um valor n inteiro e positivo e apresente o valor de H(n).
*/
import java.util.Scanner;

public class HarmonicNumber {
	public static void main(String[] args) {
		Scanner	scanner = new Scanner(System.in);
		int		n;

		System.out.print("Digite um número N*: ");
		n = scanner.nextInt();
		if (n < 0)
			System.out.println("Número inválido");
		else
			System.out.println("H(n) = " + harmonicRecursion(n));
		scanner.close();
	}
	private static double harmonicRecursion(double nb)
	{
		if (nb == 0)
			return (0);
		return (harmonicRecursion(nb - 1) + (double)1 / nb);
	}
}
