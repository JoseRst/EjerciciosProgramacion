package bloque03.capitulo1Limite.copy;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class ejercicio4_bloque3_ {

	public static void main(String[] args) {

		int num;
		int multiplo;
		int limite;

		limite = Integer.parseInt(JOptionPane.showInputDialog("Introduce el limite: "));

		num = Integer.parseInt(JOptionPane.showInputDialog("Introduce el numero para sacar el multiplo: "));

		System.out.println("Los multiplos de " + num + " son: ");

		for (int i = 0; i < limite; i++) {
			multiplo = num * i;
			if (multiplo < limite) {
				System.out.println(multiplo);
			}
		}

	}

}
