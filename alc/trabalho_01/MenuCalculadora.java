/*
 * João Pedro Correia de Lima
 * RA: 1430482313040
 * Lista 02 - ex. 21
*/

package fatec.alc.trabalho_01;
import java.util.Scanner;

public class MenuCalculadora {
	public static void main(String[] args) {
		Scanner	scanner = new Scanner(System.in);
		double	a, b;
		int		key;

		System.out.println("1- Soma de 2 números.");
		System.out.println("2- Diferença entre 2 números.");
		System.out.println("3- Produto entre 2 números.");
		System.out.println("4- Divisão entre 2 números.");
		System.out.print("Opção: ");
		key = scanner.nextInt();
		System.out.print("Digite o primeiro número: ");
		a = scanner.nextDouble();
		System.out.print("Digite o segundo número: ");
		b = scanner.nextDouble();
		switch (key) {
			case 1:
				System.out.println(a + " + " + b + " = " + (a + b));
				break;
			case 2:
				if(a >= b)
					System.out.println(a + " - " + b + " = " + (a - b));
				else
					System.out.println(b + " - " + a + " = " + (b - a));
				break;
			case 3:
				System.out.println(a + " * " + b + " = " + (a * b));
				break;
			case 4:
				if (b > 0)
					System.out.println(a + " / " + b + " = " + (a / b));
				else
					System.out.println("O denominador deve ser maior que 0");
				break;
			default:
				System.out.println("Se atenha ao menu");
				break;
		}
		scanner.close();
	}
}