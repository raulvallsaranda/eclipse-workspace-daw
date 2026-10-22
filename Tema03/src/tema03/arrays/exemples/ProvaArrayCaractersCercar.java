package tema03.arrays.exemples;

import java.util.Scanner;

public class ProvaArrayCaractersCercar {

	public static void main(String[] args) {
		//declaracions
		char[] arrayCaracters =	 {'a', '0', 'g', ';', 'w', 'o', 'h', '+', 'x', 's'};
		Scanner entrada = new Scanner(System.in);
		boolean entradaValida = false;
		boolean caracterTrobat = false;
		int posicio = 0;
		String cadenaUsuari = "";
		
		//demanar a l'usuari
		do {
			System.out.println("Introdueix un caràcter");
			cadenaUsuari = entrada.nextLine().trim();
			if(cadenaUsuari.isBlank()) {
				System.out.println("Error: La cadena no pot estar buida");
			}else if (cadenaUsuari.length()==1) {
				entradaValida=true;
			}else {
				System.out.println("Error: la cadena té més d'un caràcter");
			}			
		}while(!entradaValida);
		
		System.out.println("Caràcter usuari: "+cadenaUsuari);
		
		//buscar caràcter
		for(int i=0;i<arrayCaracters.length;i++) {
			if(cadenaUsuari.charAt(0)==arrayCaracters[i]) {
				caracterTrobat = true;
				posicio = i;
				break;
			}			
		}
		
		
		//mostrar missatge
		if(caracterTrobat) {
			System.out.println("El caràcter "+cadenaUsuari+" sí que està en l'array");
			System.out.println("En la posició "+posicio);
		} else {
			System.out.println("El caràcter "+cadenaUsuari+" no està en l'array");

		}
		
	}

}
