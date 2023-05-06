

package fatec.alc.aula_05;

import java.util.Scanner;

public class ListPerfectNumber {
	public static void main(String[] args) {
		Scanner	scanner = new Scanner(System.in);
		int		sum, nb;

		System.out.print("Digite o número limite da lista: ");
		nb = scanner.nextInt();
		for (int i = 1; i < nb ; i++) {
			sum = 0;
			for (int j = 1; j <= (i / 2) || j == 1; j++) {
				if (i % j == 0)
					sum += j;
			}
			if(i == sum)
				System.out.println(sum);
		}
		scanner.close();
	}	
}