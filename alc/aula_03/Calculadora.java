

package fatec.alc.aula_03;
import java.util.Scanner;

public class Calculadora {
	public static void main(String[] args) {
		Scanner	scanner = new Scanner(System.in);
		double	a, b;
		char	signal;

		System.out.print("Digite o primeiro valor: ");
		a = scanner.nextDouble();
		System.out.print("Digite o segundo valor: ");
		b = scanner.nextDouble();
		
		System.out.print("Escolha a operação: (+), (-), (*) ou (/): ");
		signal = scanner.next().charAt(0);

		switch (signal) {
			case '+':
				System.out.println(a + "+" + b + " = " + (a + b));
				break;
			case '-':
				System.out.println(a + "-" + b + " = " + (a - b));
				break;
			case '*':
			case 'x':
				System.out.println(a + "*" + b + " = " + (a * b));
				break;
			case '/':
				if (b > 0)
					System.out.println(a + "/" + b + " = " + (a / b));
				else
					System.out.println("Divisor não natural");
				break;
			default:
				System.out.println("Fez merda, brother");	
				break;
		}
		scanner.close();
	}
}