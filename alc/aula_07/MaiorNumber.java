
package fatec.alc.aula_07;

import java.util.Scanner;

public class MaiorNumber {
	public static void main(String[] args) {
		Scanner	scanner = new Scanner(System.in);
		int	maior, numbers[];

		System.out.print("Digite a quantidade de valores que serão somados: ");
		numbers = new int[scanner.nextInt()];
		for (int i = 0; i < numbers.length; i++) {
			System.out.print("Digite um valor: ");
			numbers[i] = scanner.nextInt();
		}
		maior = numbers[0];
		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i] > maior)
				maior = numbers[i];
		}
		System.out.println("maior = " + maior);
		scanner.close();
	}	
}