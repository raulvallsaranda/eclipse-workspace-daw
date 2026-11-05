package tema03.cadenes.exemples;

public class Exempe01CadenaEscala {

	public static void main(String[] args) {
		String cadena = "IES Lluís Simarro";

		System.out.println("Cadena: " + cadena);
		for (int i = 0; i < cadena.length(); i++) {
			System.out.println("-".repeat(i)+cadena.charAt(i));
		}

	}

}
