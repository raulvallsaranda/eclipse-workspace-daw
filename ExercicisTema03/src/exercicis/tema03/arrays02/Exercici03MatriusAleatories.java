package exercicis.tema03.arrays02;

import java.time.LocalDate;
import java.time.Period;
import java.util.Random;
import java.util.Scanner;

public class Exercici03MatriusAleatories {

	private static final int LIMIT_MATRIU_INFERIOR = 2;
	private static final int LIMIT_MATRIU_SUPERIOR = 10;
	private static final int VALOR_MINIM = 0;
	private static final int VALOR_MAXIM = 9;

	public static void main(String[] args) {

		// declaració de variables
		Scanner entrada = new Scanner(System.in);
		Random aleatori = new Random();
		int midaMatriu = 0;
		long intents = 0l;
		int filaIgual = 0;
		boolean entradaValida = false;
		boolean filaCompletaIgual = false;
		long iniciProva = 0;
		long finalProva = 0;
		long segonsProva = 0;
		// declarem matriu
		int[][] matriu;

		// demanar valor
		do {
			System.out.println("Introdueix un enter entre " + LIMIT_MATRIU_INFERIOR + " i " + LIMIT_MATRIU_SUPERIOR);
			if (entrada.hasNextInt()) {
				midaMatriu = entrada.nextInt();
				entrada.nextLine();
				if ((midaMatriu >= LIMIT_MATRIU_INFERIOR) && (midaMatriu <= LIMIT_MATRIU_SUPERIOR)) {
					entradaValida = true;
				} else {
					System.out.println(
							"Error: entrada no està entre " + LIMIT_MATRIU_INFERIOR + " i " + LIMIT_MATRIU_SUPERIOR);
				}
			} else {
				while (entrada.nextLine().equals("")) {
				}
				System.out.println("Error: l'entrada no és un enter");
			}
		} while (!entradaValida);

		// generem matrius i comprovem files
		matriu = new int[midaMatriu][midaMatriu];
		// inici de la prova:
		iniciProva = System.currentTimeMillis();

		do {

			// generem matriu
			for (int i = 0; i < matriu.length; i++) {
				for (int j = 0; j < matriu[i].length; j++) {
					matriu[i][j] = aleatori.nextInt(VALOR_MINIM, VALOR_MAXIM + 1);
				}
			}
			intents++;
			// comprovem fila per fila
			for (int i = 0; i < matriu.length; i++) {
				for (int j = 1; j < matriu[i].length; j++) {
					if (matriu[i][j - 1] == matriu[i][j]) {
						filaCompletaIgual = true;
					} else {
						filaCompletaIgual = false;
						break;
					}
				}
				if (filaCompletaIgual == true) {
					// si hem trobat una fila igual acabem de recórrer la matriu
					filaIgual = i;
					break;

				}
			}

			// mostrem intent de matriu:
			System.out.println("Intent: " + intents);
			System.out.println("--------");
			// mostrem matriu
			for (int i = 0; i < matriu.length; i++) {
				for (int j = 0; j < matriu[i].length; j++) {
					if (j == matriu[i].length - 1) {
						System.out.print(matriu[i][j]);
					} else {
						System.out.print(matriu[i][j] + " ");
					}
				}
				System.out.println();
			}
			System.out.println("-" + "=".repeat(midaMatriu * 2) + "-");

		} while (!filaCompletaIgual);

		finalProva = System.currentTimeMillis();
		segonsProva = (finalProva - iniciProva);
		System.out.println("Temps transcorregut: " + segonsProva + "ms");
		System.out.println("Mida de la matriu: " + midaMatriu + ", intents: " + intents);
		// mostrem matriu
		for (int i = 0; i < matriu.length; i++) {
			for (int j = 0; j < matriu[i].length; j++) {
				if (i == filaIgual) { // mostrem diferent la fila igual
					if (j == matriu[i].length - 1) {
						System.out.print(matriu[i][j]);
					} else {
						System.out.print(matriu[i][j] + "-");
					}
				} else {
					if (j == matriu[i].length - 1) {
						System.out.print(matriu[i][j]);
					} else {
						System.out.print(matriu[i][j] + " ");
					}
				}
			}
			System.out.println();
		}
		// tanquem scanner
		entrada.close();
	}

}
