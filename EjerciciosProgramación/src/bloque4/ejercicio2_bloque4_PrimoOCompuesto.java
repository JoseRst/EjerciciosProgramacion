package bloque4;

import java.util.Scanner;

public class ejercicio2_bloque4_PrimoOCompuesto {

	public static void main(String[] args) {
		int limitInf = 0, limitSup;
		
		Scanner sc = new Scanner(System.in);

		System.out.println("Limite inferior");
		limitInf = sc.nextInt();

		System.out.println("Limite superior");
		limitSup = sc.nextInt();
		int num = limitInf+1;
		boolean numeroEsPrimo = true;
		
		do {	
			int i = 2;
			while (i <(num/2+1)) {
				if (num % i == 0) {
					numeroEsPrimo = false;
					break;
				}
				i++;
			}
		
			if (numeroEsPrimo == true) {
				System.out.println("El número " + num + " es primo.");
			}
				else {
				System.out.println("El numero " + num + " es compuesto");
			}

		} while (num<limitSup);
	}
}