package exercicis.puntuables.tema02;

import java.util.Scanner;

public class Exercici01NomTriangle {

	private static final int LONG_MIN = 5;
	private static final int LONG_MAX = 10;
	
	
	public static void main(String[] args) {
	
		String nom = "";
		Scanner entrada = new Scanner(System.in);
		boolean entradaValida = false;
		int comptador = 0;
		int comptadorFiles = 0;
		
		//demanem nom
		do {
			System.out.println("Escriu el teu nom, entre "+LONG_MIN+" i "+LONG_MAX+" caràcters");
			nom = entrada.nextLine().trim();
			if(nom.isBlank()) {
				System.out.println("Error: no pot estar buit");
			} else if (nom.length()>=LONG_MIN && nom.length()<=LONG_MAX) {
				entradaValida = true;
			} else {
				System.out.println("Error: longitud del nom ("+nom.length()+") incorrecta.");
			}
		} while(!entradaValida);

		System.out.println("El teu nom: "+nom+", longitud: "+nom.length());
		
		for(int i=0;i<nom.length();i++) {
			for(int j=0;j<=i;j++) {
				if(j%2==0) {
					System.out.print((""+nom.charAt(i)).toLowerCase());
				} else {
					System.out.print((""+nom.charAt(i)).toUpperCase());
				}
				comptador++;
			}
			comptadorFiles++;
			System.out.print("-"+comptadorFiles);
			System.out.println();
			
		}
		for(int i=nom.length()-2;i>=0;i--) {
			for (int j=0;j<=i;j++) {
				if(j%2==0) {
					System.out.print((""+nom.charAt(i)).toLowerCase());
				} else {
					System.out.print((""+nom.charAt(i)).toUpperCase());
				}
				comptador++;
			}
			comptadorFiles++;
			System.out.print("-"+comptadorFiles);
			System.out.println();
			
		}
		System.out.println("---------------------------------------");
		System.out.println("Quantitat total de caràcters: "+comptador);
		System.out.println("Quantitat total de files: "+comptadorFiles);

	}

}
