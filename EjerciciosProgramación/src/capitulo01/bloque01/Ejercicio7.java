package capitulo01.bloque01;

import javax.swing.JOptionPane;

public class Ejercicio7 {

	public static void main(String[] args) {
		
		String str = JOptionPane.showInputDialog("Introduce un número: ");
		int var = Integer.parseInt(str);
		
		if ((var & 1) == 1) {
			System.out.println("El  numero " + var + " es impar.");
		}
		else {
			System.out.println("El  numero " + var + " es par.");
		}

}

}
