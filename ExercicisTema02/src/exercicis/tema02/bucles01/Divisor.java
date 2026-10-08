package exercicis.tema02.bucles01;

import java.util.Scanner;

public class Divisor {

	public static final int LIMIT_DIVISOR = 2;

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int numero = 0;
		int divisor = 0;
		boolean divisorTrobat = false;
		// demanem primer número i ens assegurem que és un enter
		boolean entradaValida = false;
		// Demanem a l'usuari el número per buscar divisors
		do {
			System.out.println("Introdueix un número enter major o igual que " + LIMIT_DIVISOR);
			if (entrada.hasNextInt()) {
				// si l'enter és vàlid, l'obtenim
				numero = entrada.nextInt();
				// en tot cas, buidem el buffer
				entrada.nextLine();
				if (numero >= 2) {
					// actualitzem el valor del semàfor
					entradaValida = true;
					System.out.println("Has introduït el número. "+numero);
				} else {
					// Mostrem el valor
					System.out.println("El valor ha de ser major o igual que " + LIMIT_DIVISOR);
				}

			} else {
				// per controlar valors Intro consecutius no desitjats
				while (entrada.nextLine().equals("")) {
				}
				System.out.println("No has introduït un valor enter");
			}

		} while (!entradaValida);
		// comencem a provar pel número immediatament anterior al que ens passen
		divisor = numero - 1; 
		// hem de trobar el divisor: provarem tots els números fins arribar al 2, en el
		// moment que siga divisible, eixim del bucle
		// si arribem al número 2 no n'hem trobat, és primer.
		while ((!divisorTrobat) && (divisor > 1)) {
			//si el mòdul és 0, acabem, hem trobat el divisor
			if (numero % divisor == 0) {
				divisorTrobat = true;
			} else {
				divisor--; // anem provant el següent número, l'anterior al previ
			}
		}

		if (divisorTrobat) {
			System.out.println("El major divisor de " + numero + " és : " + divisor);
		} else {
			System.out.println("No s'ha trobat cap divisor de " + numero + ", és un nombre primer");
		}
		entrada.close();

	}

}
