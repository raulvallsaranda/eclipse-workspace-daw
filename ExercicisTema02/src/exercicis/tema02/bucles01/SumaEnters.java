package exercicis.tema02.bucles01;

import java.util.Scanner;

public class SumaEnters {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int numero = 0;
		String cadenaEixida = "";
		boolean sumaSuperada = false;
		int acumulador = 0; // per anar sumant els enters
		int i = 0; // comptador per als números enters a sumar
		// demanem un número enter
		// resetegem el semàfor
		boolean entradaValida = false;

		// Demanem a l'usuari el segon número enter
		do {
			System.out.println("Introdueix un número enter positiu ");
			if (entrada.hasNextInt()) {
				// si l'enter és vàlid, l'obtenim
				numero = entrada.nextInt();
				// en tot cas, buidem el buffer
				entrada.nextLine();
				// valor vàlid, ha de ser >0
				if (numero >= 0) {
					System.out.println("Has introduït el número: "+numero);
					// canviem el valor del semàfor per poder eixir del bucle
					entradaValida = true;
				} else {
					System.out.println("El valor enter ha de ser positiu ");
				}
			} else {
				// per controlar valors Intro consecutius no desitjats
				while (entrada.nextLine().equals("")) {
				}
				System.out.println("No has introduït un valor enter");
			}

		}while (!entradaValida);
		//Preparem la cadena d'eixida per mostrar el resultat
		cadenaEixida = "Número " + numero + ": cal sumar ";
		while (!sumaSuperada) {
			if (acumulador + i <= numero) {
				acumulador += i;
				cadenaEixida += i + " ";
				i++;
			} else {
				sumaSuperada = true;
			}
		}
		cadenaEixida += "per obtenir el número " + acumulador;
		System.out.println(cadenaEixida);
		entrada.close();
	}

}
