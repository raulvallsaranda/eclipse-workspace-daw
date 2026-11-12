package exercicis.tema03.matriussenzills01;

import java.util.Random;
import java.util.Scanner;

public class ClasseExercici06 {

	// constants
	private static final int MIDA_MIN = 20;
	private static final int MIDA_MAX = 30;
	private static final int VALOR_MIN = 0;
	private static final int VALOR_MAX = 9;

	private static final long TEMPS = 1000;

	public static void main(String[] args) {

		// variables
		Scanner entrada = new Scanner(System.in);
		int n = 0;
		int midaMatriu = 2;
		Random aleatori = new Random();
		boolean entradaValida = false;
		int[][] matriu;
		int quantitat = 0;
		int[] recompte = new int[10]; // per a comptar quants hi ha de cada nombre

		// demanar a l'usuari mida de la matriu màxima
		do {
			System.out.println("Escriu un enter entre " + MIDA_MIN + " i " + MIDA_MAX);
			if (entrada.hasNextInt()) {
				n = entrada.nextInt();
				entrada.nextLine();
				if ((n >= MIDA_MIN) && (n <= MIDA_MAX)) {
					// correcte
					entradaValida = true;
				} else {
					System.out.println("L'enter no està entre " + MIDA_MIN + " i " + MIDA_MAX);
				}
			} else {
				while (entrada.nextLine().isBlank()) {
				}
				System.out.println("L'entrada no és un enter");
			}

		} while (!entradaValida);

		System.out.println("La mida màxima: " + n);

		while (midaMatriu <= n) {
			// inicialitzar la matriu
			matriu = new int[midaMatriu][midaMatriu];

			System.out.println("Matriu "+midaMatriu+"x"+midaMatriu);
			// generar matriu
			for (int i = 0; i < matriu.length; i++) {
				for (int j = 0; j < matriu[i].length; j++) {
					matriu[i][j] = aleatori.nextInt(VALOR_MIN, VALOR_MAX + 1);
				}
			}

			// mostrar matriu
			for (int i = 0; i < matriu.length; i++) {
				for (int j = 0; j < matriu[i].length; j++) {
					System.out.print(matriu[i][j] + " ");
				}
				System.out.println();
			}

			// esperar 1s
			try {
				Thread.sleep(TEMPS);
			} catch (Exception e) {
				System.out.println(e);
			}
			// recompte valors
			for (int i = 0; i < matriu.length; i++) {
				for (int j = 0; j < matriu[i].length; j++) {
					switch (matriu[i][j]) {
					case 0:
						recompte[0]++;
						break;
					case 1:
						recompte[1]++;
						break;
					case 2:
						recompte[2]++;
						break;
					case 3:
						recompte[3]++;
						break;
					case 4:
						recompte[4]++;
						break;
					case 5:
						recompte[5]++;
						break;
					case 6:
						recompte[6]++;
						break;
					case 7:
						recompte[7]++;
						break;
					case 8:
						recompte[8]++;
						break;
					case 9:
						recompte[9]++;
						break;
					}
				}
			}



			//System.out.println("\nQuantitat total: " + quantitat);
			//incrementem la mida de la matriu
			midaMatriu++;
		}
		
		// mostrar array recompte
		for (int i = 0; i < recompte.length; i++) {
			System.out.print(i + ": " + recompte[i] + " ");
			quantitat += recompte[i];
		}

	}

}
