package exercicis.puntuables.tema03;

import java.util.Random;

public class Exericici02Array {

	private static final String[] NOMS = { "Xavi", "Maria", "Rebeca", "Joan", "Anna" };
	private static final String[] COGNOMS = { "Llopis", "Gisbert", "Sanchis", "Mollà", "Benavent", "Alberola" };
	private static final String[] CIUTATS = { "Xàtiva", "Quatretonda", "Alzira", "València", "Canals", "Novetlè",
			"Albaida" };
	

	private static final int LONGITUD_ARRAY = 3;
	private static final int REPETICIONS = 10;
	
	public static void main(String[] args) {

		Random aleatori = new Random();
		int sumatoriCaracters = 0;
		int iteracio = 0;
		int sumatoriTotalCaracters = 0;

		// Array de cadenes

		String[] arrayInicial = new String[LONGITUD_ARRAY];
		
		do {
		// iniciem sumatori caràcters de la iteració actual
			sumatoriCaracters = 0;
		// introduir cadenes aleatòries: 1 per cada array

		for (int i = 0; i < arrayInicial.length; i++) {
			switch (i) {
			case 0:
				arrayInicial[i] = NOMS[aleatori.nextInt(NOMS.length)];
				break;
			case 1:
				arrayInicial[i] = COGNOMS[aleatori.nextInt(COGNOMS.length)];
				break;
			case 2:
				arrayInicial[i] = CIUTATS[aleatori.nextInt(CIUTATS.length)];
				break;
			}
		}

		// mostrem arrayInicial
		System.out.println("Iteració "+iteracio);
		System.out.print("Array de cadenes inicial: ");
		for (int i = 0; i < arrayInicial.length; i++) {
			if (i == 0) {
				System.out.print("["+arrayInicial[i] + ", ");
			} else if (i == arrayInicial.length - 1) {
				System.out.print(arrayInicial[i] + "]");
			} else {
				System.out.print(arrayInicial[i] + ", ");
			}
		}

		// Array del doble de la longitud

		String[] arrayLletres = new String[arrayInicial.length * 2];

		// Iniciem l'array a cadenes buides

		for (int i = 0; i < arrayLletres.length; i++) {
			arrayLletres[i] = "";
		}

		// ficar en cada posició el 1r i 2n caràcters de les cadenes
		// primer el primer de cada paraula i després el segon

		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < arrayInicial.length; j++) {
				arrayLletres[(i * 3) + j] += arrayInicial[j].charAt(i);
			}
		}

		System.out.print("\nArray de lletres: ");
		// mostrem arrayLletres
		for (int i = 0; i < arrayLletres.length; i++) {
			if (i == 0) {
				System.out.print("["+arrayLletres[i] + ", ");
			} else if (i == arrayLletres.length - 1) {
				System.out.print(arrayLletres[i] + "]");
			} else {
				System.out.print(arrayLletres[i] + ", ");
			}
		}

		// array combinat
		String[] arrayCombinat = new String[arrayLletres.length * 2];

		for (int i = 0; i < arrayCombinat.length; i++) {
			arrayCombinat[i] = "";
		}

		for (int i = 0; i < arrayLletres.length; i++) {
			switch (arrayLletres[i].toLowerCase()) {
			case "a", "e", "i", "o", "u":
				for (int j = 0; j < 2; j++) {
					arrayCombinat[2 * i + j] = "" + (2 * i + j);
					arrayCombinat[2 * i + j] += arrayLletres[i] + arrayLletres[i].toUpperCase();
				}
				break;
			default:
				for (int j = 0; j < 2; j++) {
					arrayCombinat[2 * i + j] = "" + (2 * i + j);
					arrayCombinat[2 * i + j] += arrayLletres[i] + arrayLletres[i].toLowerCase();
				}
			}

		}

		System.out.print("\nArray combinat: ");
		// mostrem arrayCombinat
		for (int i = 0; i < arrayCombinat.length; i++) {
			if (i == 0) {
				System.out.print("["+arrayCombinat[i] + ", ");
			} else if (i == arrayCombinat.length - 1) {
				System.out.print(arrayCombinat[i] + "]");
			} else {
				System.out.print(arrayCombinat[i] + ", ");
			}
		}
		
		//sumatori de caràcters arrayInicial
		for (int i = 0; i < arrayInicial.length; i++) {
			sumatoriCaracters+=arrayInicial[i].length();
		}
		
		//sumatori de caràcters arrayLletres
		for (int i = 0; i < arrayLletres.length; i++) {
			sumatoriCaracters+=arrayLletres[i].length();
		}
		
		//sumatori de caràcters arrayCombinat
		for (int i = 0; i < arrayCombinat.length; i++) {
			sumatoriCaracters+=arrayCombinat[i].length();
		}
		
		//mostrem suma total de caràcters en aquesta iteració
		System.out.println("\nLa quantitat de caràcters és: "+sumatoriCaracters);
		System.out.println("------------------------------------------");
		//actualitzem sumatori de caràcters i comptador de repeticions
		iteracio++;
		sumatoriTotalCaracters+=sumatoriCaracters;
		
		}while (iteracio < REPETICIONS);
		
		//mostrem suma total de caràcters en totes les  iteracions

		System.out.println("\nLa quantitat de caràcters de les "+REPETICIONS+" repeticions és: "+sumatoriTotalCaracters);

	}

}
