package capitulo02.bloque03;

import javax.swing.JOptionPane;

public class ejercicio2_Calculadora {

	public static void main(String[] args) {
	
		String str = JOptionPane.showInputDialog("Elige una opción: \n1: Raiz cuadrada \n2: Potencia \n3: Modulo de division");
		int operacion = Integer.parseInt(str) ;
		
		switch (operacion) {
		
		case 1:
			double var1 = Double.parseDouble(JOptionPane.showInputDialog("Introduce un numero para obtener la raiz cuadrada: " ));
			double raiz = Math.sqrt(var1);
			System.out.println("Resultado de la raiz cuadrada: " + raiz);
			break;
			
		case 2:
			double var2 = Double.parseDouble(JOptionPane.showInputDialog("Introduce un numero para elevar: "));
			double potencia = Double.parseDouble(JOptionPane.showInputDialog("Introduce el numero al que se va a elevar: "));
			double resPotencia = Math.pow(var2, potencia);
			System.out.println("Resultado del numero elevado: " + resPotencia);
			break;
		
		case 3:
			double var3 = Double.parseDouble(JOptionPane.showInputDialog("Introduce el dividendo: "));
			double var4 = Double.parseDouble(JOptionPane.showInputDialog("Introduce el divisor: "));
			double resto = var3 % var4 ;
			System.out.println("cociente de la división: " + resto);
			break;
		
		default:
			System.out.println("Operación denegada, introduce un número del 1 al 3.");
		
		}
		
		
	}

}
