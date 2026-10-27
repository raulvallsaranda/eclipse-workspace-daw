package exercicis.tema03.arraysenzills02;

import java.util.Random;

public class Exercici06 {

	public static final int LONGITUD_ARRAY = 20;
	public static final int MINIM = 1;
	public static final int MAXIM = 100;

	public static void main(String[] args) {
		// variables
		int[] array = new int[LONGITUD_ARRAY];
		Random aleatori = new Random();
		// inicialitzem l'array
		for (int i = 0; i < array.length; i++) {
			array[i] = aleatori.nextInt(MINIM, MAXIM + 1);
		}
		// mostrem
		System.out.print("Array Inicial: ");
		for (int i = 0; i < array.length; i++) {
			if (i == array.length - 1) {
				System.out.println(array[i] + "]");
			} else if (i == 0) {
				System.out.print("[" + array[i] + ", ");
			} else {
				System.out.print(array[i] + ", ");
			}
		}
		// modifiquem l'array
		for (int i = 0; i < array.length; i++) {
			if (array[i] % 2 == 0) {
				array[i] = 2;
			} else if (array[i] % 3 == 0) {
				array[i] = 3;
			} else if (array[i] % 5 == 0) {
				array[i] = 5;
			}
		}
		// mostrem
		System.out.print("Array Modificat: ");
		for (int i = 0; i < array.length; i++) {
			if (i == array.length - 1) {
				System.out.println(array[i] + "]");
			} else if (i == 0) {
				System.out.print("[" + array[i] + ", ");
			} else {
				System.out.print(array[i] + ", ");
			}
		}

	}

}
