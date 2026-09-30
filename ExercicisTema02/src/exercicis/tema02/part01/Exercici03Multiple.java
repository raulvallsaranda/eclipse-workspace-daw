package exercicis.tema02.part01;

import java.util.Scanner;

public class Exercici03Multiple {

	public static void main(String[] args) {
		int numero; 
		// Teclat
		Scanner entrada = new Scanner(System.in);

		System.out.println("Introdueix un número enter positiu:");
		if (entrada.hasNextInt()) {
			numero = entrada.nextInt();
			if ((numero >= 0)) {
				//comprovem si és parell
				if (numero % 2==0) {
					System.out.println("El número "+numero+" és parell.");
				} else {
					System.out.println("El número "+numero+" és imparell.");
				}
				//comprovem si és múltiple de 3
				if (numero % 3==0) {
					System.out.println("El número "+numero+" és múltiple de 3.");
				} else {
					System.out.println("El número "+numero+" no és múltiple de 3.");
				}
				//comprovem si és múltiple de 5
				if (numero % 5==0) {
					System.out.println("El número "+numero+" és múltiple de 5.");
				} else {
					System.out.println("El número "+numero+" no és múltiple de 5.");
				}
			} else {
				System.out.println("Ho sentim, "+numero+" no és un nombre positiu");
			}
		} else {
			System.out.println("Ho sentim, el que has introduït no és un valor vàlid.");
		}

	}

}

