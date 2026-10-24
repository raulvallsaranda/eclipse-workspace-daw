package exercicis.tema03.arrays01;

import java.util.Random;

public class MatriuParellsImparells09 {

	public static final int LONGITUD = 10;
	public static final int LIMIT_INFERIOR = 1;
	public static final int LIMIT_SUPERIOR = 20;

	public static void main(String[] args) {
		// definim matriu
		int[][] matriu = new int[LONGITUD][LONGITUD];
		Random aleatori = new Random();
		int[] arrayAuxiliar; // per a ficar els valors parells o imparells.
		int comptador = 0; // per comptar els valors

		// emplenem la matriu de valors aleatoris
		for (int i = 0; i < matriu.length; i++) {
			for (int j = 0; j < matriu[i].length; j++) {
				matriu[i][j] = aleatori.nextInt(LIMIT_INFERIOR, LIMIT_SUPERIOR + 1);
			}
		}

		// mostrem per pantalla
		System.out.println("Matriu Inicial:");
		System.out.println("---------------");
		for (int i = 0; i < matriu.length; i++) {
			for (int j = 0; j < matriu[i].length; j++) {
				System.out.print(matriu[i][j] + "\t");
			}
			System.out.println();
		}

		// Per a cada fila, hem de fer un recompte de valors parells o imparells
		// creear un array d'aquesta longitud només amb els valors corresponents
		// assignar a la fila el nou array.
		for (int i = 0; i < matriu.length; i++) {
			comptador = 0;
			for (int j = 0; j < matriu[i].length; j++) {
				// files parelles, comptem els parells només
				if (i % 2 == 0) {
					if (matriu[i][j] % 2 == 0) {
						comptador++;
					}
				} else { // files imparelles, comptem els imparells només
					if (matriu[i][j] % 2 != 0) {
						comptador++;
					}
				}
			}
			// hem de crear un array de la longitud del comptador
			arrayAuxiliar = new int[comptador];
			// hem de recórrer la fila de nou per ficar només els valors corresponents
			int comptadorNou = 0;
			for (int k = 0; k < matriu[i].length; k++) {
				// files parelles, comptem els parells només
				if (i % 2 == 0) {
					if (matriu[i][k] % 2 == 0) {
						arrayAuxiliar[comptadorNou] = matriu[i][k];
						comptadorNou++;
					}
				} else { // files imparelles, comptem els imparells només
					if (matriu[i][k] % 2 != 0) {
						arrayAuxiliar[comptadorNou] = matriu[i][k];
						comptadorNou++;
					}
				}
			}
			// ara hem d'assignar a la fila actual, el nou array
			matriu[i] = arrayAuxiliar;
			arrayAuxiliar = null;

		}

		// mostrem per pantalla
		System.out.println("Matriu Final:");
		System.out.println("-------------");
		for (int i = 0; i < matriu.length; i++) {
			for (int j = 0; j < matriu[i].length; j++) {
				System.out.print(matriu[i][j] + "\t");
			}
			System.out.println();
		}

	}

}
