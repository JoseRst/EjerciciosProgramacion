package capitulo02.bloque03;

import javax.swing.JOptionPane;

public class ejercicio3_Programa {

	public static void main(String[] args) {
		String str = JOptionPane.showInputDialog("Elige una opci�n: \n1: C�lculo de la hipotenusa de un tri�ngulo. "
				+ " \n2: C�lculo de la superficie de una circunferencia. "
				+ " \n3: C�lculo del per�metro de una circunferencia. "
				+ " \n4: C�lculo del �rea de un rect�ngulo."
				+ " \n5: C�lculo del �rea de un tri�ngulo. "
				+ " \n0: Salir de la aplicaci�n.");
		int operacion = Integer.parseInt(str) ;
		double pi=3.1416;
		
		switch (operacion){

		case 1: 

			double cateto1 = Double.parseDouble(JOptionPane.showInputDialog("Introduce el valor del cateto 1: "));
			double cateto2 = Double.parseDouble(JOptionPane.showInputDialog("Introduce el valor del cateto 2: "));
			double hipotenusa= (Math.pow(cateto1,2)) + (Math.pow(cateto2,2));
			double hipotenusafinal = Math.sqrt(hipotenusa);

			System.out.println("La hipotenusa del triangulo es " + hipotenusafinal);
			break ;
			
		case 2:
			double radio = Double.parseDouble(JOptionPane.showInputDialog("Introduce el valor de la longitud del radio: "));
			double superficie = pi*(Math.pow(radio, 2));
			System.out.println("Superficie de la circunferencia: " + superficie);
			break ;
			
		case 3:
			double radio2 = Double.parseDouble(JOptionPane.showInputDialog("Introduce el valor de la longitud del radio: "));
			double longitud = (2*pi*(radio2));
			System.out.println("Longitud de la circunferencia: " + longitud);
			break;
			
		case 4:
			double alturaRec = Double.parseDouble(JOptionPane.showInputDialog("Introduce la altura del rectangulo: "));
			double longBase = Double.parseDouble(JOptionPane.showInputDialog("Introduce la longitud de la base del rectangulo: "));
			double area = alturaRec*longBase;
			System.out.println("Area del rectangulo: " + area);
			break;
			
		case 5:
			double alturaTri = Double.parseDouble(JOptionPane.showInputDialog("Introduce la altura del triangulo: "));
			double baseTri = Double.parseDouble(JOptionPane.showInputDialog("Introduce la longitud de la base del triangulo: "));
			double area2 = (baseTri*alturaTri) / 2;
			System.out.println("El area del triangulo es: " + area2);
			break;
			
		case 0: 
			return;

		default:

			System.out.println("La opci�n no es correcta.");

		

		}
	}
}