/*
 *	11/03/2023
 *
 *	Um programa que recebe o ponto de inicial e um ponto final,
 *	depois calcule e exiba a distância entre eles
*/
package ALC.aula_01;
import javax.swing.JOptionPane;

public class Distancia{
	public static void main(String[] args) {
		//entradas
		double x1, x2, y1, y2, distance;
		x1 = Double.parseDouble(JOptionPane.showInputDialog("Digite x1"));
		y1 = Double.parseDouble(JOptionPane.showInputDialog("Digite y1"));
		x2 = Double.parseDouble(JOptionPane.showInputDialog("Digite x2"));
		y2 = Double.parseDouble(JOptionPane.showInputDialog("Digite y2"));

		//processamento
		distance = Math.sqrt(((x1 - x2)*(x1 - x2)) + ((y1 - y2)*(y1 - y2)));
		//saida
		JOptionPane.showMessageDialog(null, "Distância = " + distance);
	}
}