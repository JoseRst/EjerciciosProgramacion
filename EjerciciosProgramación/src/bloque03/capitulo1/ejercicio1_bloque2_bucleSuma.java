package bloque03.capitulo1;

import javax.swing.JOptionPane;

public class ejercicio1_bloque2_bucleSuma {

	public static void main(String[] args) {

		int suma = 0;
		int numero = 0;

		for (int i = 0; i < 4; i++) {
			numero = Integer.parseInt(JOptionPane.showInputDialog("Introduce un numero entero: "));

			if (numero > 10) {
				suma += numero;
			}

		}
		System.out.println("Suma: " + suma);
	}
}
