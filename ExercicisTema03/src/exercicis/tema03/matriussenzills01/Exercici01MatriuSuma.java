package exercicis.tema03.matriussenzills01;

import java.util.Random;

public class Exercici01MatriuSuma {

	private static final int N = 10;
	private static final int MINIM = 0;
	private static final int MAXIM = 100;

	public static void main(String[] args) {

		// declarem matriu, array i variable
		int[][] matriu = new int[N][N];
		int[] arraySuma = new int[N];
		int sumaTotal = 0;
		Random aleatori = new Random();

		// inicialitzem matriu a valors aleatoris
		for (int i = 0; i < matriu.length; i++) {
			for (int j = 0; j < matriu[i].length; j++) {
				matriu[i][j] = aleatori.nextInt(MINIM, MAXIM + 1);
			}
		}

		// sumem columnes
		for (int i = 0; i < matriu.length; i++) {
			for (int j = 0; j < matriu[i].length; j++) {
				arraySuma[i] += matriu[i][j];
			}
		}

		// sumem array
		for (int i = 0; i < matriu.length; i++) {
			for (int j = 0; j < matriu[i].length; j++) {
				sumaTotal += matriu[i][j];
			}
		}

		// mostrem la matriu
		System.out.println("Matriu:");
		for (int i = 0; i < matriu.length; i++) {
			for (int j = 0; j < matriu[i].length; j++) {
				System.out.print(matriu[i][j] + "\t");
			}
			System.out.println();
		}

		// mostrem l'array
		System.out.println("\nArray Suma de columnes:");
		for (int i = 0; i < arraySuma.length; i++) {
			System.out.print(arraySuma[i] + "\t");
		}
		
		// mostrem la variable:
		System.out.println("\n\nSuma total: "+sumaTotal);

	}

}
