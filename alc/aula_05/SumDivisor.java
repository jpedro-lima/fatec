
package fatec.alc.aula_05;

import java.util.Scanner;

public class SumDivisor{
	public static void main(String[] args) {
		Scanner	scanner = new Scanner(System.in);
		int		sum, nb;

		System.out.print("Digite um número inteiro: ");
		nb = scanner.nextInt();
		sum = 0;
		for (int i = 1; i < nb / 2 ; i++) {
			if (nb % i == 0)
				sum += i;
		}
		System.out.println("A soma é: " + sum);
		scanner.close();
	}
}