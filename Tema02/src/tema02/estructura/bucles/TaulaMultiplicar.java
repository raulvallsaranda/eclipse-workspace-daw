package tema02.estructura.bucles;

import java.util.Scanner;

public class TaulaMultiplicar {

	public static void main(String[] args) {
		// declaració de variables
		Scanner entrada = new Scanner(System.in);
		int numeroTaula = 0; // la taula que vull calcular
		int resultat = 0; // per realitzar l’operació
		int i = 0; // comptador, que també servirà per fer càlculs

		// demanar a l'usuari
		System.out.print("Quina taula de multiplicar vols? ");
		if (entrada.hasNextInt()) { // comprovar si tenim un enter a l'entrada
			numeroTaula = entrada.nextInt(); // obtenir el valor
			entrada.nextLine(); // netegem el buffer			

			if ((numeroTaula >= 0) && (numeroTaula <= 10)) {
				System.out.println("Aquesta és la taula del " + numeroTaula);
				// i = 1; // inicialitzem el comptador al primer valor de la taula de
				// multiplicar.
				while (i <= 10) {
					resultat = numeroTaula * i;
					System.out.println(numeroTaula + " * " + i + " = " + resultat);
					i++; // increment ́
					// també podria ser: i++; o i+=1;
				}
			} else {
				System.out.println("Error: el valor no està entre 1 i 10");
			}

		} else {
			System.out.println("Error: valor introduït no enter");
		}

		entrada.close();
	}

}
