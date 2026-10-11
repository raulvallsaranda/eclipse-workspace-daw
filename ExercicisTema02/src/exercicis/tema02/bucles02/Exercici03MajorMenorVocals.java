package exercicis.tema02.bucles02;

import java.util.Random;
import java.util.Scanner;

public class Exercici03MajorMenorVocals {

	private static final int LIMIT_INFERIOR = 1;
	private static final int LIMIT_SUPERIOR = 5;
	private static final int FILES = 5;
	private static final String VOCALS = "AEIOU";

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		Random aleatori = new Random();
		boolean entradaValida = false;
		int n = 0;
		String cadenaFila1 = "";
		String cadenaFila2 = "";
		String cadenaFila3 = "";
		
		char vocalAleatoria =' ';

		// demanem el valor a l'usuari mentre no siga vàlid
		do {
			System.out.println("Introdueix un enter entre " + LIMIT_INFERIOR + " i " + LIMIT_SUPERIOR + ":");
			if (entrada.hasNextInt()) {
				n = entrada.nextInt();
				entrada.nextLine();
				if ((n >= LIMIT_INFERIOR) && (n <= LIMIT_SUPERIOR)) {
					entradaValida = true;
				} else {
					System.out.println(
							"Error: el valor enter no està entre " + LIMIT_INFERIOR + " i " + LIMIT_SUPERIOR + ".");
				}
			} else {
				while (entrada.nextLine().equals("")) {
				}
				System.out.println("Error: l'entrada no és un enter");
			}
		} while (!entradaValida);

		vocalAleatoria = VOCALS.charAt(aleatori.nextInt(VOCALS.length()));
		
		//creem les cadenes de les 3 files necessàries
		
		//cadenaFila1
		for(int i=0;i<n;i++) {
			cadenaFila1+=vocalAleatoria+"  ";
		}
		for(int i=0;i<n;i++) {
			cadenaFila1+="  "+vocalAleatoria;
		}
		
		//cadenaFila2
		for(int i=0;i<n;i++) {
			cadenaFila2+=" "+vocalAleatoria+" ";
		}
		for(int i=0;i<n;i++) {
			cadenaFila2+=" "+vocalAleatoria+" ";
		}
		
		//cadenaFila3
		for(int i=0;i<n;i++) {
			cadenaFila3+="  "+vocalAleatoria;
		}
		for(int i=0;i<n;i++) {
			cadenaFila3+=vocalAleatoria+"  ";
		}
		
		for(int i=0;i<FILES;i++) {
			switch(i) {
			case 0:
				System.out.println(cadenaFila1);
				break;
			case 1:
				System.out.println(cadenaFila2);
				break;
			case 2:
				System.out.println(cadenaFila3);
				break;
			case 3:
				System.out.println(cadenaFila2);
				break;
			case 4:
				System.out.println(cadenaFila1);
				break;
			}
		}
		
		//tanquem Scanner
		entrada.close();

	}

}
