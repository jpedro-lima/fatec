import java.util.Random;
import javax.swing.JOptionPane;

public class DontMultiplesOfSeven{	
	public static void main(String[] args){
		Random	random = new Random();
		int		array[], runner;
		String	str = "";

		array = new int[100];
		runner = 0;
		for(int i = 0; i < 100; i++)
		{
			runner = random.nextInt(1000);
			if (runner % 7 != 0 && runner % 10 != 7)
			{
				array[i] = runner;
				str = str.concat(Integer.toString(array[i]) + ' ');
				if ((i + 1) % 10 == 0)
					str = str.concat("\n");
			}
			else
				i--;
		}
		JOptionPane.showMessageDialog(null, str);
	}
}
