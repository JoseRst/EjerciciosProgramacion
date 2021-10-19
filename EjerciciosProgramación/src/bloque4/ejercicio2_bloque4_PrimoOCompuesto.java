package bloque4;

import java.util.Scanner;

public class ejercicio2_bloque4_PrimoOCompuesto {

	public static void main(String[] args) {
		int limitInf = 0, limitSup = 0;

		Scanner sc = new Scanner(System.in);

		System.out.println("Limite inferior");
		limitInf = sc.nextInt();

		System.out.println("Limite superior");
		limitSup = sc.nextInt();

		while (limitInf < limitSup) {

			boolean numeroEsPrimo = true;
			int i = 2;
			while (i < limitInf) {
				if (limitInf % i == 0) {
					numeroEsPrimo = false;
					break;
				}
				i++;
			}

			if (numeroEsPrimo == true) {
				System.out.println("El número " + limiteInf + " es primo.");
			}
			limiteInf++;

		}

	}
}