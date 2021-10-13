package bloque03.capitulo1;

import javax.swing.JOptionPane;

public class ejercicio03_contador {

	public static void main(String[] args) {
			int repeticiones = 0;
			int suma = 0;
			int numero;
			int contadorP= 0;
			int contadorN = 0;
			
			
			repeticiones = Integer.parseInt(JOptionPane.showInputDialog("Introduce el numero de repeticiones: "));
			
			for (int i = 0; i < repeticiones ; i++) {
				numero = Integer.parseInt(JOptionPane.showInputDialog("Introduce un numero: "));
				
				if (numero > 0) {
					contadorP++;
				}
				else {
					if (numero < 0) {
						contadorN++;
					}
					else {
						
					}
				
				
					
				}
				
			}
			System.out.println("Suma positivos: " + contadorP);
			System.out.println("Suma negativo: " + contadorN);
	
	}
			
}





