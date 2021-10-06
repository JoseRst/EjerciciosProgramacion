package capitulo02.bloque02;

import javax.swing.JOptionPane;

public class Ejercicio01_Acumuladores {

	public static void main(String[] args) {
		
			String str = JOptionPane.showInputDialog("Introduce un numero: ");
			int var1 = Integer.parseInt(str);
			
			str = JOptionPane.showInputDialog("Introduce un segundo numero: ");
			int var2 = Integer.parseInt(str);
			
			str = JOptionPane.showInputDialog("Introduce un tercer numero: ");
			int var3 = Integer.parseInt(str);
			
			str = JOptionPane.showInputDialog("Introduce un cuarto numero: ");
			int var4 = Integer.parseInt(str);
			
			str = JOptionPane.showInputDialog("Introduce un quinto numero: ");
			int var5 = Integer.parseInt(str);
			
			int numNegativo = 0;
			int numBajos = 0;
			int numMedios = 0;
			int numGrandes = 0;
		
			
			if (var1 < 0) {
				numNegativo = numNegativo + var1;
			}
			if (var2 < 0) {
				numNegativo = numNegativo + var2;
			}
			if (var3 < 0) {
				numNegativo = numNegativo + var3;
			}
			if (var4 < 0) {
				numNegativo = numNegativo + var4;
			}
			if (var5 < 0) {
				numNegativo = numNegativo + var5;
			}		
			
			System.out.println("Suma numeros negativos: "+ numNegativo);
			
			if (var1 >= 0 && var1 <25) {
				numBajos = numBajos + var1;
			}
			if (var2 >= 0 && var2 <25) {
				numBajos = numBajos + var2;
			}
			if (var3 >= 0 && var3 <25) {
				numBajos = numBajos + var3;
			}
			if (var4 >= 0 && var5 <25) {
				numBajos = numBajos + var4;
			} 
			if (var5 >= 0 && var5 <25) {
				numBajos = numBajos + var5;
			}
			
			System.out.println("Suma numeros bajos: "+ numBajos);
			
			if (var1 >= 15 && var1 <=250) {
				numMedios = numMedios + var1;
			}
			if (var2 >= 15 && var2 <=250) {
				numMedios = numMedios + var2;
			}
			if (var3 >= 15 && var3 <=250) {
				numMedios = numMedios + var3;
			}
			if (var4 >= 15 && var4 <=250) {
				numMedios = numMedios + var4;
			}
			
			System.out.println("Suma numeros medios: " + numMedios);
			
			if (var1 > 250) {
				numGrandes = numGrandes + var1;
			}

			if (var2 > 250) {
				numGrandes = numGrandes + var2;
			}
			if (var3 > 250) {
				numGrandes = numGrandes + var3;
			}
			if (var4 > 250) {
				numGrandes = numGrandes + var4;
			}
			if (var5 > 250) {
				numGrandes = numGrandes + var5;
			}
			System.out.println("Suma numeros grandes: "+ numGrandes);
	}
}