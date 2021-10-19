package bloque4;

import java.util.Scanner;

public class ejercicio5_bloque4_Factorial {

	public static void main(String[] args) {

		int factorial = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce numero factorial: ");
		
		factorial = sc.nextInt();
		
		int i = factorial - 1;
		
		while ( i > 1) {
			factorial = factorial * i;
			 i--;
		}
		System.out.println("El valor del factorial equivale a " + factorial);
	}
	
}