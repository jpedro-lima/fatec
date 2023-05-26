import java.util.Scanner;

public class FindArray {
	public static void main(String[] args) {
		Scanner	scanner = new Scanner(System.in);	
		int	array[] = new int[10];
		int	nb, count;

		for (int i = 0; i < 10; i++) {
			System.out.print((i + 1) + "º número: ");
			array[i] = scanner.nextInt();
			if (array[i] == 0)
			{
				System.out.println("Número inválido");
				i--;
			}
		}
		System.out.print("Digite o valor x: ");
		nb = scanner.nextInt();
		System.out.println("\nOs seguintes valores são multiplos de " + nb);
		count = 0;
		for (int i = 0; i < 10; i++) {
			if (nb % array[i] == 0)
			{
				count++;
				System.out.print(array[i] + "\t");
			}
		}
		System.out.println("\nForam encontrados " + count + " multiplos");
		scanner.close();
	}
}
