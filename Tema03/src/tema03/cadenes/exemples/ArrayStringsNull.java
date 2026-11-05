package tema03.cadenes.exemples;

public class ArrayStringsNull {
	public static void main(String[] args) {
		//creem un array de 5 cadenes, sense assignar el valor
		String[] arrayCadenaDefecte = new String[5];
		//visualitzem el contingut de l'array
		for (int i = 0; i < arrayCadenaDefecte.length; i++) {
			System.out.println(arrayCadenaDefecte[i]);
		}
	}
}
