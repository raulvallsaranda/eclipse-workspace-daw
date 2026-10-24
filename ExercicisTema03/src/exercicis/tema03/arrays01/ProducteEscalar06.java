package exercicis.tema03.arrays01;

import java.util.Scanner;

public class ProducteEscalar06 {

	// Longitud de l'array a demanar
	public static final int NUM_VALORS = 5;

	public static void main(String[] args) {
		// declaracions
		int[] arrayA = new int[NUM_VALORS];
		int[] arrayB = new int[NUM_VALORS];
		int comptador;
		int producteEscalar;
		Scanner entrada = new Scanner(System.in);

		// demanar primer array a l'usuari
		System.out.println("Escriu " + NUM_VALORS + " enters. Es pot fer en diferents línies.");
		// Es llegeixen exactament NUM_VALORS valors.
		comptador = 0;
		while (comptador < NUM_VALORS) {
			// Abans de llegir, comprovem si realment hi ha un enter.
			if (entrada.hasNextInt()) {
				arrayA[comptador] = entrada.nextInt();
				System.out.println(
						"Valor llegit: " + arrayA[comptador] + " (" + (comptador + 1) + "/" + NUM_VALORS + ")");
				comptador++;
			} else {
				// Si el valor no és enter, es llegeix però s'ignora.
				// No s'avança tampoc el comptador.
				System.out.println("Valor no vàlid, torna a introduir un enter");
				entrada.next();
			}
		}
		// Els valors que sobren a l'última línia escrita es descarten.
		entrada.nextLine();
		System.out.println("Ja s'han llegit els " + NUM_VALORS + " valors del primer array.");

		// demanar segon array a l'usuari
		System.out.println("Escriu " + NUM_VALORS + " enters. Es pot fer en diferents línies.");
		// Es llegeixen exactament NUM_VALORS valors.
		comptador = 0;
		while (comptador < NUM_VALORS) {
			// Abans de llegir, comprovem si realment hi ha un enter.
			if (entrada.hasNextInt()) {
				arrayB[comptador] = entrada.nextInt();
				System.out.println(
						"Valor llegit: " + arrayB[comptador] + " (" + (comptador + 1) + "/" + NUM_VALORS + ")");
				comptador++;
			} else {
				// Si el valor no és enter, es llegeix però s'ignora.
				// No s'avança tampoc el comptador.
				System.out.println("Valor no vàlid, torna a introduir un enter");
				entrada.next();
			}
		}
		// Els valors que sobren a l'última línia escrita es descarten.
		entrada.nextLine();
		System.out.println("Ja s'han llegit els " + NUM_VALORS + " valors del segon array.");
		
		// realitzar el producte escalar
		producteEscalar =0;
		for (int i =0; i < arrayA.length;i++) {
			producteEscalar+=arrayA[i]*arrayB[i];
		}
		
		//Mostrar el resultat:
		System.out.println("El producte escalar de ");
		for(int i=0;i<arrayA.length;i++) {
			if (i == 0) { // el primer element
				System.out.print("[" + arrayA[i] + ", ");
			} else if (i == arrayA.length - 1) { // l'últim element
				System.out.print(arrayA[i] + "] ");
			} else { // la resta d'elements
				System.out.print(arrayA[i] + ", ");
			}
		}
		System.out.print(" per ");
		for(int i=0;i<arrayB.length;i++) {
			if (i == 0) { // el primer element
				System.out.print("[" + arrayB[i] + ", ");
			} else if (i == arrayB.length - 1) { // l'últim element
				System.out.print(arrayB[i] + "] ");
			} else { // la resta d'elements
				System.out.print(arrayB[i] + ", ");
			}
		}
		System.out.println(" és: "+producteEscalar);
			

	}

}
