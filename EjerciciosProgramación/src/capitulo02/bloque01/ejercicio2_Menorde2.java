package capitulo02.bloque01;

import javax.swing.JOptionPane;

public class ejercicio2_Menorde2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			String str = JOptionPane.showInputDialog("Introduzca un numero");
			int var1 = Integer.parseInt(str);
			
			str = JOptionPane.showInputDialog("Introduzca un numero");
			int var2 = Integer.parseInt(str);
			
			if ( var1 < var2 ) {
				System.out.println("El numero menor es: " + var1);
			}
			else {
					System.out.println("El numero menor es: " + var2);
			}
			
		}
	}


