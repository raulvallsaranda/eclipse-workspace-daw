package tema03.matrius.exemples;

public class Exemple10Notes {

	public static void main(String[] args) {
		// declaració
		float sumaAlumne = 0;
		float sumaTotal = 0;
		float mitjanaGlobal = 0;
		// matriu inicial de notes
		float[][] matriuNotes = { { 4.5f, 6f, 5f, 8f, 0f }, { 10f, 8f, 7.5f, 9.5f, 0f }, { 3f, 2.5f, 4.5f, 6f, 0f },
				{ 6f, 8.5f, 6f, 4f, 0f }, { 9f, 7.5f, 7f, 8f, 0f } };

		// sumem files per notes i obtenim mitjana
		for (int i = 0; i < matriuNotes.length; i++) { // recórrer files
			// per a cada fila reiniciem el valor de la suma
			sumaAlumne = 0.0f;
			for (int j = 0; j < matriuNotes[i].length; j++) { // recórrer columnes
				if (j == matriuNotes[i].length - 1) {
					// última posició: ficar la mitjana
					matriuNotes[i][j] = sumaAlumne / j;
					sumaTotal += matriuNotes[i][j];
				} else {
					// notes intermèdies: anar sumant
					sumaAlumne += matriuNotes[i][j];
				}
			}
		}

		// mostrem
		for (int i = 0; i < matriuNotes.length; i++) { // recórrer files
			for (int j = 0; j < matriuNotes[i].length; j++) { // recórrer columnes
				System.out.print(matriuNotes[i][j] + "\t");
			}
			System.out.println();
		}

		// mostrem mitjana global
		mitjanaGlobal = sumaTotal / matriuNotes.length;
		System.out.println("Mitjana global: " + mitjanaGlobal);

	}

}
