package exercicis.tema02.part02;


import java.util.Scanner;

public class Exercici02LletraInicial {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		String nomUsuari = "";
		char primeraLletra = ' ';
		
		System.out.println("Introdueix el teu nom:");
		//obtenim el nom llevant espais de davant i darrere i passant-ho a minúscules
		nomUsuari = entrada.nextLine().toLowerCase().trim();
		
		//comprovem si la cadena està buida
		if(nomUsuari.isBlank()) {
			System.out.println("El nom no pot estar en blanc");
		}else {
			//la cadena no està buida, comprovem la primera lletra
			primeraLletra = nomUsuari.toLowerCase().charAt(0);
			//en funció del seu valor:
			switch(primeraLletra) {
			
			case 'a','b','c','d','e','f':			
				System.out.println("El nom "+nomUsuari+" comença per una lletra entre la A i la F.");
				break;
			case 'g','h','i','j','l','m','n','o','p':
				System.out.println("El nom "+nomUsuari+" comença per una lletra entre la G i la P.");
				break;
			case 'q','r','s','t','u','v','w','x','y','z':
				System.out.println("El nom "+nomUsuari+" comença per una lletra entre la Q i la Z.");
				break;
			case 'à','á','ä','è','é','ë','í','ì','ï','ò','ó','ö','ù','ú','ü':
				System.out.println("El nom "+nomUsuari+" comença per una vocal amb accent o dièresi.");
				break;
			default:
				System.out.println("El nom "+nomUsuari+" no comença per una lletra.");
			}					
		}
		//tanquem scanner
		entrada.close();
	}
}
