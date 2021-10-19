package bloque4;

import java.util.Scanner;

public class ejercicio4_bloque4_Binario {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Numero para convertir: ");
		int var = sc.nextInt();
		
		int i = 128;
		
		while (i > 0) {
			if ((var & i) == 0) {
				System.out.print("0");
			}else {
				System.out.print("1");
			}
			i/= 2;
		}
		
	}

}
