package exercicis.tema03.arrays02;

import java.util.Scanner;

public class Exercici08MatriuLletres {

	private static final int LONGITUD_MAXIMA = 10;
	private static final int MIDA_MATRIU = 5;
	private static final String LLETRES = "ABCÇDEFGHIJKLMNOPQRSTUVWXYZ0";

	public static void main(String[] args) {

		//declaració de variables
		Scanner entrada = new Scanner(System.in);
		String cadena = "";
		String[][] matriu = new String[MIDA_MATRIU][MIDA_MATRIU];
		boolean acabarPrograma = false;
		boolean entradaValida = false;
		
		//inicialitzem la matriu a cadena buida
		//emplenem la matriu amb la lletra
		for(int i=0;i<matriu.length;i++) {
			for(int j=0;j<matriu[i].length;j++) {
				matriu[i][j]="";
			}
		}

		//iniciem el bucle del programa
		do {

			// demanar cadena
			entradaValida=false;
			do {
				System.out.println("Escriu una lletra (acaba amb 0)");
				cadena = entrada.nextLine().trim();
				if (cadena.isBlank()) {
					System.out.println("Error: no pot estar buida");
				} else if (cadena.length() > 1) {
					System.out.println("Error: no pots escriure més d'un caràcter");
				} else if (!LLETRES.contains(cadena.toUpperCase())) {
					System.out.println("Error: només lletres i el caràcter 0");
				} else {
					entradaValida = true;
				}

			} while (!entradaValida);

			if(cadena.equals("0")) {
				acabarPrograma=true;
				System.out.println("Fi de programa. Fins aviat!");
			} else {
				//emplenem la matriu amb la lletra (afegint-la a les existents)
				for(int i=0;i<matriu.length;i++) {
					for(int j=0;j<matriu[i].length;j++) {
						matriu[i][j]+=cadena;
					}
				}
				//mostrar matriu
				for(int i=0;i<matriu.length;i++) {
					for(int j=0;j<matriu[i].length;j++) {
						System.out.print(matriu[i][j]+" ");
					}
					System.out.println();
				}
				//comprovem si hem arribat a la mida màxima
				if(matriu[0][0].length()==LONGITUD_MAXIMA) {
					//netegem la matriu
					for(int i=0;i<matriu.length;i++) {
						for(int j=0;j<matriu[i].length;j++) {
							matriu[i][j]="";
						}
					}
				}
			}
			
		} while (!acabarPrograma);
		
		//tanquem scanner
		entrada.close();

	}

}
