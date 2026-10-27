package exercicis.tema03.arrays01;

import java.util.Scanner;

public class MatriuParaules10 {

	public static final int LONGITUD_MINIMA = 5;

	public static void main(String[] args) {
		// variables
		Scanner entrada = new Scanner(System.in);
		boolean entradaValida = false;
		String frase1 = "";
		String frase2 = "";
		int majorLongitud = 0;
		char[][] matriuCaracters;

		// demanem frase 1 a l'usuari
		do {
			System.out.println("Escriu la primera frase de longitud mínima " + LONGITUD_MINIMA + " caràcters:");
			frase1 = entrada.nextLine();
			if (frase1.length() < LONGITUD_MINIMA) {
				System.out.println("La frase ha de tindre almenys " + LONGITUD_MINIMA + " caràcters");
			} else {
				entradaValida = true;
			}

		} while (!entradaValida);
		System.out.println("Frase 1: " + frase1);
		entradaValida = false;
		// demanem frase 2 a l'usuari
		do {
			System.out.println("Escriu la segona frase de longitud mínima " + LONGITUD_MINIMA + " caràcters:");
			frase2 = entrada.nextLine();
			if (frase2.length() < LONGITUD_MINIMA) {
				System.out.println("La frase ha de tindre almenys " + LONGITUD_MINIMA + " caràcters");
			} else {
				entradaValida = true;
			}

		} while (!entradaValida);
		System.out.println("Frase 2: " + frase2);
		
		// comparem les frases i creem una matriu amb la longitud de la major
		if(frase1.length()>=frase2.length()) {
			majorLongitud=frase1.length();
		} else {
			majorLongitud=frase2.length();
		}
		
		matriuCaracters = new char[2][majorLongitud];
		//emplenem les files amb els caràcters.
		//Frase 1
		
		for(int i=0;i<matriuCaracters[0].length;i++) {
			if(i<frase1.length()) {
				matriuCaracters[0][i]=frase1.charAt(i);
			} else {
				matriuCaracters[0][i]='*';
			}
		}
		//Frase 2
		for(int i=0;i<matriuCaracters[1].length;i++) {
			if(i<frase2.length()) {
				matriuCaracters[1][i]=frase2.charAt(i);
			} else {
				matriuCaracters[1][i]='*';
			}
		}
		
		//mostrem la matriu per pantalla
		for(int i=0;i<matriuCaracters.length;i++) {
			for (int j=0;j<matriuCaracters[i].length;j++) {
				System.out.print(matriuCaracters[i][j]+" ");
			}
			System.out.println();
		}
		
			
		

	}

}
