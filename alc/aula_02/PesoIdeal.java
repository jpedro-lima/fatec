/*
 *	18/03/2023
 *	Identifique se a altura da pesoa é ideal
*/
//=========================================================================================================

package fatec.alc.aula_02;
import	java.util.Scanner;

public class PesoIdeal {
	public static void main(String[] args) {
		String	sexo;
		char	s;
		double	h;
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("Digite M/m para Masculino e F/f para feminino: ");
		sexo = scanner.next();
		System.out.print("Digite sua altura em Metros: ");
		h = scanner.nextDouble();
		s = sexo.charAt(0);
		if (s == 'M' || s == 'm')
			System.out.println("Peso ideal " + String.format("%.2f", (72.7 * h) - 58));
		else if (s == 'F' || s == 'f')
			System.out.println("Peso ideal " + String.format("%.2f", (62.1 * h) - 44.7));
		else
			System.out.println("Sexo inválido");
		scanner.close();
	}
}