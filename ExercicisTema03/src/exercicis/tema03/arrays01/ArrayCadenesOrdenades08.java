package exercicis.tema03.arrays01;

import java.util.Scanner;

public class ArrayCadenesOrdenades08 {

	public static void main(String[] args) {
		// declaracions
		int comptador; // per comptar les cadenes ben llegides
		int longitudArray;
		String cadena; // per llegir les cadenes de l'entrada
		String aux; // per a l'ordenació
		String[] arrayCadenes; // array de cadenes
		Scanner entrada = new Scanner(System.in);
		
		longitudArray=0;
		do {
			System.out.println("Indica la longitud de l'array (número enter positiu):");
			while(!entrada.hasNextInt()) {
				System.out.println("Valor de longitud invàlid. Torna a introduir la longitud de l'array.");
				entrada.nextLine();
			}
			longitudArray=entrada.nextInt();
			entrada.nextLine();		
		}while ((longitudArray<=0) || (longitudArray>20));
		// ja podem inicialitzar l'array
		arrayCadenes = new String[longitudArray]; // array de cadenes
		// demanar cadenes a l'usuari
		System.out.println("Escriu " + longitudArray + " cadenes.");
		// Es llegeixen exactament NUM_CADENES cadenes.
		comptador = 0;
		while (comptador < longitudArray) {
			// Abans de llegir, comprovem si realment hi ha un enter.
			cadena = entrada.nextLine();
			if (!cadena.equals("")) {
				arrayCadenes[comptador] = cadena;
				System.out.println("Cadena llegida: " + arrayCadenes[comptador] + " (" + (comptador + 1) + "/"
						+ longitudArray + ")");
				comptador++;
			} else {
				// Si la cadena és buida
				// No s'avança tampoc el comptador.
				System.out.println("Cadena no vàlida, torna a introduir-ne una");
				// entrada.next();
			}

		}
		System.out.println("Ja s'han llegit les " + longitudArray + " cadenes.");

		// mostrem l'array
		for (int i = 0; i < arrayCadenes.length; i++) {
			System.out.println("Cadena " + i + ": " + arrayCadenes[i]);
		}

		// ordenem l'array en funció de la longitud de cada cadena.
		for (int i = 0; i < arrayCadenes.length - 1; i++) {
			// Bucle intern.
			for (int j = 0; j < arrayCadenes.length - i - 1; j++) {
				// Si la posició més baixa té un valor major que l'adjacent, s'intercanvia el
				// valor.
				if ((arrayCadenes[j]).length() < arrayCadenes[j + 1].length()) {
					// Per intercanviar valors cal una variable auxiliar.
					aux = arrayCadenes[j + 1];
					arrayCadenes[j + 1] = arrayCadenes[j];
					arrayCadenes[j] = aux;
				}
			}
		}
		// mostrem l'array
		System.out.println("Array ordenat:");
		for (int i = 0; i < arrayCadenes.length; i++) {
			System.out.println(arrayCadenes[i]);
		}
		
		//tanquem scanner
		entrada.close();

	}

}
