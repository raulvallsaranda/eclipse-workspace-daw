package tema03.arrays.exemples;

//busca l'element més xicotet i el fica al principi
public class SelectionSort {
	public static void main(String[] args) {
		int[] arrayEnters = { 55, 90, 21, 10, 44, 36, 20, 78, 12, 44 };
		int posMin = 0; // valor auxiliar per guardar la posició del mínim en la versió 2
		int aux = 0; // variable auxiliar per realitzar l'intercanvi

		// El mostrem per pantalla.
		System.out.println("L'array original és:");
		for (int i = 0; i < arrayEnters.length; i++) {
			if (i == 0) {
				System.out.print("[" + arrayEnters[i] + ",");
			} else if (i == arrayEnters.length - 1) {
				System.out.print(arrayEnters[i] + "]");
			} else {
				System.out.print(arrayEnters[i] + ",");
			}
		}
		// Bucle extern.

		// en cada iteració guarda la posició del menor valor en una variable auxiliar.
		// quan acaba la iteració, intercanvia aquest valor amb el primer del recorregut
		// actual
		for (int i = 0; i < arrayEnters.length - 1; i++) {
			// establim com a menor valor el primer
			posMin = i;
			// Bucle intern.
			// Se cerca entre la resta de posicions quin és el valor més baix.
			for (int j = i + 1; j < arrayEnters.length; j++) {
				// Si la posició actual és menor que el que tenim com a mínim, el guardem com a
				// nou mínim
				if (arrayEnters[j] < arrayEnters[posMin]) {
					// Per intercanviar valors cal una variable auxiliar.
					posMin = j;
				}
			}
			// una vegada acaba la iteració, intercanviem els valors, si cal
			if (posMin != i) {
				aux = arrayEnters[i];
				arrayEnters[i] = arrayEnters[posMin];
				arrayEnters[posMin] = aux;
			}

		}

		// El mostrem per pantalla.
		System.out.println("\nL'array ordenat és:");
		for (int i = 0; i < arrayEnters.length; i++) {
			if (i == 0) {
				System.out.print("[" + arrayEnters[i] + ",");
			} else if (i == arrayEnters.length - 1) {
				System.out.print(arrayEnters[i] + "]");
			} else {
				System.out.print(arrayEnters[i] + ",");
			}
		}
	}
}
