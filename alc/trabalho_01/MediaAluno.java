/*
 * João Pedro Correia de Lima
 * RA: 1430482313040
 * Lista 02 - ex. 14
*/

package fatec.alc.trabalho_01;
import java.util.Scanner;

/*
 * Fiquei com a dúvida se cada nota poderia ser de 0-10 ou se a soma deveria ser até 10
 * Como a média fica muito alta seguindo a lógica de cada nota de 0-10, segui a outra lógica 
*/
public class MediaAluno {
	public static void main(String[] args) {
		Scanner	scanner = new Scanner(System.in);
		float	lab, evaluation, exame, media, soma;
		
		System.out.print("Nota do trabalho de laboratório: ");
		lab = scanner.nextFloat();
		System.out.print("Nota da avaliação semestral: ");
		evaluation = scanner.nextFloat();
		System.out.print("Nota do exame final: ");
		exame = scanner.nextFloat();

		soma = lab + evaluation + exame;
		if (soma >= 0 && soma <= 10)
		{
			lab *= 2;
			evaluation *= 3;
			exame *= 5;
			media = (lab + evaluation + exame) / 3;
			System.out.println("Media: " + String.format("%.2f", media));
			if (media >= 5)
				System.out.println("Aluno aprovado!");
			else if (media >= 3)
				System.out.println("Aluno em recuperação");
			else
				System.out.println("Aluno reprovado");
		}
		else
			System.out.println("A soma das notas deve ser 10");
		scanner.close();
	}
}
