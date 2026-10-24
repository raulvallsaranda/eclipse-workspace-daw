package exercicis.tema03.arraysenzills01;

import java.util.Random;

public class Exercici04 {

	public static final int LONGITUD_ARRAY = 15;

	public static void main(String[] args) {
		// declaració de variables
		boolean[] arrayBooleans = new boolean[LONGITUD_ARRAY];
		Random aleatori = new Random();
		int comptadorTrue = 0;
		int comptadorFalse = 0;
		// inicialitzem a valors aleatoris
		for (int i = 0; i < arrayBooleans.length; i++) {
			arrayBooleans[i] = aleatori.nextBoolean();
		}
		// el mostrem per pantalla
		// mostrem per pantalla el primer array
		System.out.print("Array Inicial : ");
		for (int i = 0; i < arrayBooleans.length; i++) {
			if (i == 0) {
				if(arrayBooleans[i]) { //true
					System.out.print("[T, ");
				} else { //false
					System.out.print("[F, ");
				}
				
			} else if (i == arrayBooleans.length - 1) {
				if(arrayBooleans[i]) { //true
					System.out.println("T]");
				} else { //false
					System.out.println("F]");
				}
			} else {
				if(arrayBooleans[i]) { //true
					System.out.print("T, ");
				} else { //false
					System.out.print("F, ");
				}
				
			}
		}
		// recorreguem l'array fer fer el recompte de valors boolean
		for (int i = 0; i < arrayBooleans.length; i++) {
			if (arrayBooleans[i])
				comptadorTrue++;
			else
				comptadorFalse++;
		}

		// mostrem els valors obtinguts
		System.out.println("La quantitat de TRUE: "+comptadorTrue);
		System.out.println("La quantitat de FALSE: "+comptadorFalse);
		
		if(comptadorTrue>comptadorFalse) {
			System.out.println("La veritat sempre preval.");
		} else {
			System.out.println("Tot és mentida.");
		}

	}

}
