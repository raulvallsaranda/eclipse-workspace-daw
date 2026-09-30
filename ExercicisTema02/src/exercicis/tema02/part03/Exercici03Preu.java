package exercicis.tema02.part03;

import java.util.Scanner;

public class Exercici03Preu {

	private static final double GRATIS = 0;
	private static final double LIMIT_BARAT = 20;
	private static final double LIMIT_CAR = 50;
	private static final String RATOLI =
			"   /\n"
			+ " __|_\n"
			+ "|____|\n"
			+ "|    |\n"
			+ "|    |\n"
			+ "\\____/\n"
			+ "";

	public static void main(String[] args) {
		// variables
		double preuRatoli = 0.0;
		Scanner entrada = new Scanner(System.in);
		// demanem el preu a l'usuari
		System.out.println("Introdueix el preu del ratolí:");
		if (entrada.hasNextDouble()) {
			preuRatoli = entrada.nextDouble();
			entrada.nextLine();
			if (preuRatoli < GRATIS) {
				System.out.println("El preu "+preuRatoli+"€ no és vàlid (no pot ser negatiu).");
			} else if(preuRatoli == GRATIS) {
				System.out.println("Ratolí GRATIS!!");
				System.out.println(RATOLI);
			} else if(preuRatoli < LIMIT_BARAT) {
				System.out.println("El preu "+preuRatoli+"€ es pot considerar barat.");
			} else if(preuRatoli < LIMIT_CAR) {
				System.out.println("El preu "+preuRatoli+"€ es pot considerar car.");
			} else {
				System.out.println("El preu "+preuRatoli+"€ es pot considerar abusiu.");
			}

		} else {
			System.out.println("No has introduït un preu.");
		}
		//tanquem Scanner
		entrada.close();

	}

}
