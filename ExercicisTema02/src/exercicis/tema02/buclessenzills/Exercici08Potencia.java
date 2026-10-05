package exercicis.tema02.buclessenzills;

import java.util.Scanner;

public class Exercici08Potencia {

	public static void main(String[] args) {

		// declaracions
		int base = 0;
		int potencia = 0;
		int resultat = 1; // valor neutre multiplicació
		String cadena ="";
		Scanner entrada = new Scanner(System.in);

		// demanem valors a l'usuari
		System.out.println("Introdueix un nombre enter (base):");
		if (entrada.hasNextInt()) {
			base = entrada.nextInt();
			entrada.nextLine();
			System.out.println("Introdueix un altre nombre enter (potència):");
			if (entrada.hasNextInt()) {
				potencia = entrada.nextInt();
				entrada.nextLine();
				cadena= base + " elevat a "+potencia +" = ";
				// calculem la potència
				for(int i = 0;i<potencia;i++) {
					resultat*=base;
					if(i==potencia-1) {
						cadena+=base;
					}else {
						cadena+=base+" * ";
					}
				}
				cadena += " = "+resultat;
				System.out.println(cadena);
			} else {
				System.out.println("Error: el valor introduït no és un enter");
			}

		} else {
			System.out.println("Error: el valor introduït no és un enter");
		}

	}

}
