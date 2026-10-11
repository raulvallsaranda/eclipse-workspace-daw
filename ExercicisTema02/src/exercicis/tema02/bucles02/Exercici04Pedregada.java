package exercicis.tema02.bucles02;

import java.util.Random;
import java.util.Scanner;

public class Exercici04Pedregada {

	private static final String pedra = "\uD83E\uDDCA";

	private static final int LIMIT_INFERIOR = 20;
	private static final int LIMIT_SUPERIOR = 100;
	private static final int MINIM_PEDRES = 1;
	private static final int MAXIM_PEDRES = 7;
	private static final int PROBABILITAT_BUIT = 30;

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		Random aleatori = new Random();
		boolean entradaValida = false;
		int pedres = 0;
		int pedresFila = 0;
		int maximPedresFila = MAXIM_PEDRES;

		// demanem el valor a l'usuari mentre no siga vàlid
		do {
			System.out.println("Introdueix un enter entre " + LIMIT_INFERIOR + " i " + LIMIT_SUPERIOR + ":");
			if (entrada.hasNextInt()) {
				pedres = entrada.nextInt();
				entrada.nextLine();
				if ((pedres >= LIMIT_INFERIOR) && (pedres <= LIMIT_SUPERIOR)) {
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

		while (pedres > 0) {
			// per cada fila un mínim entre 1 i 7 pedres
			// separades per un mínim d'entre 2 i 5 espais
			if (pedres < MAXIM_PEDRES) {
				maximPedresFila = pedres;
			}
			pedresFila = 0;
			do {
				pedresFila = aleatori.nextInt(MINIM_PEDRES, maximPedresFila + 1);
			} while (pedresFila == 0);
			int i = 0;

			while (i < pedresFila) {
				
				if (aleatori.nextInt(100) <= PROBABILITAT_BUIT) {
					// espai
					System.out.print(" ");
				} else {
					// pedra + espais
					System.out.print(" \uD83E\uDDCA ");
					i++;
				}
			}

			// actualitzem les pedres restants
			pedres -= pedresFila;

			// salt de línia
			System.out.println();
		}

		// tanquem Scanner
		entrada.close();

	}

}
