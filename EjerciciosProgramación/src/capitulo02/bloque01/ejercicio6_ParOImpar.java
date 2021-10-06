package capitulo02.bloque01;

import javax.swing.JOptionPane;

public class ejercicio6_ParOImpar {

	public static void main(String[] args) {
			
			String str = JOptionPane.showInputDialog("Introduce un número: ");
			int var = Integer.parseInt(str);
				
			if (var % 2 == 0) {
				System.out.println("El  numero " + var + " es par.");
			}
			else {
				System.out.println("El  numero " + var + " es impar.");
			}

	}

}

