package tema02.estructura.condicionals;

import java.util.Scanner;

public class Notes {

	// constants
	private static final double VALOR_MINIM = 0.0;
	private static final double LIMIT_SUFICIENT = 5.0;
	private static final double LIMIT_BE = 6.0;
	private static final double LIMIT_NOTABLE = 7.0;
	private static final double LIMIT_EXECELLENT = 9.0;
	private static final double VALOR_MAXIM = 10.0;

	public static void main(String[] args) {

		// declaració de variables
		double notaUsuari = 0.0;
		Scanner entrada = new Scanner(System.in);

		// demanar número a l'usuari
		System.out.println("Escriu la nota (entre "+VALOR_MINIM+" i "+VALOR_MAXIM+"):");
		// si és un número decimal (double)

		if (entrada.hasNextDouble()) {
			notaUsuari = entrada.nextDouble();
			entrada.nextLine();
			// comprovem si està entre 0 i 10
			if ((notaUsuari >= VALOR_MINIM) && (notaUsuari <= VALOR_MAXIM)) {
				// si està entre 0 i 10
				if (notaUsuari < LIMIT_SUFICIENT) {
					System.out.println("Nota d'usuari: " + notaUsuari + " (Suspés)");
				} else if (notaUsuari < LIMIT_BE) {
					System.out.println("Nota d'usuari: " + notaUsuari + " (Suficient)");
				} else if (notaUsuari < LIMIT_NOTABLE) {
					System.out.println("Nota d'usuari: " + notaUsuari + " (Bé)");
				} else if (notaUsuari < LIMIT_EXECELLENT) {
					System.out.println("Nota d'usuari: " + notaUsuari + " (Notable)");
				} else {
					System.out.println("Nota d'usuari: " + notaUsuari + " (Excel·lent)");
				}

			} else {
				// si no està entre 0 i 10
				// acaba: error
				System.out.println("Error: la nota ha d'estar entre 0 i 10");
			}

		} else {
			// si no és un número double
			// acaba: error
			System.out.println("Error: no has introduït una nota vàlida");
		}

	}

}
