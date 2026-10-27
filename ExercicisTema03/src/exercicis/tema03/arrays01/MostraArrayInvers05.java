package exercicis.tema03.arrays01;

import java.util.Scanner;

//demanar un array d'enters i mostrar-lo en ordre invers.
public class MostraArrayInvers05 {
	//Longitud de l'array a demanar
	public static final int NUM_VALORS = 5;

	public static void main(String[] args) {

		//declaracions
		int[] arrayNombres = new int[NUM_VALORS];
		int comptador;
		Scanner entrada =  new Scanner(System.in);
		
		//demanar números a l'usuari
		System.out.println("Escriu " + NUM_VALORS + " enters. Es pot fer en diferents línies.");
		// Es llegeixen exactament NUM_VALORS valors.
		comptador = 0;
		while (comptador < NUM_VALORS) {
			// Abans de llegir, comprovem si realment hi ha un enter.
			if (entrada.hasNextInt()) {
				arrayNombres[comptador] = entrada.nextInt();
				System.out.println("Valor llegit: " + arrayNombres[comptador]+" ("+(comptador +1)+"/"+NUM_VALORS+")");
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
		System.out.println("Ja s'han llegit els " + NUM_VALORS + " valors.");
		// Mostrem els valors en ordre invers:
		for(int i = arrayNombres.length -1; i>=0; i--) {
			if (i == arrayNombres.length -1) { // el primer element
				System.out.print("Valors en ordre invers: [" + arrayNombres[i] + ", ");
			} else if (i == 0) { // l'últim element
				System.out.println(arrayNombres[i] + "]");
			} else { // la resta d'elements
				System.out.print(arrayNombres[i] + ", ");
			}
		}
		
		
	}

}
