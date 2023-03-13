/*
 *	11/03/2023
 *
 *	39. Ler o prêmio da megasena e divide-lo entre três participantes:
 *	1º Recebe 46%
 *	2º Recebe 32%
 *	3º O restante
*/
//=========================================================================================================

package	ALC.aula_01;
import	java.util.Scanner;

public class LoteriaScanner_39 {
	public static void main(String[] args) {
		double award, first, second, third;

		Scanner scanner = new Scanner(System.in);
		System.out.print("Digite o valor do prêmio: ");
		award = scanner.nextDouble();
		first = award * 0.46;
		second = award * 0.32;
		third = award - second - first;
		System.out.println("O primeiro receberá: R$ " + String.format("%.2f", first)
			+ "\nO segundo receberá: R$ " + String.format("%.2f", second)
			+ "\nO terceiro receberá: R$ " + String.format("%.2f",third));
		scanner.close();
	}
}