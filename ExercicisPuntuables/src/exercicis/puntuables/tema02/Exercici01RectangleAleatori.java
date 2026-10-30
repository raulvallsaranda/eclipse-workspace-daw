package exercicis.puntuables.tema02;

import java.util.Random;
import java.util.Scanner;

public class Exercici01RectangleAleatori {

	private static final int VALOR_MINIM = 2;
	private static final int VALOR_MAXIM = 10;
	private static final String PARAULA = "ALZINA";
	private static final String CARACTER = "Z";

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		Random aleatori = new Random();
		String caracter = "";
		String separador = "";
		int base = 0;
		int altura = 0;
		int sumaLletra = 0;
		boolean baseValida = false;
		boolean alturaValida = false;

		// demanem un enter entre 2 i 10 (base)
		do {
			System.out.println("Escriu la base del rectangle, un enter entre " + VALOR_MINIM + " i " + VALOR_MAXIM);
			if (entrada.hasNextInt()) {
				base = entrada.nextInt();
				entrada.nextLine();
				if ((base >= VALOR_MINIM) && (base <= VALOR_MAXIM)) {
					// valor correcte
					baseValida = true;
				} else {
					System.out.println("El valor no està entre " + VALOR_MINIM + " i " + VALOR_MAXIM);
				}
			} else {
				while (entrada.nextLine().equals("")) {
				}
				System.out.println("Error: valor incorrecte");
			}
		} while (!baseValida);

		// demanem un altre enter entre 2 i 10 (altura)
		do {
			System.out.println("Escriu l'altura del rectangle, un enter entre " + VALOR_MINIM + " i " + VALOR_MAXIM);
			if (entrada.hasNextInt()) {
				altura = entrada.nextInt();
				entrada.nextLine();
				if (altura == base) {
					System.out.println(
							"El valor de l'altura no pot ser igual a la base :" + VALOR_MINIM + " i " + VALOR_MAXIM);
				} else if ((altura >= VALOR_MINIM) && (altura <= VALOR_MAXIM)) {
					// valor correcte
					alturaValida = true;
				} else {
					System.out.println("El valor no està entre " + VALOR_MINIM + " i " + VALOR_MAXIM);
				}
			} else {
				while (entrada.nextLine().equals("")) {
				}
				System.out.println("Error: valor incorrecte");
			}
		} while (!alturaValida);

		// operem
		System.out.println("------------------------------");
		System.out.println("Rectangle : " + base + " x " + altura);
		// mostrem els números de les columnes:
		for (int i = 0; i < base; i++) {
			if (i == 0) {
				System.out.print("  " + (i + 1) + " ");
			} else if (i == base - 1) {
				System.out.println(i + 1);
			} else {
				System.out.print((i + 1) + " ");
			}
		}
		for (int i = 0; i < altura; i++) {
			for (int j = 0; j < base; j++) {
				caracter = "" + PARAULA.charAt(aleatori.nextInt(PARAULA.length()));
				//separador en funció de si és fila parella o imparella
				if(i%2==0) separador = "_";
				else separador = "-";
				
				if (j == 0) {
					
					if (j % 2 == 0) {
						System.out.print((i + 1) + " " + caracter + separador);
					} else {
						System.out.print((i + 1) + " " + caracter.toLowerCase() + separador);
					}

				} else if (j == base - 1) {
					if (j % 2 == 0) {
						System.out.println(caracter);
					} else {
						System.out.println(caracter.toLowerCase());
					}
				} else {
					if (j % 2 == 0) {
						System.out.print(caracter + separador);
					} else {
						System.out.print(caracter.toLowerCase() + separador);
					}
				}
				if (caracter.equals(CARACTER))	sumaLletra++;
			}
		}
		System.out.println("Total de caràcters '" + CARACTER + "' escrits: " + sumaLletra);
		// tanquem scanner
		entrada.close();
	}

}
