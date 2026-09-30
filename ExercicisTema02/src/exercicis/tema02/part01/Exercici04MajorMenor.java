package exercicis.tema02.part01;

import java.util.Scanner;

public class Exercici04MajorMenor {

	public static void main(String[] args) {
		// variables per a les dades de la data
		int numero1, numero2, numero3;
		int numeroMajor;
		int numeroMenor;
		// Teclat
		Scanner entrada = new Scanner(System.in);

		System.out.println("Introdueix un valor enter per al primer número:");
		if (entrada.hasNextInt()) {
			numero1 = entrada.nextInt();
			// dia de la setmana correcte, demanem dia del mes
			System.out.println("Introdueix un valor enter per al segon número:");
			if (entrada.hasNextInt()) {
				numero2 = entrada.nextInt();
				System.out.println("Introdueix un valor enter per al tercer número:");
				if (entrada.hasNextInt()) {
					numero3 = entrada.nextInt();
					// els 3 números són enters, comprovem
					//assignem com a número Major numero1 i comparem amb els altres
					numeroMajor=numero1;
					if(numero2 > numeroMajor) {
						numeroMajor = numero2;
					}
					if (numero3 > numeroMajor) {
						numeroMajor =numero3;
					}
					//assignem com a número Menor numero1 i comparem amb els altres
					numeroMenor=numero1;
					if(numero2 < numeroMenor) {
						numeroMenor = numero2;
					}
					if (numero3 < numeroMenor) {
						numeroMenor =numero3;
					}
					
					//Mostrem els resultats
					System.out.println("El menor número dels 3 ("+numero1+","+numero2+","+numero3+") és : "+numeroMenor);
					System.out.println("El major número dels 3 ("+numero1+","+numero2+","+numero3+") és : "+numeroMajor);
					
					

				} else {
					System.out.println("Ho sentim, el que has introduït no és un valor vàlid.");
				}

			} else {
				System.out.println("Ho sentim, el que has introduït no és un valor vàlid.");
			}

		} else {
			System.out.println("Ho sentim, el que has introduït no és un valor vàlid.");
		}
	}

}

