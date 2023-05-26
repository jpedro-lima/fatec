/*
 * 27. Leia 10 números inteiros e armazene em um vetor. Em seguida escreva os elementos
 * que são primos e suas respectivas posições no vetor.
*/

import java.util.Scanner;

public class WhatPrime{
	public static void main(String[] args){
		Scanner	scanner = new Scanner(System.in);
		int		numbers[] = new int[10];

		System.out.println("Digite os valores na seguinte posição:");
		for (int i = 0; i < numbers.length; i++) {
			System.out.print("nb[" + i + "] = ");
			numbers[i] = scanner.nextInt();
		}
		System.out.println("Os primos são:");
		for (int i = 0; i < numbers.length; i++) {
			if (isPrime(numbers[i]))
				System.out.println("numbers[" + i + "] = " + numbers[i]);
		}
		scanner.close();
	}
	private static boolean isPrime(int nb)
	{
		int	aux = (int)Math.sqrt(nb);
		if (nb <= 0 )
			return (false);
		while (nb > 3 && aux > 1) {
			if (nb % aux == 0)
				return (false);
			aux--;
		}
		return (true);
	}
}