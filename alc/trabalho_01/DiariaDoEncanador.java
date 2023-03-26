/*
 * João Pedro Correia de Lima
 * RA: 1430482313040
 * Lista 01 - ex. 40
*/

package fatec.alc.trabalho_01;
import java.util.Scanner;

public class DiariaDoEncanador {
	public static void main(String[] args) {
		Scanner	scanner = new Scanner(System.in);
		double	wage, tax;
		int		days;

		System.out.print("Digite a quantidade de dias trabalhados: ");
		days = scanner.nextInt();
		wage = days * 30;
		tax = wage * 0.08;
		System.out.println("O valor à ser pago é:\nR$ "
			+ String.format("%.2f", wage - tax) + " - IR R$ " + String.format("%.2f", tax));
		scanner.close();
	}
}
