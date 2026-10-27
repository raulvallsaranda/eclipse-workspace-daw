package tema03.arrays.scanner;

import java.util.Random;
import java.util.Scanner;

public class NomsAlumnes {
	
	private static final int LONG_MINIMA = 3;

	public static void main(String[] args) {
		
		//declaració de variables
		String nom = "";
		Scanner entrada = new Scanner(System.in);
		Random aleatori = new Random();
		int nAlumnes = 0;
		int comptadorAlumnes = 0;
		boolean entradaValida = false;
		String[] alumnes;
		
		//demanar nombre a l'usuari (n)		
		do {
			System.out.println("Introdueix un enter major que 0");
			if(entrada.hasNextInt()) {
				nAlumnes = entrada.nextInt();
				entrada.nextLine();
				if(nAlumnes>=1) {
					entradaValida =true;
				} else {
					System.out.println("Error: el valor ha de ser major que 0");
				}
			} else {
				while(entrada.nextLine().equals("")) {}
				System.out.println("Error: el valor no és un enter");
			}
			
		} while(!entradaValida);
		
		System.out.println("Quantitat de noms a demanar: "+nAlumnes);
		
				
		//declarar l'array de longitud n
		alumnes = new String[nAlumnes];
		
		
		//demanar a l'usuari n noms
		while(comptadorAlumnes<nAlumnes) {
			
			//demane nom
			System.out.println("Escriu el nom d'un alumne:");
			nom = entrada.nextLine();
			
			//comprove si és correcte
			if(nom.length()>=LONG_MINIMA) {
				alumnes[comptadorAlumnes]=nom;
				System.out.println("Alumne("+(comptadorAlumnes+1)+"): "+nom);
				comptadorAlumnes++;
			}else {
				System.out.println("Error: nom incorrecte");
			}
			
		}

		
		//triar un nom aleatori de l'array
		
		
		
		//ficar en pantalla array
		System.out.print("Array d'alumnes: ");
		for(int i=0;i<alumnes.length;i++) {
			System.out.print(alumnes[i]+" ");
		}
		System.out.println();
		
		
		//ficar en pantalla usuari aleatori amb missatge
		

	}

}
