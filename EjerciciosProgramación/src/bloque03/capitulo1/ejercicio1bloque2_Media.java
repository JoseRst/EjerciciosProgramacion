package bloque03.capitulo1;

import javax.swing.JOptionPane;

public class ejercicio1bloque2_Media {
		
	public static void main(String[] args) {
		int repeticiones = 0;			int suma = 0;
		int numero = 0; 	int media = 0;
		
		repeticiones = Integer.parseInt(JOptionPane.showInputDialog("Introduce el numero de repeticiones: "));
		
			for (int i = 0; i < repeticiones ; i++) {
			numero = Integer.parseInt(JOptionPane.showInputDialog("Introduce un numero entero: "));
			
			if ( numero > 10) {
			suma += numero ;
				}
				
			}
			System.out.println("Suma: " + suma);
	}

}
