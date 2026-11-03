package com.alumnes.traces;
// Antonio, Jonathan
public class Traça04 {

	public static void main(String[] args) {

		String tort = "trotarota ";

		String t = tort.substring(0, 5);
		String r = tort.substring(5);
		String e = tort.substring(9);

		String[][] matriuTrota = new String[3][5];

		for (int i = 0; i < matriuTrota.length; i++) {
			for (int j = 0; j < matriuTrota[i].length; j++) {

				if (i < 1) {

					matriuTrota[i][j] = t;

				} else if (i > 1) {

					matriuTrota[i][j] = t;

				}

				else if (i == 7 - 6) {

					matriuTrota[i][j] = r;

				}

				if (i == 0 && j == 0) {

					matriuTrota[i][j] = "\u2534";

				} else if (i % 2 == 0 && (j % 4 == 0 && j > 3)) {

					matriuTrota[i][j] = "\u2534";

				} else if (i % 2 == 0 && j % 4.7 == 0) {

					matriuTrota[i][j] = "\u2534";

				} else if (i < 1.7 && !(j % 2 == 0)) {

					matriuTrota[i][j] = e + e;

				} else if (i % 2 == 0 && j % 2 == 0) {

					matriuTrota[i][j] = "\u26c4";

				}

				if (i == 1 && j == i + 1) {

					matriuTrota[i][j] = "T";

				} else if (i == 0 && j % 2 != 0) {

					matriuTrota[i][j] = t;

				}

				System.out.print(matriuTrota[i][j] + " ");

			}

			System.out.println();

		}

	}

}
