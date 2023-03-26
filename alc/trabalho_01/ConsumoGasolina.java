/*
 * João Pedro Correia de Lima
 * RA: 1430482313040
 * Lista 02 - ex. 26
*/

package fatec.alc.trabalho_01;
import java.util.Scanner;

/*
 * No exercício a tabela diz:
 * entre 8 - 14 "Econômico"
 * superior à 12 "Super econômico"
 * Como isso parece um erro, eu interpretei sendo de 8-12 e > 12
 */
public class ConsumoGasolina {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		double	km, liters, consumption;

		System.out.print("Km percorridos: ");
		km = scanner.nextDouble();
		System.out.print("Combustivel consumido: ");
		liters = scanner.nextDouble();

		if(km > 0 && liters > 0)
		{
			consumption = km / liters;
			System.out.println("km/l: " + consumption);
			if (consumption > 12)
				System.out.println("Super econômico!");
			else if(consumption >= 8)
				System.out.println("Econômico!");
			else
				System.out.println("Venda o carro!");
		}
		else
			System.out.println("Boa tentativa ╰(*°▽°*)╯");
		scanner.close();
	}	
}