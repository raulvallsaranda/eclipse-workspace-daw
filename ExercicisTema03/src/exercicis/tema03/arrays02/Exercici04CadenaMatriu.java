package exercicis.tema03.arrays02;

import java.util.Random;
import java.util.Scanner;

public class Exercici04CadenaMatriu {
	private static final int LONGITUD_MINIMA = 2;
	private static final int LONGITUD_MAXIMA = 10;
	private static final String EMOJI = "🍀";
	private static final String CADENA = "java";
	private static final String[] CARACTERS = { "🐳", "🎉", "🚨", "😎", "🐞", "🥌", "🌳", "🦈", "🐿️", "🐝" };

	public static void main(String[] args) {
		// variables
		Scanner entrada = new Scanner(System.in);
		Random aleatori = new Random();
		String cadena = "";
		boolean entradaValida = false;
		String matriu[][];

		// demanar cadena
		do {
			System.out.println(
					"Escriu una cadena que tinga entre " + LONGITUD_MINIMA + " i " + LONGITUD_MAXIMA + " caràcters");
			cadena = entrada.nextLine().trim();

			if (cadena.isBlank()) {
				System.out.println("La cadena no pot estar buida.");
			} else if ((cadena.length() >= LONGITUD_MINIMA) && (cadena.length() <= LONGITUD_MAXIMA)) {
				entradaValida = true;
			} else {
				System.out.println("Error: la longitud de la cadena no és correcta");
			}
		} while (!entradaValida);

		// mostrem la cadena
		System.out.println("La teua cadena: " + cadena);

		if (cadena.equalsIgnoreCase(CADENA)) {
			matriu = new String[LONGITUD_MAXIMA][LONGITUD_MAXIMA];
			for (int i = 0; i < matriu.length; i++) {
				for (int j = 0; j < matriu[i].length; j++) {
					matriu[i][j] = EMOJI;
				}
			}
		} else {
			// creem matriu quadrada
			matriu = new String[cadena.length()][cadena.length()];

			// emplenem la matriu amb cadena i caràcters aleatòris
			for (int i = 0; i < matriu.length; i++) {
				for (int j = 0; j < matriu[i].length; j++) {
					if (j <= i) {
						matriu[i][j] = "" + cadena.charAt(j);
					} else {
						matriu[i][j] = CARACTERS[aleatori.nextInt(CARACTERS.length)];
					}
				}
			}
		}

		// mostrem la matriu
		for (int i = 0; i < matriu.length; i++) {
			for (int j = 0; j < matriu[i].length; j++) {
				System.out.print(matriu[i][j] + "\t");
			}
			System.out.println();
		}

		// tanquem scanner
		entrada.close();

	}

}
