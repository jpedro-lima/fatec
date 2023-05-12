/*
* 19. Escreva um algoritmo que leia um número inteiro entre 100 e 999 e imprima na saída
* cada um dos algarismos que compõem o número
*/

import java.util.Scanner;
public class PrintThreeNumbers {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int		nb, size;

		System.out.print("Digite um número de 100 - 999: ");
		nb = scanner.nextInt();
		size = 3;
		if (nb < 100 || nb > 999)
			System.out.println("Número inválido");
		else
		{
			while (size-- > 0)
			{
				System.out.println((int)(nb / Math.pow(10, size)));
				nb %= Math.pow(10, size);
			}
		}
		scanner.close();
	}
}