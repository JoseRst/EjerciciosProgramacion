package capitulo02.bloque01;

import javax.swing.JOptionPane;

public class ejercicio3_Mayorde5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			String str = JOptionPane.showInputDialog("Introduzca un numero");
			int var1 = Integer.parseInt(str);
			
			str = JOptionPane.showInputDialog("Introduzca un numero");
			int var2 = Integer.parseInt(str);
			
			str = JOptionPane.showInputDialog("Introduzca un numero");
			int var3 = Integer.parseInt(str);
			
			str = JOptionPane.showInputDialog("Introduzca un numero");
			int var4 = Integer.parseInt(str);
			
			str = JOptionPane.showInputDialog("Introduzca un numero");
			int var5 = Integer.parseInt(str);
			
			if ( var1 > var2 && var1 > var3 && var1 > var4 && var1> var5) {
				System.out.println("El numero mayor es: " + var1 );
			}
			if (var2 > var1 && var2> var3 && var2 > var4 && var2 > var5) {
					System.out.println("El numero mayor es: " +  var2 );
			}
			if (var3 > var1 && var3 > var2 && var3 > var4 && var3 > var5) {
				System.out.println("El numero mayor es: " + var5);
			}
			if (var4 > var1 && var4 > var2 && var4 > var5 && var4 > var5) {
				System.out.println("El numero mayor es: " + var4);
			}
			if (var5 > var1 && var5 > var2 && var5 > var3 && var5 > var4) {
				System.out.println("El numero mayor es: " +var5);
			}
	}
}
