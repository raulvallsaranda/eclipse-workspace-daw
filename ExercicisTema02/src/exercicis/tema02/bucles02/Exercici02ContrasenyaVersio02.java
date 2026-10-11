package exercicis.tema02.bucles02;

import java.util.Random;
import java.util.Scanner;

public class Exercici02ContrasenyaVersio02 {

	private static String menu = "Menú complexitat contrasenya:\r\n"
								+ "-----------------------------\r\n"
								+ "1. Només lletres (majúscules i minúscules)\r\n"
								+ "2. Només lletres i dígits\r\n"
								+ "3. Només lletres , digíts i símbols\r\n"
								+ "-----------------------------\r\n"
								+ "Indica la teua opció:";
	
	private static final int LIMIT_INFERIOR = 8;
	private static final int LIMIT_SUPERIOR = 20;
	
	private static final String CONTRASENYA_NIVELL_1 = "abcçdefghijklmnopqrstuvwxyzABCÇDEFGHIJKLMNOPQRSTUVWXYZ";
	private static final String CONTRASENYA_NIVELL_2 = "0123456789";
	private static final String CONTRASENYA_NIVELL_3 = "!\"#$%&'()*+,-./:;<=>?@[\\]^_{|}";

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		Random aleatori = new Random();
		String opcioUsuari = "";
		int longitud = 0;
		String contrasenya="";
		String cadenaCaracters = "";
		int probabilitat = 0;
		
		boolean opcioValida = false;
		boolean longitudValida = false;

		// demanem tipus de contrasenya

		do {
			// mostrem menu
			System.out.println(menu);
			opcioUsuari = entrada.nextLine().trim();

			switch (opcioUsuari) {
			case "1", "2", "3":
				opcioValida = true;
				break;
			default:
				System.out.println("Error, l'opció és incorrecta");
			}

		} while (!opcioValida);
		
		//establim la cadena de caràcters a utilitzar
		
		
		//ara demanem la longitud
		do {
			System.out.println("Introdueix un enter entre " + LIMIT_INFERIOR + " i " + LIMIT_SUPERIOR + ":");
			if (entrada.hasNextInt()) {
				longitud = entrada.nextInt();
				entrada.nextLine();
				if ((longitud >= LIMIT_INFERIOR) && (longitud <= LIMIT_SUPERIOR)) {
					longitudValida = true;
				} else {
					System.out.println("Error: el valor enter no està entre " + LIMIT_INFERIOR + " i " + LIMIT_SUPERIOR + ".");
				}
			} else {
				while (entrada.nextLine().equals("")) {}
				System.out.println("Error: l'entrada no és un enter");
			}
		} while (!longitudValida);
		
		// creem la contrasenya i la mostrem
		for(int i =0;i<longitud;i++) {
			//donem la mateixa probabilitat a lletres, números i símbols en cada cas
			
			switch(opcioUsuari) {
			case "1":
				contrasenya+=CONTRASENYA_NIVELL_1.charAt(aleatori.nextInt(CONTRASENYA_NIVELL_1.length()));
				break;
			case "2":
				probabilitat= aleatori.nextInt(2);
				switch(probabilitat) {
				case 0:
					contrasenya+=CONTRASENYA_NIVELL_1.charAt(aleatori.nextInt(CONTRASENYA_NIVELL_1.length()));
					break;
				case 1:
					contrasenya+=CONTRASENYA_NIVELL_2.charAt(aleatori.nextInt(CONTRASENYA_NIVELL_2.length()));
					break;
				}
				break;
			case "3":
				probabilitat= aleatori.nextInt(3);
				switch(probabilitat) {
				case 0:
					contrasenya+=CONTRASENYA_NIVELL_1.charAt(aleatori.nextInt(CONTRASENYA_NIVELL_1.length()));
					break;
				case 1:
					contrasenya+=CONTRASENYA_NIVELL_2.charAt(aleatori.nextInt(CONTRASENYA_NIVELL_2.length()));
					break;
				case 2:
					contrasenya+=CONTRASENYA_NIVELL_3.charAt(aleatori.nextInt(CONTRASENYA_NIVELL_3.length()));
					break;
				}
				break;
			}
			
			
		}
		
		System.out.println("La teua contrasenya de nivell "+opcioUsuari+" de longitud "+longitud+" caràcters:");
		System.out.println(contrasenya);
		
		//tanquem Scanner
		entrada.close();
		
	}

}
