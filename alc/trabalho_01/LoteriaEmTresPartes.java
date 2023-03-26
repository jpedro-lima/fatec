/*
 * João Pedro Correia de Lima
 * RA: 1430482313040
 * Lista 01 - ex. 52
*/

package fatec.alc.trabalho_01;
import java.util.Scanner;

public class LoteriaEmTresPartes {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		double	award, first, second, third, proportion;

		System.out.print("Digite o valor do prêmio: ");
		award = scanner.nextDouble();
		System.out.print("Contribuição do 1º integrante: ");
		first = scanner.nextDouble();
		System.out.print("Contribuição do 2º integrante: ");
		second = scanner.nextDouble();
		System.out.print("Contribuição do 3º integrante: ");
		third = scanner.nextDouble();
		if (award > 0)
		{
			System.out.println("Distribuição do prêmio:");
			proportion = (first * 100) / (first + second + third) / 100;
			System.out.println("1º R$ " + String.format("%.2f", award * proportion));
			proportion = (second * 100) / (first + second + third) / 100;
			System.out.println("2º R$ " + String.format("%.2f", award * proportion));
			proportion = (third * 100) / (first + second + third) / 100;
			System.out.println("3º R$ " + String.format("%.2f", award * proportion));
		}
		else
			System.out.println("O prêmio precisa ser maior que 0");
		scanner.close();
	}	
}
