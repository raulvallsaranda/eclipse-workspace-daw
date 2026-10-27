package exercicis.tema03.arraysenzills02;

public class Exercici07 {

	public static void main(String[] args) {
		String[] array = { "mar", "so", "fam", "llengua", "flama", "esmolada", "tobogan", "diània", "arxienemic",
				"roba" };
		// mostrem per pantalla:
		System.out.println("L'array original:");
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
			array[i] = ("" + array[i].charAt(0) + array[i].charAt(array[i].length() - 1)).toUpperCase();
		}
		// mostrem per pantalla:
		System.out.println("L'array modificat:");
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
