package fatec.alc.aula_05;

import java.util.Scanner;

public class CheckPrimeNumber {
	public static void main(String[] args) {
		Scanner	scanner = new Scanner(System.in);

		System.out.print("Digite um número inteiro: ");
		if (checkPrimeNumber(scanner.nextInt()))
			System.out.println("É primo");
		else
			System.out.println("Não é primo");
		
		scanner.close();
	}
	private static boolean checkPrimeNumber(int nb)
	{
		int	root = (int)Math.sqrt(nb);

		for (int i = 1; i < root; i++) {
			if (root % i == 0)
				return (false);
		}
		return (true);
	}
}