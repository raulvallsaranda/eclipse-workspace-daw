package tema03.arrays.scanner;

import java.util.Scanner;

public class EntradaValorsDesconeguts {
	// aquest valor indica que s'ha acabat d'introduir dades
	// com que els valors demanats són positius, no entra dins dels valors possibles
	public static final int MARCA_FI = -1;

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int valor = 0; // valor que introdueix l'usuari per teclat
		boolean marcaTrobada = false; // inicialitzem semàfor a false

		System.out.print("Escriu diversos valors enters positius.");
		System.out.println("Per acabar escriu un " + MARCA_FI);

		//mentre no trobem la marca de final d'entrada de dades
		while (!marcaTrobada) {
			// Abans de llegir, comprovem si realment hi ha un enter.
			if (entrada.hasNextInt()) {
				valor = entrada.nextInt();
				// És la marca de fi?
				if (valor == MARCA_FI) {
					// Sí que ho és.
					marcaTrobada = true;
				} else if (valor>0){
					// No. És un valor que ha de ser tractat.
					System.out.println("Valor llegit: " + valor);
				} else {
					//és un valor enter que no ha de ser tractat: negatiu
					System.out.println("El valor: " + valor +" és negatiu.");
				}
			} else {
				// Si el valor no és enter, es llegeix però s'ignora.
				entrada.next();
				System.out.println("Has introduït un valor no enter");
			}
		}
		// Els valors que sobren a l'última línia escrita es descarten.
		entrada.nextLine();
		System.out.println("Ja s'han llegit tots els valors.");
		//tanquem l'Scanner
		entrada.close();
	}
}
