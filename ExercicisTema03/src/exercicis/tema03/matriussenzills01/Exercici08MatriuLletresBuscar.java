package exercicis.tema03.matriussenzills01;

import java.util.Random;
import java.util.Scanner;

public class Exercici08MatriuLletresBuscar {
	
	private static final int N = 10; // mida matriu

	private static final String LLETRES = "ABCÇDEFGHIJKLMNOPQRSTUVWXYZ";

	public static void main(String[] args) {
		
		//declaració de variables
		String[][] matriu = new String[N][N];
		Scanner entrada = new Scanner(System.in);
		int comptaLletra = 0;
		String lletraUsuari = "";
		Random aleatori = new Random();
		boolean entradaValida = false;
		
		//generem la matriu
		for (int i = 0; i < matriu.length; i++) {
			for (int j = 0; j < matriu[i].length; j++) {
				matriu[i][j] = "" + LLETRES.charAt(aleatori.nextInt(LLETRES.length()));
			}
		}
		//mostrem la matriu
		System.out.println("Matriu "+N+"x"+N+":");
		for (int i = 0; i < matriu.length; i++) {
			for (int j = 0; j < matriu[i].length; j++) {
				System.out.print(matriu[i][j] + " ");
			}
			System.out.println();
		}
		//demanar lletra a l'usuari
		do {
			System.out.println("Introdueix una lletra:");
			lletraUsuari = entrada.nextLine().trim().toUpperCase();
			if(lletraUsuari.isBlank()) {
				System.out.println("Error: no pots deixar-ho en blanc");
			}else if(lletraUsuari.length()>1) {
				System.out.println("Error: només has de ficar una lletra");
			} else if(!LLETRES.contains(lletraUsuari)) {
				System.out.println("El caràcter introduït no és una lletra");
			} else {
				entradaValida=true;
			}			
		}while(!entradaValida);
		//mostrem la lletra triada
		System.out.println("Lletra triada: "+lletraUsuari);

		//busquem la lletra en la matriu (majúscules) i fiquem les posicions.
		for(int i=0;i<matriu.length;i++) {
			for(int j=0;j<matriu[i].length;j++) {
				if(matriu[i][j].equals(lletraUsuari)) {
					System.out.println("Lletra "+lletraUsuari+" trobada en posició ["+i+","+j+"]");
					comptaLletra++;
				}
			}
		}
		
		//mostrem recompte
		if(comptaLletra==0) {
			System.out.println("No s'ha trobat la lletra "+lletraUsuari+" en la matriu");
		} else {
			System.out.println("S'ha trobat la lletra "+lletraUsuari+" en la matriu "+comptaLletra+" vegades");
		}
		
		//tanquem Scanner
		entrada.close();
		
	}

}
