/*
 * João Pedro Correia de Lima
 * RA: 1430482313040
 * Lista 02 - ex. 38
*/

package fatec.alc.aula_03;
import java.util.Scanner;

public class DataCheck {
	public static void main(String[] args) {
		int day, month, year;
		boolean flag;
		Scanner scanner = new Scanner(System.in);
	
		System.out.print("Digite o dia: ");
		day = scanner.nextInt();
		System.out.print("Digite o mês: ");
		month = scanner.nextInt();
		System.out.print("Digite o ano: ");
		year = scanner.nextInt();
		flag = false;
		if (year <= 2023)
		{
			if (month > 0 && month <= 12)
			{
				if (month == 2)
				{
					if (year % 4 == 0 && (day > 0 && day <= 29))
					flag = true;
					if (year % 4 != 0 && (day > 0 && day <= 28))
					flag = true;
				}
				else if (month == 4 || month == 6 || month == 9 || month == 11)
				{
					if (day > 0 && day <= 31)
					flag = true;
				}
				else if (day > 0 && day <= 30)
					flag = true;
			}
		}
		if (flag)
			System.out.println("Data válida");
		else
			System.out.println("Data inválida");
		scanner.close();
	}
}
