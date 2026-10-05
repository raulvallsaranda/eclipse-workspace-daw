package exercicis.tema02.part03;

import java.util.Scanner;

public class Exercici06CompteEnrere {

	public static void main(String[] args) {

		// declaració de variables
		int nombreUsuari = 0;

		Scanner entrada = new Scanner(System.in);

		// demanem nombre a l'usuari
		System.out.println("Introdueix un nombre entre 1 i 20:");
		if (entrada.hasNextInt()) {
			// obtenim el valor
			nombreUsuari = entrada.nextInt();
			entrada.nextLine();
			// comprovem si està dins del rang demanat
			if ((nombreUsuari >= 0) && (nombreUsuari <= 20)) {
				System.out.println("Compte enrere des de "+nombreUsuari);
				// fem el compte enrere utilitzant switch:
				try {
					switch (nombreUsuari) {
					case 20:
						System.out.println(20);
						Thread.sleep(500);
					case 19:
						System.out.println(19);
						Thread.sleep(500);
					case 18:
						System.out.println(18);
						Thread.sleep(500);
					case 17:
						System.out.println(17);
						Thread.sleep(500);
					case 16:
						System.out.println(16);
						Thread.sleep(500);
					case 15:
						System.out.println(15);
						Thread.sleep(500);
					case 14:
						System.out.println(14);
						Thread.sleep(500);
					case 13:
						System.out.println(13);
						Thread.sleep(500);
					case 12:
						System.out.println(12);
						Thread.sleep(500);
					case 11:
						System.out.println(11);
						Thread.sleep(500);
					case 10:
						System.out.println(10);
						Thread.sleep(500);
					case 9:
						System.out.println(9);
						Thread.sleep(500);
					case 8:
						System.out.println(8);
						Thread.sleep(500);
					case 7:
						System.out.println(7);
						Thread.sleep(500);
					case 6:
						System.out.println(6);
						Thread.sleep(500);
					case 5:
						System.out.println(5);
						Thread.sleep(500);
					case 4:
						System.out.println(4);
						Thread.sleep(500);
					case 3:
						System.out.println(3);
						Thread.sleep(500);
					case 2:
						System.out.println(2);
						Thread.sleep(500);
					case 1:
						System.out.println(1);
						Thread.sleep(500);
					case 0:
						System.out.println(0);
						Thread.sleep(500);
					default:
						System.out.println("Compte enrere acabat");
					}
				} catch (Exception e) {
					System.out.println(e);
				}

			} else {
				System.out.println(
						"Error: el valor introduït està fora del rang (1-20)");
			}

		} else {
			System.out.println("Error: el valor introduït no és un enter.");
		}

	}

}
