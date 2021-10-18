package bloque3;

import javax.swing.JOptionPane;

public class ejercicio1_bloque3_Cerrar0 {

	public static void main(String[] args) {
		int numero = 0, suma = 0, media = 0;
		int i = 0;

		do {

			numero = Integer.parseInt(JOptionPane.showInputDialog("Introduzca un numero( 0 para terminar): "));
			suma += numero;
			i++;

		} while (numero !=0);
		media = suma / (i-1);

		System.out.println("Suma: " + suma);
		System.out.println("Media: " + media);
	}
}

