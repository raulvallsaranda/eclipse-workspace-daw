package exercicis.tema02.bucles02;

import java.util.Scanner;

public class Exercici01QuadratCaracters {

	private static final int LIMIT_INFERIOR = 3;
	private static final int LIMIT_SUPERIOR = 20;

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		boolean entradaValida = false;
		int n = 0;

		// demanem el valor a l'usuari mentre no siga vàlid
		do {
			System.out.println("Introdueix un enter entre " + LIMIT_INFERIOR + " i " + LIMIT_SUPERIOR + ":");
			if (entrada.hasNextInt()) {
				n = entrada.nextInt();
				entrada.nextLine();
				if ((n >= LIMIT_INFERIOR) && (n <= LIMIT_SUPERIOR)) {
					entradaValida = true;
				} else {
					System.out.println(
							"Error: el valor enter no està entre " + LIMIT_INFERIOR + " i " + LIMIT_SUPERIOR + ".");
				}
			} else {
				while (entrada.nextLine().equals("")) {
				}
				System.out.println("Error: l'entrada no és un enter");
			}
		} while (!entradaValida);

		// mostrem el quadrat per pantalla.
		if (n >= 3 && n < 12) {
			//contorn exterior diferent de l'interior
			for (int i = 0; i < n; i++) {
				for (int j = 0; j < n; j++) {
					if (i == 0 || i == n - 1) {
						System.out.print("\uD83D\uDC80");
					} else if (j == 0 || j == n - 1) {
						System.out.print("\uD83D\uDC80");
					} else {
						System.out.print("\uD83D\uDC9A");
					}
				}
				System.out.println();
			}
		} else {
			// alternem quadrats
			for (int i = 0; i < n; i++) {
				for (int j = 0; j < n; j++) {
					if (i < (n / 2)) {
						if ((j < i)) {
							if (j % 2 == 0) {
								System.out.print("\uD83D\uDE04");
							} else {
								System.out.print("\uD83D\uDE14");
							}
						} else if ((j > (n - i - 1))) {
							if (j % 2 == 0) {
								System.out.print("\uD83D\uDE14");
							} else {
								System.out.print("\uD83D\uDE04");
							}
						} else {
							if (i % 2 == 0) {
								System.out.print("\uD83D\uDE04");
							} else {
								System.out.print("\uD83D\uDE14");
							}
						}

					} else {
						if ((j < (n - i))) {
							if (j % 2 == 0) {
								System.out.print("\uD83D\uDE04");
							} else {
								System.out.print("\uD83D\uDE14");
							}
						} else if ((j > i)) {
							if (j % 2 == 0) {
								System.out.print("\uD83D\uDE14");
							} else {
								System.out.print("\uD83D\uDE04");
							}
						} else {
							if (i % 2 == 0) {
								System.out.print("\uD83D\uDE14");
							} else {
								System.out.print("\uD83D\uDE04");
							}
						}

					}
				}
				System.out.println();
			}

		}
		//tanquem Scanner
		entrada.close();

	}

}
