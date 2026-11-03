package tema03.matrius.exemples;

import java.util.Random;

public class ExempleMatriu {

	private static final int N = 5;
	private static final int M = 6;
	private static final int MIN = 0;
	private static final int MAX = 1000;

	private static final int SECRET = 20;

	public static void main(String[] args) {
		// definim la matriu
		int[][] matriu = new int[N][M];
		Random aleatori = new Random();
		boolean trobat = false;
		int intents = 1;

		do {
			// inicialitzem matriu
			for (int i = 0; i < matriu.length; i++) { // recórrer files
				for (int j = 0; j < matriu[i].length; j++) { // recórrer columnes
					matriu[i][j] = aleatori.nextInt(MIN, MAX + 1);
				}
			}

			// busquem
			for (int i = 0; i < matriu.length; i++) { // recórrer files
				for (int j = 0; j < matriu[i].length; j++) { // recórrer columnes

					if (matriu[i][j] == SECRET) {
						trobat = true;
					}
				}
			}

			// mostrem la matriu

			for (int i = 0; i < matriu.length; i++) { // recórrer files
				for (int j = 0; j < matriu[i].length; j++) { // recórrer columnes
					System.out.print(matriu[i][j] + "\t");
				}
				System.out.println();
			}

			// trobat no trobat
			if (trobat) {
				System.out.println("Intent: " + intents);
				System.out.println("El número " + SECRET + " està en la matriu");
			} else {
				System.out.println("Intent: " + intents);
				System.out.println("El número " + SECRET + " no està en la matriu");
			}
			intents++;
			
			//espera't 1 segon
			try {
				Thread.sleep(1000);
			}catch(Exception e) {
				System.out.println(e);
			}

		} while (!trobat);

	}

}
