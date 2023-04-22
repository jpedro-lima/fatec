package fatec.alc.aula_04;
import java.util.Scanner;

public class WhatNumber19 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int		nb, size;

		System.out.print("Digite um número: ");
		nb = scanner.nextInt();
		size = sizeNumber(nb);
		while (size-- > 0)
		{
			System.out.println((int)(nb / Math.pow(10, size)));
			nb %= Math.pow(10, size);
		}
		scanner.close();
	}
	private static int sizeNumber(int nb) {
		int size = 0;

		while(nb > 0)
		{
			size++;
			nb /= 10;
		}
		return (size);
	}
}
