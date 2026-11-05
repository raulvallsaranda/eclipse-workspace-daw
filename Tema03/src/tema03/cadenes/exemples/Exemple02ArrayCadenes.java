package tema03.cadenes.exemples;

import java.util.Scanner;

public class Exemple02ArrayCadenes {
	
	private static final int LONGITUD = 5;

	public static void main(String[] args) {
		//String[] cadenes = {"Xàtiva", "Ontinyent", "Lloc Nou d’En Fenollet", "Ibi"};
		String[] cadenes = new String[LONGITUD];
		int comptadorCadenes = 0;
		boolean cadenaValida = false;
		String cadena = "";
		Scanner entrada = new Scanner(System.in);
		//demanar a l'usuari 5 cadenes
		
		while(comptadorCadenes < cadenes.length) {			
			cadenaValida = false;
			do {
				System.out.println("Escriu una cadena que no estiga buida:");
				cadena = entrada.nextLine().trim();
				if(cadena.isBlank()) {
					System.out.println("Error: no pot estar buida");
				} else {
					cadenes[comptadorCadenes]=cadena;
					cadenaValida=true;
				}				
			} while(!cadenaValida);
			comptadorCadenes++ ;			
		}	
		entrada.nextLine();
		
		
		for(int i =0;i<cadenes.length;i++) {
			if(i==cadenes.length-1) {
				System.out.print(cadenes[i]);
			} else {
				System.out.print(cadenes[i]+", ");
			}			
		}
		System.out.println();
		
		for(int i =0;i<cadenes.length;i++) {			
				System.out.println(cadenes[i]+" "+cadenes[i].length());						
		}
		
		System.out.println("Introdueix el teu nom:");
		String nom = entrada.nextLine();
		System.out.println("El teu nom: "+nom);
		

	}

}
