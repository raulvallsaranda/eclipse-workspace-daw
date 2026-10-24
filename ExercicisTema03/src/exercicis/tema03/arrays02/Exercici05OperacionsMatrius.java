package exercicis.tema03.arrays02;

import java.util.Random;
import java.util.Scanner;

public class Exercici05OperacionsMatrius {
	private static final int LIMIT_MATRIU_INFERIOR = 2;
	private static final int LIMIT_MATRIU_SUPERIOR = 10;
	private static final int VALOR_MINIM = 1;
	private static final int VALOR_MAXIM = 9;
	private static final String MENU = "Operacions amb matrius:\r\n" + "-----------------------\r\n" + "a) Suma\r\n"
			+ "b) Resta\r\n" + "c) Multiplicació\r\n" + "d) Fusió\r\n" + "-----------------------\r";

	public static void main(String[] args) {
		// declaració de variables
		Scanner entrada = new Scanner(System.in);
		Random aleatori = new Random();
		int midaMatriu = 0;
		String opcio = "";
		boolean entradaValida = false;
		boolean opcioValida = false;
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

		// creem les matrius
		matriuA = new int[midaMatriu][midaMatriu];
		matriuB = new int[midaMatriu][midaMatriu];
		matriuC = new int[midaMatriu][midaMatriu];

		// generem matrius A i B

		// generem matrius A i B
		for (int i = 0; i < matriuA.length; i++) {
			for (int j = 0; j < matriuA[i].length; j++) {
				matriuA[i][j] = aleatori.nextInt(VALOR_MINIM, VALOR_MAXIM + 1);
				matriuB[i][j] = aleatori.nextInt(VALOR_MINIM, VALOR_MAXIM + 1);
			}
		}

		// mostrem el menú
		System.out.println(MENU);
		// esperem el valor de l'opció vàlida
		do {
			System.out.println("Tria una opció:");
			opcio = entrada.nextLine().trim().toLowerCase();
			switch (opcio) {
			case "a", "b", "c", "d":
				opcioValida = true;
				break;
			default:
				System.out.println("Error: opció no vàlida");
			}
		} while (!opcioValida);

		// operem en funció de l'opció
		switch (opcio) {
		case "a":// sumar
			for (int i = 0; i < matriuA.length; i++) {
				for (int j = 0; j < matriuA[i].length; j++) {
					matriuC[i][j] = matriuA[i][j] + matriuB[i][j];
				}
			}
			break;
		case "b": // restar
			for (int i = 0; i < matriuA.length; i++) {
				for (int j = 0; j < matriuA[i].length; j++) {
					matriuC[i][j] = matriuA[i][j] - matriuB[i][j];
				}
			}
			break;
		case "c": // multiplicar
			for (int i = 0; i < matriuA.length; i++) {
				for (int j = 0; j < matriuA[i].length; j++) {
					int suma = 0;
					for (int k = 0; k < matriuA[i].length; k++) {
						suma += matriuA[i][k] * matriuB[k][j];
					}
					matriuC[i][j] = suma;
				}
			}
			break;
		case "d": // fusionar
			for (int i = 0; i < matriuA.length; i++) {
				for (int j = 0; j < matriuA[i].length; j++) {
					matriuC[i][j] = matriuA[i][j]*10 + matriuB[i][j];
				}
			}
			break;
		}

	
		System.out.println("\nOperació:");
		System.out.println("---------");

		for (int i = 0; i < matriuC.length; i++) {
			// matriuA
			for (int j = 0; j < matriuA[i].length; j++) {
				if(j==matriuA[i].length-1) {
					System.out.print(matriuA[i][j]);
				} else {
					System.out.print(matriuA[i][j] + " ");
				}
			}
			// espais
			if (i == matriuA.length - 1) {
				switch (opcio) {
				case "a":
					System.out.print("\t+\t");
					break;
				case "b":
					System.out.print("\t-\t");
					break;
				case "c":
					System.out.print("\t*\t");
					break;
				case "d":
					System.out.print("\tF\t");
					break;
				}
			} else {
				System.out.print("\t \t");
			}
			// matriuB
			for (int j = 0; j < matriuB[i].length; j++) {
				if(j==matriuB[i].length-1) {
					System.out.print(matriuB[i][j]);
				} else {
					System.out.print(matriuB[i][j] + " ");
				}
			}
			// espais
			if (i == matriuA.length - 1) {
				System.out.print("\t=\t");
			} else {
				System.out.print("\t \t");
			}
			// matriuC
			for (int j = 0; j < matriuC[i].length; j++) {
				if(j==matriuC[i].length-1) {
					System.out.print(matriuC[i][j]);
				} else {
					System.out.print(matriuC[i][j] + "\t");
				}
				
			}
			System.out.println();
		}

	}

}
