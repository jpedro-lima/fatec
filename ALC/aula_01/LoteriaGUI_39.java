/*
 *	11/03/2023
 *
 *	39. Ler o prêmio da megasena e divide-lo entre três participantes:
 *	1º Recebe 46%
 *	2º Recebe 32%
 *	3º O restante
*/
//=========================================================================================================

package	ALC.aula_01;
import	javax.swing.JOptionPane;

public class LoteriaGUI_39 {
	public static void main(String[] args) {
		double award, first, second, third;

		award = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do prêmio:"));
		first = award * 0.46;
		second = award * 0.32;
		third = award - second - first;
		JOptionPane.showMessageDialog(null, "O primeiro receberá: R$ " + String.format("%.2f", first)
			+ "\nO segundo receberá: R$ " + String.format("%.2f", second)
			+ "\nO terceiro receberá: R$ " + String.format("%.2f", third));
	}
}