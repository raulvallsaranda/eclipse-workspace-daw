package exercicis.tema03.arrays01;

import java.util.Random;
import java.util.Scanner;

public class ParellsImparells04 {

	public static void main(String[] args) {
		// Declaracions
		int[] arrayParells;
		int[] arrayImparells;
		int[] arrayIntercalat;
		int longitudArray;
		int numAleatori;
		int aux; // per a l'ordenació
		Scanner entrada = new Scanner(System.in);
		Random aleatori = new Random();

		// Demanem la longitud de l'array a l'usuari
		do {
			System.out.println("Indica la longitud de l'array (número enter positiu menor o igual que 20):");
			while (!entrada.hasNextInt()) {
				System.out.println("Valor de longitud invàlid. Torna a introduir la longitud de l'array.");
				entrada.nextLine();
			}
			longitudArray = entrada.nextInt();
			entrada.nextLine();
		} while ((longitudArray <= 0) || (longitudArray > 20));
		System.out.println("La longitud de l'array serà: " + longitudArray);
		// inicialitzem els 3 arrays:
		arrayParells = new int[longitudArray];
		arrayImparells = new int[longitudArray];
		arrayIntercalat = new int[longitudArray * 2];

		/***********/
		/* PARELLS */
		/***********/

		// Emplenem l'array de parells
		for (int i = 0; i < arrayParells.length; i++) {
			// mentre el número aleatori no siga múltiple de 2, genera un número
			do {
				numAleatori = aleatori.nextInt(0, 101);
			} while (numAleatori % 2 != 0);
			// quan el número és parell, l'inserim en l'array
			arrayParells[i] = numAleatori;
		}
		// Mostrem l'array per pantalla
		for (int i = 0; i < arrayParells.length; i++) {
			if (i == 0) { // el primer element
				if(arrayParells.length==1) {
					System.out.println("Array Parells: [" + arrayParells[i] + "]");
				}else {
					System.out.print("Array Parells: [" + arrayParells[i] + ", ");

				}
			} else if (i == arrayParells.length - 1) { // l'últim element
				System.out.println(arrayParells[i] + "]");
			} else { // la resta d'elements
				System.out.print(arrayParells[i] + ", ");
			}
		}
		// ordenem l'array de parells (Amb el mètode de la bombolla)
		for (int i = 0; i < arrayParells.length; i++) {
			for (int j = 0; j < arrayParells.length - i - 1; j++) {
				if (arrayParells[j] > arrayParells[j + 1]) {
					// intercanvi
					aux = arrayParells[j];
					arrayParells[j] = arrayParells[j + 1];
					arrayParells[j + 1] = aux;
				}
			}
		}
		// el tornem a mostrar
		for (int i = 0; i < arrayParells.length; i++) {
			if (i == 0) { // el primer element
				if(arrayParells.length==1) {
					System.out.println("Array Parells Ordenat: [" + arrayParells[i] + "]");
				}else {
					System.out.print("Array Parells Ordenat: [" + arrayParells[i] + ", ");

				}
			} else if (i == arrayParells.length - 1) { // l'últim element
				System.out.println(arrayParells[i] + "]");
			} else { // la resta d'elements
				System.out.print(arrayParells[i] + ", ");
			}
		}

		/*************/
		/* IMPARELLS */
		/*************/

		// Emplenem l'array de parells
		for (int i = 0; i < arrayImparells.length; i++) {
			// mentre el número aleatori siga múltiple de 2, genera un número
			do {
				numAleatori = aleatori.nextInt(0, 101);
			} while (numAleatori % 2 == 0);
			// quan el número és parell, l'inserim en l'array
			arrayImparells[i] = numAleatori;
		}
		// Mostrem l'array per pantalla
		for (int i = 0; i < arrayImparells.length; i++) {
			if (i == 0) { // el primer element
				if(arrayImparells.length==1) {
					System.out.println("Array Parells: [" + arrayImparells[i] + "]");
				}else {
					System.out.print("Array Parells: [" + arrayImparells[i] + ", ");
				}
			} else if (i == arrayImparells.length - 1) { // l'últim element
				System.out.println(arrayImparells[i] + "]");
			} else { // la resta d'elements
				System.out.print(arrayImparells[i] + ", ");
			}
		}
		// ordenem l'array d'imparells (Amb el mètode de la bombolla)
		for (int i = 0; i < arrayImparells.length; i++) {
			for (int j = 0; j < arrayImparells.length - i - 1; j++) {
				if (arrayImparells[j] > arrayImparells[j + 1]) {
					// intercanvi
					aux = arrayImparells[j];
					arrayImparells[j] = arrayImparells[j + 1];
					arrayImparells[j + 1] = aux;
				}
			}
		}
		// el tornem a mostrar
		for (int i = 0; i < arrayImparells.length; i++) {
			if (i == 0) { // el primer element
				if(arrayImparells.length==1) {
					System.out.println("Array Imparells ordenat: [" + arrayImparells[i] + "]");
				}else {
					System.out.print("Array Imparells ordenat: [" + arrayImparells[i] + ", ");

				}
			} else if (i == arrayImparells.length - 1) { // l'últim element
				System.out.println(arrayImparells[i] + "]");
			} else { // la resta d'elements
				System.out.print(arrayImparells[i] + ", ");
			}
		}

	/**************/
	/* INTERCALAT */
	/**************/

	// primer fiquem els imparells en l'array intercalat
	for(

	int i = 0;i<arrayImparells.length;i++)
	{
		arrayIntercalat[i * 2] = arrayImparells[i];
	}

	// ara fiquem els parells en l'array intercalat
	for(
	int i = 0;i<arrayParells.length;i++)
	{
		arrayIntercalat[i * 2 + 1] = arrayParells[i];
	}
	// mostrem l'array intercalat
	for(
	int i = 0;i<arrayIntercalat.length;i++)
	{
		if (i == 0) { // el primer element
			System.out.print("Array Intercalat: [" + arrayIntercalat[i] + ", ");
		} else if (i == arrayIntercalat.length - 1) { // l'últim element
			System.out.println(arrayIntercalat[i] + "]");
		} else { // la resta d'elements
			System.out.print(arrayIntercalat[i] + ", ");
		}
	}

}

}
