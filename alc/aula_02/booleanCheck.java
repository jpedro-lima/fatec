/*
 *	18/03/2023
 *
*/
//=========================================================================================================

package fatec.alc.aula_02;
import	java.util.Scanner;

public class booleanCheck {
	public static void main(String[] args) {
		int	a, b, c, d;

		Scanner scanner = new Scanner(System.in);
		System.out.print("Digite um número A: ");
		a = scanner.nextInt();
		System.out.print("Digite um número B: ");
		b = scanner.nextInt();
		System.out.print("Digite um número C: ");
		c = scanner.nextInt();
		System.out.print("Digite um número D: ");
		d = scanner.nextInt();
		
		if ((a > c) && (c <= d))
			System.out.println("V");
		else
			System.out.println("F");
		if ((a + b) > 10 || (a + b) == (c + d))
			System.out.println("V");
		else
			System.out.print("F");
		if ((a >= c) && (d >= c))
			System.out.println("V");
		else
			System.out.println("F");
		scanner.close();
	}
}