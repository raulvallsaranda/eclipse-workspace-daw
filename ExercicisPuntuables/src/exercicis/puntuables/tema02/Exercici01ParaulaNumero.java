package exercicis.puntuables.tema02;

import java.util.Scanner;

public class Exercici01ParaulaNumero {

	private static final int LIMIT_INFERIOR = 1;
	private static final int LIMIT_SUPERIOR = 7;
	private static final int LONGITUD_MINIMA = 1;
	private static final int LONGITUD_MAXIMA = 10;

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		int numeroUsuari = 0;
		String cadenaUsuari = "";
		int sumaCaracters = 0;
		boolean numeroValid = false;
		boolean cadenaValida = false;

		// demanem un enter entre 1 i 5
		do {
			System.out.println("Escriu un enter entre " + LIMIT_INFERIOR + " i " + LIMIT_SUPERIOR);
			if (entrada.hasNextInt()) {
				numeroUsuari = entrada.nextInt();
				entrada.nextLine();
				if ((numeroUsuari >= LIMIT_INFERIOR) && (numeroUsuari <= LIMIT_SUPERIOR)) {
					// valor correcte
					numeroValid = true;
				} else {
					System.out.println("El valor no està entre " + LIMIT_INFERIOR + " i " + LIMIT_SUPERIOR);
				}
			} else {
				while (entrada.nextLine().equals("")) {
				}
				System.out.println("Error: valor incorrecte");
			}

		} while (!numeroValid);

		// demanem una cadena de longitud inferior a 5
		do {
			System.out.println("Escriu una cadena de longitud entre " + LONGITUD_MINIMA + " i " + LONGITUD_MAXIMA);
			cadenaUsuari = entrada.nextLine().trim();
			if (cadenaUsuari.isBlank()) {
				System.out.println("La cadena no pot estar buida");
			} else if ((cadenaUsuari.length() >= LONGITUD_MINIMA) && (cadenaUsuari.length() <= LONGITUD_MAXIMA)) {
				// valor correcte
				cadenaValida = true;
			} else {
				System.out.println("La longitud no està entre " + LONGITUD_MINIMA + " i " + LONGITUD_MAXIMA);
			}

		} while (!cadenaValida);
		
		//operem
		for(int i=0;i<numeroUsuari;i++) {
			for(int j=0;j<=i;j++) {
				if(i%2==0) {
					if(j==i) {
						System.out.print(cadenaUsuari.toUpperCase());
						sumaCaracters+=cadenaUsuari.length();
					} else {
						System.out.print(cadenaUsuari.toUpperCase()+"-");
						sumaCaracters+=cadenaUsuari.length()+1;
					}
					
				} else {
					if(j==i) {
						System.out.print(cadenaUsuari.toLowerCase());
						sumaCaracters+=cadenaUsuari.length();
					} else {
						System.out.print(cadenaUsuari.toLowerCase()+"+");
						sumaCaracters+=cadenaUsuari.length()+1;
					}
				}
			}
			System.out.println();
		}
		System.out.println("Total de caràcters escrits: "+sumaCaracters);
		// tanquem scanner
		entrada.close();
	}

}
