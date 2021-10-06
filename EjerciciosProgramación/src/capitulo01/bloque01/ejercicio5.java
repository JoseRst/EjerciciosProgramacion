package capitulo01.bloque01;

import javax.swing.JOptionPane;


public class ejercicio5 {

	public static void main(String[] args) {
		String str = JOptionPane.showInputDialog("Introduzca valor 1");
		int var1 = Integer.parseInt(str);
	
		str = JOptionPane.showInputDialog("Introduzca valor 2");
		int var2 = Integer.parseInt(str);
	
		System.out.println("Numeros antes del intercambio: " + var1 + " y " + var2);
	
		int aux = var1 ;
		var1 = var2 ;
		var2 = aux ;
	
		System.out.println("Numero despues del intercambio: " + var1 + " y "+ var2);
	
	}
	
}