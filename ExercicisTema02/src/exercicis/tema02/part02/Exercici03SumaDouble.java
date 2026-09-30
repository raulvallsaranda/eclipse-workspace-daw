package exercicis.tema02.part02;


import java.util.Scanner;

public class Exercici03SumaDouble {
	
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		double numero01 = 0.0;
		double numero02 = 0.0;
		double suma = 0.0;
		boolean numeroValid = false;

		// demanem el primer número
		do {
			System.out.println("Introdueix el primer número real");
			if (entrada.hasNextDouble()) {
				numero01 = entrada.nextDouble();
				entrada.nextLine();
				// número correcte ( no hi ha rang a comprovar )
				numeroValid = true; // ja podem eixir del bucle

			} else {
				while (entrada.nextLine().equals("")) {
				}
				System.out.println("El valor introduït és incorrecte");
			}

		} while (!numeroValid);

		// resetegem boolean
		numeroValid = false;

		// demanem el segon número
		do {
			System.out.println("Introdueix el segon número real");
			if (entrada.hasNextDouble()) {
				numero02 = entrada.nextDouble();
				entrada.nextLine();
				// número correcte ( no hi ha rang a comprovar )
				numeroValid = true; // ja podem eixir del bucle

			} else {
				while (entrada.nextLine().equals("")) {
				}
				System.out.println("El valor introduït és incorrecte");
			}

		} while (!numeroValid);
		
		//realitzem les operacions
		suma  = numero01 +numero02;
		if(suma<0) {
			System.out.println("La suma dels valors és negativa: "+numero01+" + "+numero02+" = "+suma);
		}else if(suma==0) {
			System.out.println("La suma dels valors  és 0: "+numero01+" + "+numero02+" = "+suma);
		}else {
			System.out.println("La suma dels valors és positiva: "+numero01+" + "+numero02+" = "+suma);

		}
		
		//tanquem scanner
		entrada.close();
	}
	

}
