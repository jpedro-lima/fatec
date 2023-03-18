/*
 *	18/03/2023
 *
*/
//=========================================================================================================

package fatec.alc.aula_02;
import	java.util.Scanner;

public class CheckNumber {
	public static void main(String[] args) {
		double	nb;

		Scanner scanner = new Scanner(System.in);
		System.out.print("Digite um número: ");
		nb = scanner.nextDouble();

		//Teste se é positivo
		if (nb > 0)
			System.out.println("É um número positivo ~(￣▽￣)~");
		else if (nb < 0)
			System.out.println("É um número negativo `(*>﹏<*)′");
		else
			System.out.println("É um número Nulo (╯‵□′)╯︵┻━┻");

		//teste se é ímpar
		if (nb % 2 != 0)
			System.out.println("O número é ímpar `(*>﹏<*)′");
		else if (nb != 0)
			System.out.println("O número é par ~(￣▽￣)~");
		scanner.close();
	}
}