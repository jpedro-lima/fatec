/*
 * 29. Faça um programa que receba 6 números inteiros e mostre:
 * • Os números pares digitados;
 * • A soma dos números pares digitados;
 * • Os números  ́ımpares digitados;
 * • A quantidade de números  ́ımpares digitados;
 */

import java.util.Scanner;

public class SixNumbers{
	public static void main(String[] args){
		Scanner	scanner = new Scanner(System.in);
		int[]	numbers = new int[6];
		int		sum, odd;

		System.out.println("Digite os números nas seguintes posições:");
		for (int i = 0; i < numbers.length; i++) {
			System.out.print("numbers[" + i + "] = ");
			numbers[i] = scanner.nextInt();
		}
		sum = 0;
		odd = 0;
		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i] % 2 == 0)
			{
				System.out.println("Pair\t[" + i + "] = " + numbers[i]);
				sum += numbers[i];
			}
			else
			{
				System.out.println("Odd\t[" + i + "] = " + numbers[i]);
				odd += numbers[i];
			}
		}
		System.out.println("Soma dos pares: " + sum);
		System.out.println("Soma dos ímpares: " + odd);
		scanner.close();
	}
}