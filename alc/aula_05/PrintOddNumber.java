package fatec.alc.aula_05;

import java.util.Scanner;

public class PrintOddNumber {
	public static void main(String[] args) {
		Scanner	scanner = new Scanner(System.in);

		System.out.print("Digite um número inteiro: ");
		recursiveFunction(scanner.nextInt());
		scanner.close();
	}
	private static void recursiveFunction(int n) {
		if (n > 0)
			recursiveFunction(n - 1);
		if (n % 2 != 0)
			System.out.println("O número é: " + n);
	}
}
