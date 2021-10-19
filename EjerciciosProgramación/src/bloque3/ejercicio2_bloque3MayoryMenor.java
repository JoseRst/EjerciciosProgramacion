package bloque3;

import javax.swing.JOptionPane;

public class ejercicio2_bloque3MayoryMenor {
	public static void main(String[] args) {
		int mayor = 0, menor = 0, i = 0, num = 1;

		while (num != 0) {
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
		}
		System.out.println("El numero  mayor es: " + mayor);
		System.out.println("El numnero menor es: " + menor);

	}
}