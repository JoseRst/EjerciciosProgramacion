package bloque3;

import javax.swing.JOptionPane;

public class ejercicio3_bloque3_Tablas {

	public static void main(String[] args) {
		int num = 1;
		while (num != 0) {
			num = Integer.parseInt(JOptionPane.showInputDialog("Introduzca numero: "));
			if (num == 0) {
				break;
			}
			for (int i = 1; i < 11; i++) {

				System.out.println(num + " x " + i + " = " + (i * num));
				if (i > 9) {
					System.out.println("\n");
				}

			}

		}

	}
}
