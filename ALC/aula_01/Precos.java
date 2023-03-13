/*
 *	11/03/2023
 *
 *	Um programa que recebe o preço de um produto e o deconto em (%)
 *	Calcular o preço do disconto e o valor final
*/
//=========================================================================================================
package	ALC.aula_01;
import	javax.swing.JOptionPane;

public class Precos{
	public static void main(String[] args) {
		double price, percent, finalValue, discount;
		price = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do produto:"));
		percent = Double.parseDouble(JOptionPane.showInputDialog("Digite a % do desconto:"));

		discount = price * (percent / 100);
		finalValue = price - discount;
		JOptionPane.showMessageDialog(null, "Valor final: " + finalValue + "\nDesconto aplicado: " + discount);
	}
}