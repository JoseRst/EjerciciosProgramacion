package capitulo01.bloque01;

import javax.swing.JOptionPane;

public class Ejercicio01_PidoTresNumeros {

	public static void main(String[] args) {
		String str = JOptionPane.showInputDialog("37 ");
		int var1 = Integer.parseInt(str);
		
		str = JOptionPane.showInputDialog("44");
		float var2 = Float.parseFloat(str);
		
		str = JOptionPane.showInputDialog("3,4");
		double var3 = Double.parseDouble(str);
		
		
		
		System.out.println("37 " + var1 +  "44 " + var2 + "3,4:" + var3);


	}

}
