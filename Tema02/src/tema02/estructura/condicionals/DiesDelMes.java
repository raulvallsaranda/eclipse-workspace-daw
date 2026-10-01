package tema02.estructura.condicionals;

import java.util.Scanner;

public class DiesDelMes {

	public static void main(String[] args) {

		//variable per introduir el número del mes
		int mes = 0;
		//Scanner per a l'entrada pel teclat
		Scanner entrada = new Scanner(System.in);

		//demanem el valor a l'usuari
		System.out.println("Introdueix un mes (1-12):");
		//comprovem que  és un enter
		if (entrada.hasNextInt()) {
			//obtenim el valor del mes
			mes = entrada.nextInt();
			//netegem el buffer
			entrada.nextLine();
			//comprovem el valor del mes
			switch (mes) {
			case 2: //febrer, 28 o 29 dies
				System.out.println("El mes té 28 o 29 dies");
				break;
			case 4, 6, 9, 11: //mesos amb 30 dies
				System.out.println("El mes té 30 dies");
				break;
			case 1, 3, 5, 7,8,10,12: //mesos amb 31 dies
				System.out.println("El mes té 31 dies");
				break;
			default: //valor fora del rang
				System.out.println("El número està fora de rang (1-12)");
			}

		} else {
			//error l'entrada no és un enter
			System.out.println("No has introduït un enter");
		}

	}

}
