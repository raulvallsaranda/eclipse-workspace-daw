package tema01.tipus.enters;

import java.util.Scanner;

public class ProvaEntrada {

	public static void main(String[] args) {

		// declaració de variables
		double numero1 = 0.0;
		double numero2 = 0.0;
		double suma = 0.0;
		String missatge = "";

		// associem variable entrada al teclat
		Scanner entrada = new Scanner(System.in);

		// missatge a l'usuari
		System.out.println("Dona'm el primer número");
		// esperem que l'usuari escriga un enter
		// i el guardem en la variable a
		numero1 = entrada.nextDouble();
		// fica en pantalla el valor introduït per l'usuari
		System.out.println("Número 1: " + numero1);

		// missatge a l'usuari
		System.out.println("Dona'm el segon número");
		// esperem que l'usuari escriga un enter
		// i el guardem en la variable a
		numero2 = entrada.nextDouble();
		// fica en pantalla el valor introduït per l'usuari
		System.out.println("Número 2: " + numero2);

		// realitze la suma
		suma = numero1 + numero2;

		// mostre en pantalla
		System.out.println("La suma és: " + suma);

		//resetegem scanner
		entrada.nextLine();
		
		// demana cadena a l'usuari
		System.out.println("Escriu un missatge:");
		// obtenir la cadena
		missatge=entrada.nextLine();
		// mostre en pantalla
		System.out.println("El missatge és: " + missatge);
		
		// tanque Scanner
		entrada.close();

	}

}
