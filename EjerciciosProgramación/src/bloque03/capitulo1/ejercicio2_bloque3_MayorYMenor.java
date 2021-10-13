package bloque03.capitulo1;

import javax.swing.JOptionPane;


public class ejercicio2_bloque3_MayorYMenor {

	public static void main(String[] args) {
		int mayor = 0;
		int menor = 0;
		int num;
	
		String str = JOptionPane.showInputDialog("Introduce la cantidad de números que quieres introducir: ");
		int cantidad= Integer.parseInt(str);

	
		for (int i = 0; i < cantidad; i++) {
			str = JOptionPane.showInputDialog("Introduce un número: ");
			num = Integer.parseInt(str);
			
			if (i == 0) {
				mayor = num;
				menor = num;
			}
			else if (mayor < num){

					mayor = num;
					
			}
			else if (menor > num) {
				menor = num;
				
			}			
		}
		
		System.out.println("El número más grande introducido es: " + mayor);
		System.out.println("El número más pequeño introducido es: " + menor);


	}

}
