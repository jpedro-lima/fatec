
package fatec.alc.aula_04;

import java.util.Random;
import java.util.Scanner;

public class RandomNumber {
	public static void main(String[] args) {
		Scanner	scanner = new Scanner(System.in);
		Random	random = new Random();
		int		randomNumber, sum, attempts;

		sum = 0;
		attempts = 0;
		randomNumber = random.nextInt(901) + 100;
		while (sum < randomNumber)
		{
			System.out.print("Digite um número: ");
			sum += scanner.nextInt();
			attempts++;
			System.out.println("Número atual: " + sum);
			if ((sum + 500) <= randomNumber)
				System.out.println("Está frio\n");
			else if ((sum + 250) <= randomNumber)
				System.out.println("Está morno\n");
			else if (sum < randomNumber)
				System.out.println("Está quente\n");
		}
		System.out.println("O número era " + randomNumber);
		System.out.println("Você atingiu o valor com " + attempts + " tentativas");
		scanner.close();
	}
}