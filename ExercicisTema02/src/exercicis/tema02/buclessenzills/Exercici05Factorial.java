package exercicis.tema02.buclessenzills;

import java.util.Scanner;

public class Exercici05Factorial {

	public static void main(String[] args) {
		
		//declaracions
				int nombreUsuari = 0;
				int factorial = 1; //iniciem a valor neutre de la multiplicació.
				Scanner entrada = new Scanner(System.in);
				
				System.out.println("Introdueix un nombre enter positiu major o igual a 1:");
				if(entrada.hasNextInt()) {
					nombreUsuari = entrada.nextInt();
					entrada.nextLine();
					if(nombreUsuari>=1) {
						for(int i=1;i<=nombreUsuari;i++) {
							factorial*=i;
						}
						System.out.println("El valor del factorial de "+nombreUsuari+" és: "+factorial);
					} else {
						System.out.println("Error: el nombre enter no pot ser negatiu o zero");
					}
				} else {
					System.out.println("Error: el valor introduït no és un enter");
				}


	}

}
