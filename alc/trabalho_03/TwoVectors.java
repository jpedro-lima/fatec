
/*
 * 30. Faça um programa que leia dois vetores de 10 elementos. Crie um vetor que seja a
 * intersecção entre os 2 vetores anteriores, ou seja, que contém apenas os números que
 * estão em ambos os vetores. Não deve conter números repetidos.
*/
import java.util.Random;
import java.util.Arrays;

public class TwoVectors{
	public static void main(String[] args){
		Random	random = new Random();
		int[]	x, y, z;

		x = new int[10];
		y = new int[10];
		z = new int[10];
		Arrays.fill(z, -1);
		for (int i = 0; i < 10; i++) {
			x[i] = random.nextInt(10);
			y[i] = random.nextInt(10);
		}
		int count = -1;
		for (int i = 0; i < x.length; i++) {
			for (int j = 0; j < y.length; j++) {
				if (x[i] == y[j] && !exist(x[i], z))
					z[++count] = x[i];
			}
		}
		System.out.print("x = ");
		putArray(x);
		System.out.print("y = ");
		putArray(y);
		System.out.print("z = ");
		putArray(z);
	}
	private	static boolean exist(int nb, int[] z){
		for (int i = 0; i < z.length; i++) {	
			for (int j = 1; j < z.length; j++) {
				if (z[i] == nb)
					return (true);
			}
		}
		return (false);
	}
	private static void putArray(int[] arr){
		String str;

		str = "[";
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == -1)
				break;
			str = str.concat(Integer.toString(arr[i]));
			if (i < arr.length - 1 && arr[i + 1] != -1)
				str = str.concat(", ");
		}
		str = str.concat("]");
		System.out.println(str);
	}
}