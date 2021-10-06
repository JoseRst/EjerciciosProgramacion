package capitulo02.bloque01;

import javax.swing.JOptionPane;


public class Ejercicio1mayorde2 {

	public static void Ejercicio1bloque2 () {
		String str = JOptionPane.showInputDialog("Introduzca un numero");
		int var1 = Integer.parseInt(str);
		
		str = JOptionPane.showInputDialog("Introduzca un numero");
		int var2 = Integer.parseInt(str);
		
		if ( var1 > var2 ) {
			System.out.println("El numero mayor es: " + var1);
		}
		else {
				System.out.println("El numero mayor es: " + var2);
		}
		
	}
}