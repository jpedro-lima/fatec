/*
 * 25/03/2023
 *
*/
//==================================================================//


package fatec.alc.aula_03;

import javax.swing.JOptionPane;

public class DiaSemana {
	public static void main(String[] args) {
		int	day;

		day = Integer.parseInt(JOptionPane.showInputDialog("Digite um valor de 1 à 7"));
		switch (day) {
			case 1:
				JOptionPane.showMessageDialog(null, "Hoje é domingo");
				break;
			case 2:
				JOptionPane.showMessageDialog(null, "Hoje é segunda-feira");
				break;
			case 3:
				JOptionPane.showMessageDialog(null, "Hoje é terça-feira");
				break;
			case 4:
				JOptionPane.showMessageDialog(null, "Hoje é quarta-feira");
				break;
			case 5:
				JOptionPane.showMessageDialog(null, "Hoje é quinta-feira");
				break;
			case 6:
				JOptionPane.showMessageDialog(null, "Hoje é sexta-feira");
				break;
			case 7:
				JOptionPane.showMessageDialog(null, "Hoje é sabado");
			default:
				JOptionPane.showMessageDialog(null, "Número inválido `(*>﹏<*)′");
				break;
		}
	}
}