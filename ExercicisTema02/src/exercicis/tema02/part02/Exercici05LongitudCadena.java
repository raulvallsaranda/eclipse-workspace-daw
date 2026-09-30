package exercicis.tema02.part02;


import java.util.Scanner;

public class Exercici05LongitudCadena {

	public static void main(String[] args) {
		
		//declaració i inicialització de variables
		Scanner entrada = new Scanner(System.in);
		String fraseUsuari = "";
		
		//demanem una cadena a l'usuari
		//comprovem que no estiga buida
		do {
			System.out.println("Escriu una frase:");
			fraseUsuari= entrada.nextLine().trim();
			if(fraseUsuari.isEmpty()) {
				System.out.println("La frase no pot estar buida");
			}
		}while(fraseUsuari.isEmpty());
		
		//comprovem si conté la paraula simarro
		if(fraseUsuari.toLowerCase().contains("simarro")) {
			System.out.println("SIMARRO");
		}else if(fraseUsuari.length()<10){
			//si la longitud és menor que 10
			System.out.println(fraseUsuari.toUpperCase()+" Longitud:"+fraseUsuari.length());
			
		} else if(fraseUsuari.length()<=15) {
			//si la longitud està entre 10 i 15
			System.out.println(fraseUsuari.toLowerCase()+" Longitud:"+fraseUsuari.length());
		} else {
			//més de 15 caràcters
			System.out.println("LA FRASE ÉS MOLT LLARGA"+" Longitud:"+fraseUsuari.length());
		}

		//tanquem scanner
		entrada.close();
	}

}
