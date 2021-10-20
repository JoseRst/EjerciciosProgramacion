package bloque4;

public class ejercicio3_bloque4_Tablas {

	public static void main(String[] args) {
		int i = 1;
		int factor = 1;

		while (factor < 16) {

			while (i < 11) {

				System.out.println(factor + " x " + i + " = " + (i * factor));
				i++;
				if (i == 11) {
					System.out.println("");
				}
			}
			factor++;
			i = 1;
		}
	}
}
