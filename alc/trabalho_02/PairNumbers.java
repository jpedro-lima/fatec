/* 
 * 14. Faça um programa que leia um número inteiro positivo par N e imprima todos os números pares 
 * de 0 até N em ordem decrescente.
*/ 
import java.util.Scanner;

public class PairNumbers {
	public static void main(String[] args) {
		Scanner	scanner = new Scanner(System.in);
		int	nb;

		System.out.print("Digite um número par: ");
		nb = scanner.nextInt();
		
		if (nb % 2 != 0)
			System.out.println("Este é um número ímpar");
		else
		{
			while(nb >= 0)
			{
				System.out.println(nb);
				nb -= 2;
			}
		}
		scanner.close();
	}
}
