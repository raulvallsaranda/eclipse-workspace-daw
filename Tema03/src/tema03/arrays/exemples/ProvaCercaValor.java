package tema03.arrays.exemples;

public class ProvaCercaValor {

	private static final float NOTA = 10f;

	public static void main(String[] args) {

		// declaracions
		float[] arrayNotes = { 5f, 5.5f, 9f, 10f, 5f, 8f, 8.5f, 7f, 6.6f, 5f, 9f, 7f };
		boolean notaTrobada = false;
		boolean suspesTrobat = false;
		// int i = 0;
		// mostrem inicialment
		System.out.print("Notes: ");
		for (int j = 0; j < arrayNotes.length; j++) {
			System.out.print(arrayNotes[j] + " ");
		}
		System.out.println();
		// buscar nota
		for (int i = 0; i < arrayNotes.length; i++) {
			System.out.println(i);
			if (arrayNotes[i] == NOTA) {
				notaTrobada = true;
				break;
			}
		}

		// buscar suspés
		for (int i = 0; i < arrayNotes.length; i++) {
			System.out.println(i);
			if (arrayNotes[i] < 5) {
				suspesTrobat = true;
				break;
			}
		}


		if (notaTrobada) {
			System.out.println("Sí està el " + NOTA);
		} else {
			System.out.println("No està el " + NOTA);
		}
		
		if (suspesTrobat) {
			System.out.println("Hi ha almenys 1 suspés");
		} else {
			System.out.println("No hi ha cap suspés");
		}

	}

}
