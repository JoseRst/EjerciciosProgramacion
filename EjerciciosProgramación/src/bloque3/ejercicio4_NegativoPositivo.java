package bloque3;

import javax.swing.JOptionPane;

public class ejercicio4_NegativoPositivo {

	public static void main(String[] args) {
	int contadorPositivo = 0, contadorNegativo = 0, num = 1;

	while (num !=0) {
		
	num = Integer.parseInt(JOptionPane.showInputDialog("Introduzca un numero: "));
	
	if (num == 0){
	break;
	}
	if(num > 0) {
		contadorPositivo++;
	}
	if (num < 0) {
		contadorNegativo++;
	}
	

}	
	System.out.println("Numeros positivos: "+ contadorPositivo);
	System.out.println("Numeros negativo: "+ contadorNegativo);
}
}

