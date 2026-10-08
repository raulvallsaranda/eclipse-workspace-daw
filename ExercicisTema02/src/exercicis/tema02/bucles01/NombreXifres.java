package exercicis.tema02.bucles01;

import java.util.Scanner;

public class NombreXifres {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int comptadorXifres = 0;
		int numero = 0;
		int numeroInicial = 0; // còpia del número que introdueix l'usuari
		boolean entradaValida = false;
		// Demanem a l'usuari el número per buscar divisors
		do {
			System.out.println("Introdueix un número enter ");
			if (entrada.hasNextInt()) {
				// si l'enter és vàlid, l'obtenim
				numero = entrada.nextInt();
				// en tot cas, buidem el buffer
				entrada.nextLine();
				// actualitzem el valor del semàfor
				entradaValida = true;
				System.out.println("Has introduït el número: " + numero);

			} else {
				// per controlar valors Intro consecutius no desitjats
				while (entrada.nextLine().equals("")) {
				}
				System.out.println("No has introduït un valor enter");
			}
		} while (!entradaValida);
		// per obtenir el número de xifres, hem d'anar dividint per 10 el número fins
		// que el resultat siga 0
		numeroInicial = numero; // ens guardem el valor inicial per poder mostrar-lo després.
		numero = Math.abs(numero); // per si ens han passat un enter negatiu
		do {
			numero = numero / 10;
			comptadorXifres++;
		} while (numero > 0);
		// mostrem el resultat, distingint el cas en què el número només té una xifra
		if (comptadorXifres == 1) {
			System.out.println("El número " + numeroInicial + " té " + comptadorXifres + " xifra.");
		} else {
			System.out.println("El número " + numeroInicial + " té " + comptadorXifres + " xifres.");
		}
		entrada.close();
	}

}
