/*
 * João Pedro Correia de Lima
 * RA: 1430482313040
 * Lista 02 - ex. 16
*/

package fatec.alc.trabalho_01;
import java.util.Scanner;

public class WhatMonth {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int	month;

		System.out.print("Digite um valor de 1 à 12: ");
		month = scanner.nextInt();
		switch (month) {
			case 1:
				System.out.println("Janeiro");
				break;
			case 2:
				System.out.println("Fevereiro");
				break;
			case 3:
				System.out.println("Março");
				break;
			case 4:
				System.out.println("Abril");
				break;
			case 5:
				System.out.println("Maio");
				break;
			case 6:
				System.out.println("Junho");
				break;
			case 7:
				System.out.println("Julho");
			case 8:
				System.out.println("Agosto");
			case 9:
				System.out.println("Setembro");
			case 10:
				System.out.println("Outubro");
			case 11:
				System.out.println("Novembro");
			case 12:
				System.out.println("Dezembro");
			default:
				System.out.println("Número inválido `(*>﹏<*)′");
				break;
		}
		scanner.close();
	}
}