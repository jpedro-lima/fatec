
package fatec.alc.aula_07;

import java.util.Scanner;

public class SomaVetor {
	public static void main(String[] args) {
		Scanner	scanner = new Scanner(System.in);
		double	sum, numbers[];

		System.out.print("Digite a quantidade de valores que serão somados: ");
		numbers = new double[scanner.nextInt()];
		for (int i = 0; i < numbers.length; i++) {
			System.out.print("Digite um valor: ");
			numbers[i] = scanner.nextDouble();
		}
		sum = 0;
		for (int i = 0; i < numbers.length; i++) {
			sum += numbers[i];
		}
		System.out.println("Soma = " + sum);
		scanner.close();
	}	
}