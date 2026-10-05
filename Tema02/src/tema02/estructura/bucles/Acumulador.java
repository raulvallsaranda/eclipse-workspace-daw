package tema02.estructura.bucles;

import java.util.Scanner;

public class Acumulador {

	public static void main(String[] args) {
		// declaració de variables
		int resultat = 0; // acumulador: li sumarem els múltiples
		int i = 0; // comptador, per controlar el bucle
		int limit = 20; // fins a on sumarem
		Scanner entrada = new Scanner(System.in);

		//demanem el límit a l'usuari
		System.out.print("Fins a quin valor vols sumar múltiples de 3? ");
		if (entrada.hasNextInt()) {
			limit = entrada.nextInt();
			entrada.nextLine();
			if((limit>=1) && (limit<=100)) {
				while (i <= limit) {
					System.out.println("Afegim " + i);
					resultat = resultat + i; // sumem valors dels múltiples de 3
					i = i + 3; // passem al següent múltiple de 3, no anem d’1 en 1
				}
				System.out.println("El resultat final és " + resultat + ".");
			} else {
				System.out.println("Error: el límit no està entre 1 i 100");
			}
			
			
		} else {
			System.out.println("Error: el valor introduït no és un enter");
		}

		entrada.close();
	}

}
