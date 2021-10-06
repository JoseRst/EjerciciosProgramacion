package capitulo01.bloque01;

import javax.swing.JOptionPane;

public class ejercicio3 {

	public static void main(String[] args) {
		String str = JOptionPane.showInputDialog("Introduce un numero");
		int var1 = Integer.parseInt(str);
		str = JOptionPane.showInputDialog("Introduce otro numero");
		int var2 = Integer.parseInt(str);		
		str = JOptionPane.showInputDialog("Introduce un numero mas");
		int var3 = Integer.parseInt(str);
		int suma = var1 + var2 + var3 ;
		System.out.println( + suma);
	}
}