/*
 * João Pedro
 * 11/03/2023
 * 47. Leia um número inteiro de 4 digitos e imprima 1 digito por linha
 */

package fatec.alc.aula_01;
import	java.util.Scanner;

public class WhatNumber_47 {
	public static void main(String[] args) {
		int	nb;

		Scanner scanner = new Scanner(System.in);
		System.out.print("Digite um número entre 1000-9999: ");
		nb = scanner.nextInt();
		System.out.println(nb / 1000);
		nb = nb % 1000;
		System.out.println(nb / 100);
		nb = nb % 100;
		System.out.println(nb / 10);
		System.out.println(nb % 10);

		scanner.close();
	}
}