/*
 * João Pedro Correia de Lima
 * RA: 1430482313040
 * Lista 01 - ex. 28
*/

package	fatec.alc.trabalho_01;
import	java.util.Scanner;

public class SomaDosQuadrados {
	public static void main(String[] args) {
		Scanner	scanner = new Scanner(System.in);
		double	a, b, c, soma;

		System.out.print("Digite o primeiro número: ");
		a = scanner.nextDouble();
		System.out.print("Digite o segundo número: ");
		b = scanner.nextDouble();
		System.out.print("Digite o terceiro número: ");
		c = scanner.nextDouble();
		
		soma =  (a * a) + (b * b) + (c * c);
		System.out.println(a + "^2 + " + b + "^2 + " + c + "^2 = " + soma);
		scanner.close();
	}	
}
