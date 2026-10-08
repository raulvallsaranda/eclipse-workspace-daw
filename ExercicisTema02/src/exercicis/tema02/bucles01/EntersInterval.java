package exercicis.tema02.bucles01;

import java.util.Scanner;

public class EntersInterval {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int n1 = 0, n2 = 0;
		// demanem primer número i ens assegurem que és un enter
		boolean entradaValida = false;
		// Demanem a l'usuari
		while (!entradaValida) {
			System.out.println("Introdueix el primer número enter n1 ");
			if (entrada.hasNextInt()) {
				// si l'enter és vàlid, l'obtenim
				n1 = entrada.nextInt();
				// en tot cas, buidem el buffer
				entrada.nextLine();
				//actualitzem el valor del semàfor
				entradaValida=true;
				// Mostrem el valor
				System.out.println("El primer valor enter: " + n1);

			} else {
				// per controlar valors Intro consecutius no desitjats
				while (entrada.nextLine().equals("")) {
				}
				System.out.println("No has introduït un valor enter");
			}

		}

		// resetegem el semàfor
		entradaValida = false;

		// Demanem a l'usuari el segon número enter
		while (!entradaValida) {
			System.out.println("Introdueix el segon número enter n2, ha de ser > " + n1);
			if (entrada.hasNextInt()) {
				// si l'enter és vàlid, l'obtenim
				n2 = entrada.nextInt();
				// en tot cas, buidem el buffer
				entrada.nextLine();
				// valor vàlid, ha de ser >0
				if (n2 > n1) {
					// canviem el valor del semàfor per poder eixir del bucle
					entradaValida = true;
				} else {
					System.out.println("El valor enter ha de ser major que " + n1);
				}
			} else {
				// per controlar valors Intro consecutius no desitjats
				while (entrada.nextLine().equals("")) {
				}
				System.out.println("No has introduït un valor enter");
			}

		}
		// una vegada tenim els dos valors, mostrem el resultat per l'eixida
		System.out.println("Els nombres enters entre " + n1 + " i " + n2 + ":");
		// des del primer enter fins a l'últim del rang
		for (int i = n1; i <= n2; i++) {
			// distingim 3 casos:
			if (i == n1) { // al principi del rang [
				System.out.print("[" + i + ", ");
			} else if (i == n2) { // al final del rang ]
				System.out.println(i + "]");
			} else { // enmig del rang
				System.out.print(i + ", ");
			}
		}
		//tanquem l'Scanner
		entrada.close();

	}

}
