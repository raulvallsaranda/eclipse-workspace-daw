package exercicis.tema03.arrays02;

import java.util.Scanner;

public class Exercici07MatriuCreixent {

	private static final int MIDA_MAXIMA = 10;
	private static final int MIDA_MINIMA = 2;
	private static final int VALOR_MINIM = 0;
	private static final int VALOR_MAXIM = 9;

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		int numero = 0;
		boolean entradaValida = false;
		boolean midaMaxima = false;
		// matriu
		int[][] matriu;
		int[][] matriuAux;
		int midaActual = 2;
		// matriu inicial
		matriu = new int[midaActual][midaActual];
		do {
			// demanar enter a l'usuari
			entradaValida = false;
			do {
				System.out.println("Escriu un enter entre " + VALOR_MINIM + " i " + VALOR_MAXIM);
				if (entrada.hasNextInt()) {
					numero = entrada.nextInt();
					entrada.nextLine();
					if ((numero >= VALOR_MINIM) && (numero <= VALOR_MAXIM)) {
						entradaValida = true;
					} else {
						System.out.println("Error: enter fora de rang");
					}

				} else {
					while (entrada.nextLine().equals("")) {
					}
					System.out.println("Error: no és un enter");
				}

			} while (!entradaValida);

			// actualitzem la mida de la matriu

			if (midaActual == MIDA_MINIMA) {
				// emplenem amb els valors
				for (int i = 0; i < matriu.length; i++) {
					for (int j = 0; j < matriu[i].length; j++) {
						matriu[i][j] = numero;
					}
				}
			} else {
				// creem una matriu auxiliar
				matriuAux = new int[midaActual][midaActual];
				// fiquem els valors actuals de la matriu
				// afegim nous valors a la dreta i avall

				for (int i = 0; i < matriuAux.length; i++) {
					for (int j = 0; j < matriuAux.length; j++) {
						if (i == matriuAux.length - 1) {
							matriuAux[i][j] = numero;
						} else if (j == matriuAux.length - 1) {
							matriuAux[i][j] = numero;
						} else {
							matriuAux[i][j] = matriu[i][j];
						}
					}
				}
				// intercanviem matrius
				matriu = matriuAux;
			}
			// mostrem la matriu
			System.out.println("Matriu mida: " + midaActual);
			for (int i = 0; i < matriu.length; i++) {
				for (int j = 0; j < matriu[i].length; j++) {
					System.out.print(matriu[i][j] + " ");
				}
				System.out.println();
			}
			midaActual++;
			if (midaActual > MIDA_MAXIMA) {
				midaMaxima = true;
			}

		} while (!midaMaxima);

	}

}
