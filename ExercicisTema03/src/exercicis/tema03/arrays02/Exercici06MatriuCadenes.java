package exercicis.tema03.arrays02;

import java.util.Scanner;

public class Exercici06MatriuCadenes {

	private static final int FILES = 2;
	private static final int COLUMNES = 3;
	private static final int LONGITUD_MAXIMA = 10;

	public static void main(String[] args) {

		// variables
		Scanner entrada = new Scanner(System.in);
		String cadena = "";
		boolean entradaValida = false;
		boolean acabarPrograma = false;
		int comptadorCadenes = 0;
		int comptadorEsborrar = 0;
		boolean cadenaIntroduida = false;
		boolean cadenaEsborrada = false;
		boolean matriuPlena = false;
		boolean matriuBuida = true;
		// declarem la matriu
		String[][] matriu = new String[FILES][COLUMNES];

		do {
			// inicialitzem el valor del booleà per controlar l'entrada
			entradaValida = false;
			do {
				System.out.println("Introdueix una cadena no buida de longitud màxima " + LONGITUD_MAXIMA + " caràcters");
				System.out.println("FI: acaba programa, ESBORRA: esborra última cadena, NETEJA: buida la matriu");
				cadena = entrada.nextLine().trim();

				if (cadena.isBlank()) {
					System.out.println("Error: no pot estar buida");
				} else if (cadena.length() <= LONGITUD_MAXIMA) {
					entradaValida = true;
				} else {
					System.out.println("Error: cadena massa llarga");
				}

			} while (!entradaValida);

			// ara hem de veure què fer en funció de la cadena
			switch (cadena.toLowerCase()) {
			case "fi":
				acabarPrograma = true;
				break;
			case "neteja":
				// fiquem totes posicions a null
				if (matriuBuida) {
					System.out.println("La matriu ja està buida");
				} else {
					for (int i = 0; i < FILES; i++) {
						for (int j = 0; j < COLUMNES; j++) {
							matriu[i][j] = null;
						}
					}
					// actualitzem comptadors i controladors
					if (matriuPlena) { matriuPlena = false;}
					matriuBuida = true;
					comptadorCadenes = 0;
					// mostrar la matriu:
					for (int i = 0; i < FILES; i++) {
						for (int j = 0; j < COLUMNES; j++) {
							System.out.print((i+1) + "." + (j+1) + ": " + matriu[i][j] + " ");
						}
						System.out.println();
					}
					System.out.println();
				}

				break;
			case "esborra": // esborrar l'última cadena introduïda
				if (matriuBuida) {
					System.out.println("La matriu està buida, no es pot esborrar cap cadena");
				} else {
					// detectar l'última cadena introduïda i eliminar-la (null)
					//inicialitzem valors de control
					cadenaEsborrada = false;
					comptadorEsborrar = 0; //s'incrementa fins arriba a comptadorCadenes
					for (int i = 0; i < FILES && !cadenaEsborrada; i++) {
						for (int j = 0; j < COLUMNES && !cadenaEsborrada; j++) {
							comptadorEsborrar++;
							if (comptadorEsborrar == comptadorCadenes) {
								//ja estem en la posició de l'última cadena introduïda
								matriu[i][j] = null; //eliminem la cadena
								//actualitzem comptadors i controladors
								comptadorCadenes--;
								cadenaEsborrada = true;
								if (matriuPlena) { matriuPlena = false;}
								if (comptadorCadenes == 0) { matriuBuida = true;}
							}
						}
					}
					// mostrar la matriu:
					for (int i = 0; i < FILES; i++) {
						for (int j = 0; j < COLUMNES; j++) {
							System.out.print((i+1) + "." + (j+1) + ": " + matriu[i][j] + " ");
						}
						System.out.println();
					}
					System.out.println();
				}

				break;
			default:// inserir la cadena si hi ha espai
				if (!matriuPlena) {
					cadenaIntroduida = false;
					// si ja hem introduït una cadena, no cal seguir en el bucle
					for (int i = 0; i < FILES && !cadenaIntroduida; i++) {
						for (int j = 0; j < COLUMNES && !cadenaIntroduida; j++) {
							if (matriu[i][j] == null) {
								// si la posició està buida, assignem la cadena actual
								matriu[i][j] = cadena;
								cadenaIntroduida = true;
								comptadorCadenes++;
								if (matriuBuida) {	matriuBuida = false;}
							}
						}
					}

					// comprovem que la matriu està plena
					if (comptadorCadenes == (FILES * COLUMNES)) {	matriuPlena = true;}

					// mostrar la matriu:
					for (int i = 0; i < FILES; i++) {
						for (int j = 0; j < COLUMNES; j++) {
							System.out.print((i+1) + "." + (j+1) + ": " + matriu[i][j] + " ");
						}
						System.out.println();
					}
					System.out.println();
				} else {
					System.out.println("La matriu està plena, no es pot introduir la cadena\n");
				}

			}

		} while (!acabarPrograma);

		System.out.println("Fi del programa. Fins aviat!");

		// tanquem scanner
		entrada.close();

	}

}
