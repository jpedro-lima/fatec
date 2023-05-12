package fatec.alc.aula_06;

import java.util.Scanner;

public class Fatorial {
public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long    numero;
        String  fatorial;

        System.out.print("Digite um número inteiro até 20: ");
        numero = scanner.nextLong();
        fatorial = calcularFatorial(numero);
        System.out.println("!" + numero + " = " + fatorial);
        scanner.close();
    }
    private static String calcularFatorial(long numero) {
        long    aux;

        if (numero == 0)
            aux = 1;
        else
            aux = numero * Long.parseLong(calcularFatorial(numero - 1));
        return (Long.toString(aux));
    }
}
