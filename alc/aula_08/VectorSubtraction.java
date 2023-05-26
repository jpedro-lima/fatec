import java.util.Random;
import javax.swing.JOptionPane;

public class VectorSubtraction{
	public static void main(String[] args)
	{
		Random random = new Random();
		int[] a, b, c;
		a = new int[10];
		b = new int[10];
		c = new int[10];
		
		for (int i = 0; i < 10; i++) {
			a[i] = random.nextInt(100);
			b[i] = random.nextInt(100);
			c[i] = a[i] - b[i];
		}
		String strA, strB, strC;
		strA = "a = {";
		strB = "b = {";
		strC = "c = {";
		for (int i = 0; i < 10; i++) {
			strA = strA.concat(Integer.toString(a[i]) + " ");
			strB = strB.concat(Integer.toString(b[i]) + " ");
			strC = strC.concat(Integer.toString(c[i]) + " ");
		}
		strA = strA.concat("}\n");
		strB = strB.concat("}\n");
		strC = strC.concat("}\n");
		JOptionPane.showMessageDialog(null, strA + strB + strC);
	}
}