package capitulo02.bloque03;

import javax.swing.JOptionPane;

public class ejercicio1_ClaseNota {

	public static void main(String[] args) {
		String str = JOptionPane.showInputDialog("Introduce la nota : ");
		int nota = Integer.parseInt(str); 
		
		System.out.println("La nota equivale a: ");
		
		switch (nota) {
		case 0:
		case 1:
		case 2:
			System.out.println("Muy deficiente"); 
			break;
		case 3:
		case 4:
			System.out.println("Deficiente");
			break;
		case 5:
			System.out.println("Suficiente");
			break;
		case 6:
			System.out.println("Bien");
			break;
		case 7:
		case 8:
			System.out.println("Notable");
			break;
		case 9:
		case 10:
			System.out.println("Sobresaliente");
			break;
		default:
			System.out.println("Error, el valor no pertenece a ninguna nota");
		}
	}
}