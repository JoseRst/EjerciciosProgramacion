package capitulo01.bloque01;

import javax.swing.JOptionPane;

public class ejercicio2 {

	public static void main(String[] args) {
		String str = JOptionPane.showInputDialog("Introduzca un numero entero");
		int var1 = Integer.parseInt(str);
		System.out.println (+ var1) ;
		
		str = JOptionPane.showInputDialog("Introduzca un numero flotante");
		float var2 = Float.parseFloat(str);
		System.out.println (+ var2) ;
		
		str = JOptionPane.showInputDialog("Introduzca un numero double");
		double var3 = Double.parseDouble(str);
		System.out.println (+ var3);
		
		
		
		System.out.println("Numero entero:" + var1 +  "Numero flotante:" + var2 + "Numero double:" + var3);


	}

}