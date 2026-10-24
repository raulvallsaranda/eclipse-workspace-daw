package exercicis.tema03.arrays01;

import java.util.Scanner;

public class NombreMesProxim07 {
	// Longitud de l'array a demanar
	public static final int NUM_VALORS = 5;

	public static void main(String[] args) {
		// declaracions
		int[] arrayNombres = new int[NUM_VALORS];
		int comptador;
		int indexMesProxim;
		int menorDistancia;
		Scanner entrada = new Scanner(System.in);
		

		// demanar números a l'usuari
		System.out.println("Escriu " + NUM_VALORS + " enters. Es pot fer en diferents línies.");
		// Es llegeixen exactament NUM_VALORS valors.
		comptador = 0;
		while (comptador < NUM_VALORS) {
			// Abans de llegir, comprovem si realment hi ha un enter.
			if (entrada.hasNextInt()) {
				arrayNombres[comptador] = entrada.nextInt();
				System.out.println(
						"Valor llegit: " + arrayNombres[comptador] + " (" + (comptador + 1) + "/" + NUM_VALORS + ")");
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
		
		// veiem quin és el que està a menor distància.
		// el que guardem són els índex i la distància
		// establim que el que menor distància inicialment és l'índex 1
		indexMesProxim=1;
		menorDistancia = Math.abs(arrayNombres[1]-arrayNombres[0]);
		for(int i =2; i<arrayNombres.length;i++) {
			if(Math.abs(arrayNombres[i]-arrayNombres[0])<menorDistancia) {
				menorDistancia=Math.abs(arrayNombres[i]-arrayNombres[0]);
				indexMesProxim=i;
			}
		}
		//En acabar el bucle, mostrem l'element que es troba l'indexMesProxim
		System.out.println("L'element més pròxim al primer ("+arrayNombres[0]+") és "+arrayNombres[indexMesProxim]);

	}

}
