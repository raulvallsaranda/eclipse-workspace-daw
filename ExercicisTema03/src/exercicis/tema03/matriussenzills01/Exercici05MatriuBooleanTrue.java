package exercicis.tema03.matriussenzills01;

import java.util.Random;

public class Exercici05MatriuBooleanTrue {

	private static final int N = 3;
	private static final long TEMPS = 200;

	public static void main(String[] args) {

		// declarem matriu, array i variable
		boolean[][] matriu1 = new boolean[N][N];
		boolean[][] matriu2 = new boolean[N][N];
		boolean[][] matriu3 = new boolean[N][N];
		Random aleatori = new Random();
		int comptaTrue = 0;
		int comptaFalse = 0;
		int intents = 0;
		long tempsInici = 0L;
		long tempsFinal = 0L;
		tempsInici = System.currentTimeMillis();
		do {
			// generem la matriu1
			for (int i = 0; i < matriu1.length; i++) {
				for (int j = 0; j < matriu1[i].length; j++) {
					matriu1[i][j] = aleatori.nextBoolean();
				}
			}

			// generem la matriu2
			for (int i = 0; i < matriu2.length; i++) {
				for (int j = 0; j < matriu2[i].length; j++) {
					matriu2[i][j] = aleatori.nextBoolean();
				}
			}
			// generem la matriu3
			for (int i = 0; i < matriu3.length; i++) {
				for (int j = 0; j < matriu3[i].length; j++) {
					matriu3[i][j] = matriu1[i][j] && matriu2[i][j];
				}
			}

			System.out.println("Matriu 1:\t\t\tMatriu 2:\t\t\tMatriu 3:");
			// mostrem les matrius:
			for (int i = 0; i < matriu1.length; i++) {
				for (int j = 0; j < matriu1[i].length; j++) {
					System.out.print(matriu1[i][j] + "\t");
				}
				System.out.print("\t");
				for (int j = 0; j < matriu2[i].length; j++) {
					System.out.print(matriu2[i][j] + "\t");
				}
				System.out.print("\t");
				for (int j = 0; j < matriu3[i].length; j++) {
					System.out.print(matriu3[i][j] + "\t");
				}
				System.out.println();
			}

			// recompte true / false
			comptaTrue = 0;
			comptaFalse = 0;
			for (int i = 0; i < matriu3.length; i++) {
				for (int j = 0; j < matriu3[i].length; j++) {
					if (matriu3[i][j]) {
						comptaTrue++;
					} else {
						comptaFalse++;
					}
				}
			}

			// resultat del recompte:
			System.out.println();
			intents++;
			System.out.println("Quantitat de valors true: " + comptaTrue);
			System.out.println("Quantitat de valors false: " + comptaFalse);
			System.out.println("Intent: " + intents);
			//deixem passar un temps entre intent i intent
			/*try {
				Thread.sleep(TEMPS);
			} catch (Exception e) {
				System.out.println(e);
			}*/
		} while (comptaTrue != 9);
		
		tempsFinal = System.currentTimeMillis();
		System.out.println("Temps d'execució: "+(tempsFinal-tempsInici)+"ms");
	}

}
