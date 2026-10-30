package exercicis.tema03.matriussenzills01;

import java.util.Random;
import java.util.Scanner;

public class Exercici06MatriusCreixentsAleatòries {

	private static final int MINIM = 20;
	private static final int MAXIM = 30;

	private static final int VALOR_MINIM = 0;
	private static final int VALOR_MAXIM = 9;

	private static final long TEMPS = 1000; // ms
	
	

	public static void main(String[] args) {

		// declaració de variables
		int n = 2; // mida de la matriu inicial
		int[][] matriu; // matriu inicial mínima
		int[] recompte = new int[10]; //per comptar cadascun dels números.
		boolean entradaValida = false;
		Scanner entrada = new Scanner(System.in);
		Random aleatori = new Random();
		int nMaxim = 0;
		

		// demanar a l'usuari un enter entre 20 i 30

		do {
			System.out.println("Introdueix un enter entre " + MINIM + " i " + MAXIM);
			if (entrada.hasNextInt()) {
				nMaxim = entrada.nextInt();
				if ((nMaxim >= MINIM) && (nMaxim <= MAXIM)) {
					entradaValida = true;
				} else {
					System.out.println("El valor introduït no està entre " + MINIM + " i " + MAXIM);
				}
			} else {
				while (entrada.nextLine().equals("")) {
				}
				System.out.println("Error: l'entrada no és un enter");
			}

		} while (!entradaValida);

		System.out.println("Màxima mida de la matriu: " + nMaxim);

		while (n <= nMaxim) {
			// creem nova matriu de nova mida
			matriu = new int[n][n];
			// generem la matriu
			for (int i = 0; i < matriu.length; i++) {
				for (int j = 0; j < matriu[i].length; j++) {
					matriu[i][j] = aleatori.nextInt(VALOR_MINIM, VALOR_MAXIM + 1);
					recompte[matriu[i][j]]++; //incrementem el comptador del número generat					
				}
			}
			// mostrem la matriu
			System.out.println("\nMatriu "+n+"x"+n+":");
			for (int i = 0; i < matriu.length; i++) {
				for (int j = 0; j < matriu[i].length; j++) {
					System.out.print(matriu[i][j] + " ");
				}
				System.out.println();
			}
			// esperem un temps entre execució i execució en ms
			try {
				Thread.sleep(TEMPS);
			} catch (Exception e) {
				System.out.println(e);
			}
			//incrementem la mida de la matriu
			n++;

		}
		
		//mostrem el recompte de valors:
		System.out.println("\nRecompte de valors:");
		for(int i=0; i<recompte.length;i++) {
			if(i==recompte.length-1) {
				System.out.print(i+": "+recompte[i]);
			} else {
				System.out.print(i+": "+recompte[i]+", ");
			}
		}

		// tanquem Scanner
		entrada.close();
	}

}
