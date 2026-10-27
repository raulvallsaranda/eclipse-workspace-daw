package exercicis.tema03.arraysenzills02;

import java.util.Random;

public class Exercici04 {

	public static final int LONGITUD_ARRAY = 200;
	public static final int LONGITUD_FILA = 40;
	public static final int VALOR_MINIM = 1;
	public static final int VALOR_MAXIM = 5;

	public static void main(String[] args) {
		// variables
		int[] array = new int[LONGITUD_ARRAY];
		Random aleatori = new Random();
		// generem array:
		for (int i = 0; i < array.length; i++) {
			array[i] = aleatori.nextInt(VALOR_MINIM, VALOR_MAXIM + 1);
		}
		// mostrem array de 40 en 40
		for (int i = 0; i < array.length; i++) {
			if ((i + 1) % LONGITUD_FILA == 0) {
				System.out.println(array[i]);
			} else {
				System.out.print(array[i]);
			}
		}
		// mostrem array de 40 en 40, els símbols
		for (int i = 0; i < array.length; i++) {
			switch (array[i]) {
			case 1:
				System.out.print("+");
				break;
			case 2:
				System.out.print("*");
				break;
			case 3:
				System.out.print("?");
				break;
			case 4:
				System.out.print("<");
				break;
			case 5:
				System.out.print(">");
				break;
			}
			if ((i + 1) % LONGITUD_FILA == 0) {
				System.out.println();
			}
		}

	}

}
