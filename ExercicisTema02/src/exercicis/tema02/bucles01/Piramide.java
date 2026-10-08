package exercicis.tema02.bucles01;

import java.util.Scanner;

public class Piramide {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int numero = 0;
		String cadenaFila="";
		boolean entradaValida = false;


		/* mentre l'usuari no introduïsca un enter vàlid
		 * continuem demanant el valor
		 */
		
		//primera part: demanar número a l'usuari
		do {
			//demanar número
			System.out.println("Introdueix un número enter positiu");
			if(entrada.hasNextInt()) {
				numero = entrada.nextInt();
				entrada.nextLine();
				if(numero>0) {
					System.out.println("El número "+numero+" és correcte");
					entradaValida = true;
					
				} else {
					System.out.println("Error ha de ser un valor positiu");
				}
				
			} else {
				// per evitar intros múltiples de l'usuari
				while(entrada.nextLine().equals("")){}; 
				System.out.println("Error: no és un enter vàlid");
			}
		} while(!entradaValida);
		
		
		
		
		
		
		
		
		//farem tantes files com indique el número
		//amb un bucle per fila, un bucle per als espais i altre per als asteriscs
		/*for (int i = numero; i > 0; i--) {
			//a cada fila, afegimtants espais com indique el número menys 1 i anem restant
			for (int j = i-1; j > 0; j--) {
				cadenaFila+="-";				
			}
			// a cada fila el número d'estrelles comença en 1 i va creixent de 2 en 2 estrelles = 2*k+1
			for (int k = 0; k<((2*(numero-i))+1); k++) {
				cadenaFila+='*';
			}
			System.out.println(cadenaFila);
			cadenaFila="";
		}*/
		
		for (int i = 0; i < numero; i++) {
			//a cada fila, afegimtants espais com indique el número menys 1 i anem restant
			for (int j = numero-i-1; j > 0; j--) {
				System.out.print("-");				
			}
			// a cada fila el número d'estrelles comença en 1 i va creixent de 2 en 2 estrelles = 2*k+1
			for (int k = 0; k<((2*i)+1); k++) {
				System.out.print('*');
			}
			System.out.println();
		}
		//amb 1 bucle per fila i un altre per a espais i asteriscs
		/*for(int i = 0;i<numero;i++) {
			for(int j=numero;j<=(2*numero+i-1);j++) {
				if(j<(numero+numero-i-1)) {
					cadenaFila+=" ";
				}else {
					cadenaFila+='*';
				}
			}
			System.out.println(cadenaFila);
			cadenaFila="";
		}*/
		//Tanquem Scanner
		entrada.close();

	}

}
