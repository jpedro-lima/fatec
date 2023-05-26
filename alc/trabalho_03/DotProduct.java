/*
 * 23. Ler dois conjuntos de números reais, armazenando-os em vetores e calcular o produto
 * escalar entre eles. Os conjuntos têm 5 elementos cada. Imprimir os dois conjuntos e o
 * produto escalar, sendo que o produto escalar  ́e dado por: x1 ∗ y1 + x2 ∗ y2 + ... + xn ∗ yn.
*/

import java.util.Scanner;

public class DotProduct{
	public static void main(String[] args){
		Scanner	scanner = new Scanner(System.in);
		double	x[] = new double[5], y[] = new double[5];
		double	sum = 0;
		String	strX, strY;

		System.out.println("Digite os valores na seguinte posição:");
		for (int i = 0; i < 5; i++) {
			System.out.print("x[" + (i+1) + "] = ");
			x[i] = scanner.nextDouble();
			System.out.print("y[" + (i+1) + "] = ");
			y[i] = scanner.nextDouble();
			sum += x[i] * y[i];
		}
		strX = "x = [";
		strY = "y = [";
		for (int i = 0; i < 5; i++) {
			strX = strX.concat(Double.toString(x[i]));
			strY = strY.concat(Double.toString(y[i]));
			if (i < 4)
			{
				strX = strX.concat(", ");
				strY = strY.concat(", ");
			}
		}
		strX = strX.concat("]");
		strY = strY.concat("]");
		System.out.println(strX);
		System.out.println(strY);
		System.out.println("O produto escalar é " + sum);
		scanner.close();
	}
}