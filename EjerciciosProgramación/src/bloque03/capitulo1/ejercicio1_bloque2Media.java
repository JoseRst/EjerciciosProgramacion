 package bloque03.capitulo1;

import javax.swing.JOptionPane;

public class ejercicio1_bloque2Media {

	public static void main(String[] args) {
		int cantidad = 0; int suma = 0;
		int numero = 0; 	int media = 0;
		
		cantidad = Integer.parseInt(JOptionPane.showInputDialog("Introduce el numero de repeticiones: "));
		
			for (int i = 0; i < cantidad ; i++) {
			numero = Integer.parseInt(JOptionPane.showInputDialog("Introduce un numero entero: "));
			
			if ( numero > 10) {
			media = suma / cantidad;
				}
				
			}
			System.out.println("Media: " + media);
	}

}


