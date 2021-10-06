package capitulo02.bloque03;

import javax.swing.JOptionPane;

public class ejercicio4_Monedas {

		public static void main(String[] args) {
			
			String str = JOptionPane.showInputDialog("Introduce el importe de tu compra: ");
			double importe = Double.parseDouble(str);
			
			
			str = JOptionPane.showInputDialog("Introduce la cantidad recibida: ");
			double cantidad = Double.parseDouble(str);
			
			double cambio = cantidad - importe;
			
			int cien = 0;
			int cincuenta = 0;
			int veinticinco = 0;
			int cinco = 0;
			int uno = 0;
			
			if (cambio == 0) {
				System.out.println("No tiene cambio.");			
			}
			else {
				cien =(int) cambio / 100;
				cambio = cambio % 100;
				
				System.out.println(cien + " monedas de 100 = " + (cien*100));
				
				cincuenta = (int) cambio/50;
				cambio = cambio % 50;
				
				System.out.println(cincuenta + " monedas de 50 = " + (cincuenta*50));
				
				veinticinco = (int) cambio/25;
				cambio = cambio %25;
				
					System.out.println(veinticinco + " monedas de 25 = " + (veinticinco*25));
				
				cinco = (int) cambio/5;
				cambio = cambio % 5;
				
				System.out.println(cinco + " monedas de 5 = " + (cinco*5));
				
				uno = (int) cambio/1;
				cambio = cambio%1;

				System.out.println(cien + " monedas de 100 = " + (cien*100));
			}
			
			
				System.out.println("Le debe devolver: " + cambio);
		}
}
			
			
