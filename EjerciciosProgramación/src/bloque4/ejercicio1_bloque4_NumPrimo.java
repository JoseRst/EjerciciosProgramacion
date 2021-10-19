package bloque4;

import java.util.Scanner;

public class ejercicio1_bloque4_NumPrimo {

	public static void main(String[] args) {
		int numero = 50000;
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce un numero: ");
		numero = sc.nextInt();
		
		boolean numeroEsPrimo = true;
		for (int i = 2; i < (numero / 2 + 1); i++) {
			if (numero % i == 0) {
				numeroEsPrimo = false;
				break;
			}
		}

		if (numeroEsPrimo == true) {
			System.out.println("el numero " + numero + " es primo.");
		}else {
			System.out.println("El numero "+ numero + " no es primo.");
		}

	}
}
