package exercicis.tema03.matriussenzills01;

import java.util.Random;

public class Exercici03MatriuLletres {

	private static final int N = 7;
	private static final String LLETRES = "ABCÇDEFGHIJKLMNOPQRSTUVWXYZ";

	public static void main(String[] args) {

		// declarem matriu, array i variable
		String[][] matriu = new String[N][N];
		String lletra = "";
		Random aleatori = new Random();
		
		//inicialitzem la matriu a ""
		for (int i = 0; i < matriu.length; i++) {
			for (int j = 0; j < matriu[i].length; j++) {
				matriu[i][j]="";
			}
		}

		// generem la matriu
		for (int i = 0; i < matriu.length; i++) {
			for (int j = 0; j < matriu[i].length; j++) {
				lletra = "" + LLETRES.charAt(aleatori.nextInt(LLETRES.length()));
				for (int k = 0; k <= j; k++) {
					matriu[i][j] += lletra;
				}
			}
		}

		// mostrem matriu
		System.out.println("Matriu:");
		for (int i = 0; i < matriu.length; i++) {
			for (int j = 0; j < matriu[i].length; j++) {
				System.out.print(matriu[i][j] + "\t");
			}
			System.out.println();
		}

	}

}
