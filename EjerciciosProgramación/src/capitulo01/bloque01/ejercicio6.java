package capitulo01.bloque01;

import javax.swing.JOptionPane;

public class ejercicio6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = JOptionPane.showInputDialog("El valor del euribor es: ");
		float imp = Float.parseFloat("Importe a pagar");
		System.out.println("Importe a pagar: " + imp);
		
		str = JOptionPane.showInputDialog("Introduce el numero de meses");
		int meses = Integer.parseInt(str);
		System.out.println("Importe a pagar: " + meses);
		
		str = JOptionPane.showInputDialog("Introduce el Euribor: ");
		float euri= Float.parseFloat(str);
		System.out.println("Euribor: " + euri);
		
		str = JOptionPane.showInputDialog("Introduce el diferencial: ");
		float difer = Float.parseFloat(str);
		System.out.println("Diferencial: " + difer);
		
		float intanu = (euri + difer);
		System.out.println("Interes anual: " + intanu);
		
		float intmensual = ((intanu/12)/100) ;
		System.out.println("Interes mensual: " + intmensual);
		
		double cuotamensual = imp * ((intmensual * Math.pow(1 + intmensual, meses)) / (Math.pow(1 + intmensual, meses) - 1));
		System.out.println("Cuota mensuale a pagar: " + cuotamensual);
		
		
		
		
	}
}
