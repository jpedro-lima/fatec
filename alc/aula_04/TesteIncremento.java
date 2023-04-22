
package fatec.alc.aula_04;

public class TesteIncremento {
	public static void main(String[] args) {
		int a;

		a = 10;
		System.out.println("a = " + a);
		a++;
		System.out.println("a++ = " + a);
		++a;
		System.out.println("++a = " + a);
		a = a++;
		System.out.println("a = a++ = " + a);
		++a;
		System.out.println("a = ++a = " + a);
	}
}