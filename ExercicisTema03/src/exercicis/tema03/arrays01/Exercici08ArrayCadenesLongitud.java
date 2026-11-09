package exercicis.tema03.arrays01;

import java.util.Scanner;

public class Exercici08ArrayCadenesLongitud {

	private static final int LONG_MIN = 0;
	private static final int LONG_MAX = 10;

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		int longitud = 0;
		int comptador = 0;
		String aux = "";
		boolean longitudValida = false;
		boolean cadenaValida = false;
		String cadena = "";
		String[] cadenes;

		// demanem longitud a l'usuari
		do {
			System.out.println("Introdueix la longitud de l'array (" + (LONG_MIN + 1) + " - " + (LONG_MAX - 1) + ")");
			if (entrada.hasNextInt()) {
				longitud = entrada.nextInt();
				entrada.nextLine();
				if ((longitud > LONG_MIN) && (longitud < LONG_MAX)) {
					longitudValida = true;
				} else {
					System.out.println("Error: ha de ser >" + LONG_MIN + " i <" + LONG_MAX);
				}
			} else {
				while (entrada.nextLine().isBlank()) {
				}
				System.out.println("Error: l'entrada no és un enter");
			}

		} while (!longitudValida);

		// ja podem declarar l'array
		cadenes = new String[longitud];

		// demanem les cadenes a l'usuari
		while (comptador < cadenes.length) {
			cadenaValida = false;
			do {
				System.out.println("Escriu una cadena, no buida");
				cadena = entrada.nextLine().trim();
				if (cadena.isBlank()) {
					System.out.println("Error: la cadena no pot estar buida");
				} else {
					cadenes[comptador] = cadena;
					System.out.println("Cadena llegida ("+(comptador+1)+"/"+longitud+"): "+cadena);
					comptador++;
					cadenaValida = true;
				}

			} while (!cadenaValida);

		}

		if(longitud>1) {
			System.out.println("Ja s'han llegit les "+longitud+" cadenes");

		} else {
			System.out.println("Ja s'ha llegit la cadena.\n");

		}
		// mostrem l'array inicial
		System.out.println("Array inicial:");
		for (int i = 0; i < cadenes.length; i++) {
			System.out.println(cadenes[i]);
		}

		// ordenem amb el mètode de la bombolla
		for(int i=0;i<cadenes.length-1;i++) {
			for(int j=0;j<cadenes.length-1-i;j++) {
				if(cadenes[j].length()<cadenes[j+1].length()) {
					aux=cadenes[j];
					cadenes[j]=cadenes[j+1];
					cadenes[j+1]=aux;
				}
			}
		}
		
		
		
		// mostrem ordenat
		System.out.println("\nArray ordenat per longitud de la cadena:");
		for (int i = 0; i < cadenes.length; i++) {
			System.out.println(cadenes[i]);
		}

	}

}
