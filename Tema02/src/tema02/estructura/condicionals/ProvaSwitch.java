package tema02.estructura.condicionals;

import java.util.Scanner;

public class ProvaSwitch {

	public static void main(String[] args) {

		String nom = "";

		Scanner entrada = new Scanner(System.in);

		System.out.println("Escriu un nom:");

		nom = entrada.nextLine();

		switch (nom) {
		case "ANNA","Anna","anna":
			System.out.println("Hola Anna");
			break;
		case "PEPET":
			System.out.println("Hola Pepet");
			break;
		case "MARIA":
			System.out.println("Hola Maria");
			break;
		default:
			System.out.println("Hola... qui sigues");

		}

	}

}
