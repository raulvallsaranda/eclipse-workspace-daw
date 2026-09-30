package exercicis.tema02.part03;

import java.util.Scanner;

public class Exercici02Multiple10 {

	public static void main(String[] args) {
		// constants
		final int LIMIT_INFERIOR = 0;
		final int LIMIT_SUPERIOR = 100;
		// declaració de variables
		int nombre01 = 0;
		int nombre02 = 0;
		int multiplicacio = 0;
		Scanner entrada = new Scanner(System.in);

		System.out.println("Introdueix un nombre entre 0 i 100:");
		if (entrada.hasNextInt()) {
			// valor enter
			nombre01 = entrada.nextInt();
			entrada.nextLine();
			if (nombre01 == LIMIT_INFERIOR) {
				System.out.println("Has introduït el valor " + LIMIT_INFERIOR);
			} else if ((nombre01 >= LIMIT_INFERIOR) && (nombre01 <= LIMIT_SUPERIOR)) {
				// comprovem si és múltiple de 10
				if (nombre01 % 10 == 0) {
					System.out.println("Introdueix un altre nombre entre 0 i 100:");
					if (entrada.hasNextInt()) {
						// valor enter
						nombre02 = entrada.nextInt();
						entrada.nextLine();
						if (nombre02 == LIMIT_INFERIOR) {
							System.out.println("Has introduït el valor " + LIMIT_INFERIOR);
						} else if ((nombre02 >= LIMIT_INFERIOR) && (nombre02 <= LIMIT_SUPERIOR)) {
							multiplicacio = nombre01 * nombre02;
							System.out.println("El resultat de multiplicar " + nombre01 + " per " + nombre02 + " és: "
									+ multiplicacio);

						} else {
							System.out.println("El valor " + nombre02 + " no està entre " + LIMIT_INFERIOR + " i "
									+ LIMIT_SUPERIOR);
						}
					} else {
						// valor incorrecte
						System.out.println("Error nombre02. No has introduït un enter");
					}
				} else {
					System.out.println("El valor introduït és " + nombre01);
				}

			} else {
				System.out
						.println("El valor " + nombre01 + " no està entre " + LIMIT_INFERIOR + " i " + LIMIT_SUPERIOR);
			}
		} else {
			// valor incorrecte
			System.out.println("Error nombre1. No has introduït un enter");
		}
		//tanquem scanner
		entrada.close();

	}

}
