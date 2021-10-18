package bloque03.capitulo1;

import javax.swing.JOptionPane;

public class ejercicio3_bloque3Multiplo {

	public static void main(String[] args) {

		int num;
		int multiplo;

		num = Integer.parseInt(JOptionPane.showInputDialog("Introduce el numero para sacar el multiplo: "));

		System.out.println("Los multiplos de " + num + " son: ");

		for (int i = 0; i < 100; i++) {
			multiplo = num * i;
			if (multiplo < 100) {
				System.out.println(multiplo);
			}
		}
	}

}
