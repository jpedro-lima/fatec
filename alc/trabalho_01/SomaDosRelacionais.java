/*
 * João Pedro Correia de Lima
 * RA: 1430482313040
 * Lista 01 - ex. 32
*/

package	fatec.alc.trabalho_01;
import	java.util.Scanner;

public class SomaDosRelacionais {
	public static void main(String[] args) {
		Scanner	scanner = new Scanner(System.in);
		int		nb, soma;

		System.out.print("Digite um número inteiro: ");
		nb = scanner.nextInt();
		
		soma = (nb * 3) + 1;
		soma += (nb * 2) - 1;
		System.out.println("A soma é: " + soma);
		scanner.close();
	}	
}
