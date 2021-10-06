package capitulo02.bloque01;

import javax.swing.JOptionPane;

public class ejercicio7_ParImparconAND {

	public static void main(String[] args) {

		String str = JOptionPane.showInputDialog("Introduce un número: ");
		int var = Integer.parseInt(str);
		
		
		if ((var & 1) == 1) {
			System.out.println("El  numero es impar: " + var);
		}
		else {
			System.out.println("El  numero es par: " + var);
		}

	}
}


