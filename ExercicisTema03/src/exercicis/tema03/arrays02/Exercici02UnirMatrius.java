package exercicis.tema03.arrays02;

import java.util.Random;
import java.util.Scanner;

public class Exercici02UnirMatrius {

	private static final int LIMIT_MATRIU_INFERIOR = 2;
	private static final int LIMIT_MATRIU_SUPERIOR = 10;
	private static final int VALOR_MINIM = 10;
	private static final int VALOR_MAXIM = 99;

	public static void main(String[] args) {

		// declaració de variables
		Scanner entrada = new Scanner(System.in);
		Random aleatori = new Random();
		int midaMatriu = 0;
		boolean entradaValida = false;
		// declarem matrius
		int[][] matriuA;
		int[][] matriuB;
		int[][] matriuC;
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

		// creem les matrius (només indiquem la quantitat de files)
		matriuA = new int[midaMatriu][];
		matriuB = new int[midaMatriu][];
		// generem primera matriu
		for (int i = 1; i <= midaMatriu; i++) {
			// creem una nova fila de la longitud que indica i
			matriuA[i - 1] = new int[i];
			for (int j = 0; j < i; j++) {
				matriuA[i - 1][j] = aleatori.nextInt(VALOR_MINIM, VALOR_MAXIM + 1);
			}
		}
		// generem segona matriu
		for (int i = 1; i <= midaMatriu; i++) {
			// creem una nova fila de la longitud que indica i
			matriuB[i - 1] = new int[midaMatriu - i + 1];
			for (int j = 0; j < midaMatriu + 1 - i; j++) {
				matriuB[i - 1][j] = aleatori.nextInt(VALOR_MINIM, VALOR_MAXIM + 1);
			}
		}

		// mostrem les matrius:
		System.out.println("Matriu A:");
		System.out.println("---------");
		for (int i = 0; i < matriuA.length; i++) {
			for (int j = 0; j < matriuA[i].length; j++) {
				System.out.print(matriuA[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println("\nMatriu B:");
		System.out.println("---------");
		for (int i = 0; i < matriuB.length; i++) {
			for (int j = 0; j < matriuB[i].length; j++) {
				System.out.print(matriuB[i][j] + " ");
			}
			System.out.println();
		}

		// generem matriu conjunta
		matriuC = new int[midaMatriu][midaMatriu + 1];
		for (int i = 1; i <= matriuC.length; i++) { 
			for (int j = 0; j < matriuC[i - 1].length; j++) { // ara hi ha una columna més
				if (j < i) {
					//System.out.print("a");
					matriuC[i - 1][j] = matriuA[i - 1][j];
					//System.out.print(matriuC[i - 1][j] + " ");
				} else {
					//System.out.print("b");
					matriuC[i - 1][j] = matriuB[i - 1][j - i];
					//System.out.print(matriuC[i - 1][j] + " ");
				}
			}
			//System.out.println();
		}
		// mostrem matriu conjunta
		System.out.println("\nMatriu C:");
		System.out.println("---------");
		for (int i = 0; i < matriuC.length; i++) {
			for (int j = 0; j < matriuC[i].length; j++) {
				System.out.print(matriuC[i][j] + " ");
			}
			System.out.println();
		}
		
		//tanquem scanner
		entrada.close();

	}

}
