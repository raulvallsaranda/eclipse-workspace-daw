package exercicis.tema03.arraysenzills01;

public class Exercici03 {

	public static final int LONGITUD_ARRAY = 15;
	public static final int IMPARELL_INICIAL = 21;

	public static void main(String[] args) {
		int[] arrayImparells = new int[LONGITUD_ARRAY]; // imparells a partir de 21
		int[] arrayInvertit = new int[LONGITUD_ARRAY]; // array invertit
		int[] arraySuma = new int[LONGITUD_ARRAY]; // suma

		// emplenem el primer amb els valors imparells a partir de 21
		for (int i = 0; i < arrayImparells.length; i++) {
			if (i == 0) {
				arrayImparells[i] = IMPARELL_INICIAL; // valor inicial
			} else {
				arrayImparells[i] = arrayImparells[i - 1] + 2; // imparells següents
			}
		}

		// mostrem per pantalla el primer array
		System.out.print("Array Inicial : ");
		for (int i = 0; i < arrayImparells.length; i++) {
			if (i == 0) {
				System.out.print("[" + arrayImparells[i] + ", ");
			} else if (i == arrayImparells.length - 1) {
				System.out.println(arrayImparells[i] + "]");
			} else {
				System.out.print(arrayImparells[i] + ", ");
			}
		}

		// emplenem el segon amb els valors invertits del primer
		for (int i = 0; i < arrayInvertit.length; i++) {
			arrayInvertit[i] = arrayImparells[arrayImparells.length - 1 - i]; // valor inicial
		}

		// mostrem per pantalla el segon array
		System.out.print("Array Invertit: ");
		for (int i = 0; i < arrayInvertit.length; i++) {
			if (i == 0) {
				System.out.print("[" + arrayInvertit[i] + ", ");
			} else if (i == arrayInvertit.length - 1) {
				System.out.println(arrayInvertit[i] + "]");
			} else {
				System.out.print(arrayInvertit[i] + ", ");
			}
		}

		// emplenem el tercer amb la suma dels dos anteriors
		for (int i = 0; i < arraySuma.length; i++) {
			arraySuma[i] = arrayImparells[i] + arrayInvertit[i]; // valor inicial
		}

		// mostrem per pantalla el tercer array
		System.out.print("Array Suma    : ");
		for (int i = 0; i < arraySuma.length; i++) {
			if (i == 0) {
				System.out.print("[" + arraySuma[i] + ", ");
			} else if (i == arraySuma.length - 1) {
				System.out.println(arraySuma[i] + "]");
			} else {
				System.out.print(arraySuma[i] + ", ");
			}
		}

	}

}
