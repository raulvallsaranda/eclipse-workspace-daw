package tema02.estructura.condicionals;

import java.util.Scanner;

public class MenuOperacions {

	// constant cadena amb el text del menú
	private static final String menu = "Menú operacions:\n" + "----------------\n" + "1) Suma\n" + "2) Resta\n"
			+ "3) Multiplicació\n" + "4) Divisió\n" + "----------------\n" + "Tria una opció:";

	public static void main(String[] args) {

		// definició de variables
		String opcio = "";
		// definició de les variables dels valors a introduir (enters)
		int numero1 = 0;
		int numero2 = 0;
		int resultat = 0;
		// definim l'Scanner (per obtenir dades des del teclat)
		Scanner entrada = new Scanner(System.in);

		// demanar a l'usuari el primer nombre
		System.out.println("Introdueix el primer enter:");
		// comprovem si a l'entrada hi ha un enter
		if (entrada.hasNextInt()) {
			// obtenim el primer nombre
			numero1 = entrada.nextInt();
			// resetejar Scanner i evitar problemes si es demanen més valors
			entrada.nextLine();
			// demanem el segon nombre
			System.out.println("Introdueix el segon enter:");
			// comprovem si a l'entrada hi ha un enter
			if (entrada.hasNextInt()) {
				// obtenim el segon nombre
				numero2 = entrada.nextInt();
				// resetejar Scanner i evitar problemes si es demanen més valors
				entrada.nextLine();
				// mostrem el menú
				System.out.println(menu);
				// obtinc l'opció triada per l'usuari
				opcio = entrada.nextLine();
				// comprove el valor d'opció
				switch (opcio) {
				// en funció del valor realitze una o altra operació
				case "1":
					// hem de sumar
					resultat = numero1 + numero2;
					System.out.println("La suma de " + numero1 + " + " + numero2 + " és: " + resultat);
					break;
				case "2":
					// hem de restar
					resultat = numero1 - numero2;
					System.out.println("La resta de " + numero1 + " - " + numero2 + " és: " + resultat);
					break;

				case "3":
					// hem de multiplicar
					resultat = numero1 * numero2;
					System.out.println("La multiplicació de " + numero1 + " * " + numero2 + " és: " + resultat);
					break;
				case "4":
					// hem de dividir
					//comprove si el segon nombre és 0
					if (numero2 == 0) {
						//error, no podem dividir
						System.out.println("El segon número no pot ser 0 per a dividir");
					} else {
						//calcule la divisió
						resultat = numero1 / numero2;
						System.out.println("La divisió de " + numero1 + " / " + numero2 + " és: " + resultat);
						//calcule el mòdul
						resultat = numero1 % numero2;
						System.out.println("El mòdul de " + numero1 + " % " + numero2 + " és: " + resultat);
					}
					break;
				default:
					//no és cap dels casos anteriors
					System.out.println("L'opció triada no és correcta");
				}
			} else {
				// el segon nombre no és un enter
				System.out.println("Error: no és un enter");
			}

		} else {
			// el primer nombre no és un enter
			System.out.println("Error: no és un enter");
		}

		//tanquem l'Scanner
		entrada.close();

	}

}
