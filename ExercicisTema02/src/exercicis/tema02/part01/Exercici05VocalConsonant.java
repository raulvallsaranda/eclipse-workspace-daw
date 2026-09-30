package exercicis.tema02.part01;

import java.util.Scanner;

public class Exercici05VocalConsonant {

	public static void main(String[] args) {
		String valorEntrada;
		char lletra;
		
		// Teclat
		Scanner entrada = new Scanner(System.in);

		System.out.println("Introdueix una lletra:");
		valorEntrada = entrada.next();
		
		if (valorEntrada.length()>1) {
			System.out.println("Has introduït més d'un caràcter: "+valorEntrada);
		} else {
			//només tenim un caràcter, el convertim a minúscula
			valorEntrada=valorEntrada.toLowerCase();
			//el passem a caràcter
			lletra = valorEntrada.charAt(0);
			//comprovem si és vocal o consonant
			switch (lletra) {
			case 'a':
			case 'e':
			case 'i':
			case 'o':
			case 'u': System.out.println("Has introduït una lletra de l'alfabet i és una vocal: "+lletra);
						break;
			case 'b':
			case 'c':
			case 'ç':
			case 'd':
			case 'f':
			case 'g':
			case 'h':
			case 'j':
			case 'k':
			case 'l':
			case 'm':
			case 'n':
			case 'p':
			case 'q':
			case 'r':
			case 's':
			case 't':
			case 'v':
			case 'w':
			case 'x':
			case 'y':
			case 'z': System.out.println("Has introduït una lletra de l'alfabet i és una consonant: "+lletra);
						break;
			default: System.out.println("No has introduït una lletra de l'alfabet: "+lletra);
						break;
			}			
		}		
	}
}

