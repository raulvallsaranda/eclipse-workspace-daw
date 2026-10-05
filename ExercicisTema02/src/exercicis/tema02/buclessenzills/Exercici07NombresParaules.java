package exercicis.tema02.buclessenzills;

import java.util.Scanner;

public class Exercici07NombresParaules {

	public static void main(String[] args) {
		// declaracions
		int nombreUsuari = 0;
		int divisio = 0;
		int resta = 0;
		String cadena = "";
		Scanner entrada = new Scanner(System.in);

		System.out.println("Introdueix un nombre enter positiu major o igual a 1:");
		if (entrada.hasNextInt()) {
			nombreUsuari = entrada.nextInt();
			entrada.nextLine();
			if (nombreUsuari >= 1) {
				System.out.print(nombreUsuari + " = ");

				divisio = nombreUsuari;
				resta = nombreUsuari % 10;
				while (divisio >= 10) {
					switch (resta) {
					case 9:
						cadena = " nou" + cadena;
						break;
					case 8:
						cadena = " huit" + cadena;
						break;
					case 7:
						cadena = " set" + cadena;
						break;
					case 6:
						cadena = " sis" + cadena;
						break;
					case 5:
						cadena = " cinc" + cadena;
						break;
					case 4:
						cadena = " quatre" + cadena;
						break;
					case 3:
						cadena = " tres" + cadena;
						break;
					case 2:
						cadena = " dos" + cadena;
						break;
					case 1:
						cadena = " u" + cadena;
						break;
					case 0:
						cadena = " zero" + cadena;
						break;
					}

					// actualitzem valors de la divisió

					divisio = divisio / 10;
					resta = divisio % 10;

				}
				//la divisió ja és menor que 10
				//només ens queda mostrar l'última resta
				switch (resta) {
				case 9:
					cadena = " nou" + cadena;
					break;
				case 8:
					cadena = " huit" + cadena;
					break;
				case 7:
					cadena = " set" + cadena;
					break;
				case 6:
					cadena = " sis" + cadena;
					break;
				case 5:
					cadena = " cinc" + cadena;
					break;
				case 4:
					cadena = " quatre" + cadena;
					break;
				case 3:
					cadena = " tres" + cadena;
					break;
				case 2:
					cadena = " dos" + cadena;
					break;
				case 1:
					cadena = " u" + cadena;
					break;
				case 0:
					cadena = " zero" + cadena;
					break;
				}
				// mostrem la cadena que hem anat acumulant
				System.out.println(cadena);

			} else {
				System.out.println("Error: el nombre enter no pot ser negatiu o zero");
			}
		} else {
			System.out.println("Error: el valor introduït no és un enter");
		}

	}

}
