/*
 * 18/03/2023
 * Receba um número de parcelas e acrescente uma taxa ao valor final
 * 1 (à vista) = -10%
 * 2 = preço normal
 * 3 = +10%
 * Negar qualquer outro valor
*/
//=========================================================================================================

package fatec.alc.aula_02;
import java.util.Scanner;

public class ParcelasCompras {
	public static void main(String[] args) {
		double	value;
		int		parcel;
		Scanner	scanner = new Scanner(System.in);

		System.out.print("Digite o valor da compra: ");
		value = scanner.nextDouble();

		System.out.print("Digite a quantidade de parcelas (1, 2 ou 3): ");
		parcel = scanner.nextInt();

		if (parcel == 1)
			System.out.println("O valor a pagar é: " + String.format("%.2f", value - (value * 0.1)));
		else if (parcel == 2)
			System.out.println("O valor a pagar é: " + String.format("%.2f", value));
		else if (parcel == 3)
			System.out.println("O valor a pagar é: " + String.format("%.2f", value + (value * 0.1)));
		else
			System.out.println("Número de parcelas incorreto");
		scanner.close();
	}
}