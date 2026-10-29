package tema03.arrays.exemples;

import java.util.Scanner;

public class ArrayCadenesOrdenades {

	private static int LONGITUD = 5;

	public static void main(String[] args) {

		// variables
		String[] cadenes = new String[LONGITUD];
		String cadena = "";
		String cadenaAux = "";
		int comptadorCadenes = 0;
		Scanner entrada = new Scanner(System.in);

		// demanar cadenes a l'usuari i ficar-les en un array

		while (comptadorCadenes < LONGITUD) {

			System.out.println("Introdueix la cadena (" + comptadorCadenes + "):");
			cadena = entrada.nextLine().trim();

			if (cadena.isBlank()) {
				System.out.println("Error: no pot estar buida");
			} else {
				cadenes[comptadorCadenes] = cadena;
				System.out.println("Cadena (" + comptadorCadenes + ") introduïda: " + cadena);
				comptadorCadenes++;
			}
		}

		// mostrem array en pantalla
		System.out.println("Array original:");
		for (int i = 0; i < cadenes.length; i++) {
			System.out.println(i + ") " + cadenes[i] + " ");
		}

		// ordenació de l'array
		for(int i =0;i<cadenes.length-1;i++) {
			for(int j = 0;j<cadenes.length-i-1;j++) {
				if(cadenes[j].compareToIgnoreCase(cadenes[j+1])>0) {
					//intercanvi
					cadenaAux= cadenes[j];
					cadenes[j]=cadenes[j+1];
					cadenes[j+1]=cadenaAux;					
				}
			}
		}
		
		

		System.out.println("Array ordenat:");
		// mostrem array en pantalla
		for (int i = 0; i < cadenes.length; i++) {
			System.out.println(i + ") " + cadenes[i] + " ");
		}

	}

}
