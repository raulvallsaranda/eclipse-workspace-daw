package exercicis.tema03.cadenessenzills01;

public class Exercici05 {

	public static void main(String[] args) {

		String[] cadenes = { "TEmpS", "OLI�s", "CoLLIta", "MArOR", "CAlaMAr", "caTIfa", "sarg�s", "FORNER", "t�piCA",
				"ratol�" };
		/*String[] cadenes = { "Clars", "raJOLA", "ambiCI�", "amFIBI", "TREnet", "SicaRI",
				"CaDiRa", "REGar", "aDHERIR", "trif�SIC" };*/
		String aux = "";
		// mostrem l'array:
		System.out.println("Array de cadenes:");
		for (int i = 0; i < cadenes.length; i++) {
			System.out.print(cadenes[i] + " ");
		}
		// modifiquem l'array:
		for (int i = 0; i < cadenes.length; i++) {
			cadenes[i] = cadenes[i].substring(0, 2).toLowerCase() + ("" + cadenes[i].charAt(2)).toUpperCase()
					+ cadenes[i].substring(3).toLowerCase();
		}
		// mostrem l'array:
		System.out.println("\nArray de cadenes Modificat:");
		for (int i = 0; i < cadenes.length; i++) {
			System.out.print(cadenes[i] + " ");
		}
		// ordenar l'array en funci� d'aquesta 3a lletra
		for (int i = 0; i < cadenes.length; i++) {
			for (int j = 0; j < cadenes.length - 1 - i; j++) {
				if (cadenes[j + 1].charAt(2) < cadenes[j].charAt(2)) {
					aux = cadenes[j];
					cadenes[j] = cadenes[j + 1];
					cadenes[j + 1] = aux;
				}
			}
		}
		// mostrem l'array:
		System.out.println("\nArray de cadenes Ordenat pel tercer car�cter:");
		for (int i = 0; i < cadenes.length; i++) {
			System.out.print(cadenes[i] + " ");
		}

	}

}
