package bloque3;

import javax.swing.JOptionPane;

public class bloque3_ejercicio2MayoryMenor {
	public static void main(String[] args) {
		int mayor = 0, menor = 0, i = 0, num;

		do {
			num = Integer.parseInt(JOptionPane.showInputDialog("Introduzca un numero(0 para terminar): "));
			if (i == 0) {
				mayor = num;
				menor = num;

			}
			if (num > mayor && num != 0) {
				mayor = num;
			}
			if (num < menor && num != 0) {
				menor = num;
			}
			i++;
		} while (num != 0);
		System.out.println("El numero  mayor es: " + mayor);
		System.out.println("El numnero menor es: " + menor);

	}
}