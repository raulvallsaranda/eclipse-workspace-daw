package exercicis.tema03.matriussenzills01;

public class Exercici02MatriuAsteriscs {

	private static final int N = 5;
	private static final int M = 7;
	private static final int MINIM = 1;
	private static final int MAXIM = 7;

	public static void main(String[] args) {

		// declarem matriu, array i variable
		int[][] matriu = new int[N][M];

		// generem la matriu
		for (int i = 0; i < matriu.length; i++) {
			if (i % 2 == 0) {// parelles
				for (int j = 0; j < matriu[i].length; j++) {
					matriu[i][j] = j + 1;
				}
			} else {// imparelles
				for (int j = 0; j < matriu[i].length; j++) {
					matriu[i][j] = matriu[i].length - j;
				}
			}
		}

		// mostrem matriu original
		System.out.println("Matriu:");
		for (int i = 0; i < matriu.length; i++) {
			for (int j = 0; j < matriu[i].length; j++) {
				System.out.print(matriu[i][j] + "\t");
			}
			System.out.println();
		}

		// mostrem matriu amb asteriscs
		System.out.println("Matriu amb asteriscs:");
		for (int i = 0; i < matriu.length; i++) {
			for (int j = 0; j < matriu[i].length; j++) {
				for (int k = 0; k < matriu[i][j]; k++) {
					System.out.print("*");
				}
				System.out.print("\t");
			}
			System.out.println();
		}

	}

}
