package exercicis.tema03.arraysenzills01;

import java.util.Random;

public class Exercici07 {

	// constants
	public static final int LONGITUD_ARRAY = 20;
	public static final int CHAR_MINIM = 65;
	public static final int CHAR_MAXIM = 90;

	public static void main(String[] args) {
		// declaració de variables
		char[] arrayChars = new char[LONGITUD_ARRAY];
		Random aleatori = new Random();
		int comptadorVocals = 0;
		int comptadorIteracions = 0;
		boolean senseVocals = false;
		String vocals = "";

		do {
			System.out.println("Iteració: "+comptadorIteracions);
			// inicialitzem l'array
			for (int i = 0; i < arrayChars.length; i++) {
				arrayChars[i] = (char) aleatori.nextInt(CHAR_MINIM, CHAR_MAXIM + 1);
			}
			// mostrem tot l'array
			System.out.print("Array complet: ");
			for (int i = 0; i < arrayChars.length; i++) {
				System.out.print(arrayChars[i]);
			}
			// busquem les vocals i comprovem si n'hi ha
			for (int i = 0; i < arrayChars.length; i++) {
				switch (arrayChars[i]) {
				case 'A', 'E', 'I', 'O', 'U':
					vocals += arrayChars[i];
					comptadorVocals++;
					break;
				}

			}

			// si no n'hi ha ho indiquem, si n'hi ha les mostrem
			if (comptadorVocals > 0) {
				System.out.print("\nNomés les vocals: ");
				System.out.println(vocals);
				vocals="";
				comptadorVocals=0;
			} else {
				System.out.println("\nNo hi ha vocals");
				senseVocals = true;
			}
			comptadorIteracions++;
		} while (!senseVocals);

	}

}
