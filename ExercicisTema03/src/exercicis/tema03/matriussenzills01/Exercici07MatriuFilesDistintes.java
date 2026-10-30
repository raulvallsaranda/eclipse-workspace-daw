package exercicis.tema03.matriussenzills01;

import java.util.Random;

public class Exercici07MatriuFilesDistintes {

	private static final int N = 10; // files

	private static final int COLUMNES_MINIM = 2;
	private static final int COLUMNES_MAXIM = 10;

	private static final String VOCALS = "AEIOU";

	public static void main(String[] args) {

		// variables
		String[][] matriu = new String[N][];
		Random aleatori = new Random();
		int comptador = 0;

		// creem la matriu
		for (int i = 0; i < matriu.length; i++) {
			// afegim fila
			matriu[i] = new String[aleatori.nextInt(COLUMNES_MINIM, COLUMNES_MAXIM + 1)];
			// emplenem fila
			for (int j = 0; j < matriu[i].length; j++) {
				matriu[i][j] = "" + VOCALS.charAt(aleatori.nextInt(VOCALS.length()));
				if (comptador % 2 == 1) {
					matriu[i][j] = matriu[i][j].toLowerCase();
				}
				comptador++;
			}
		}

		// mostrem la matriu
		System.out.println("Matriu "+N+" files:");
		for (int i = 0; i < matriu.length; i++) {
			System.out.print("Fila "+i+" ("+matriu[i].length+"):");
			for (int j = 0; j < matriu[i].length; j++) {
				System.out.print(matriu[i][j] + " ");
			}
			System.out.println();
		}

	}

}
