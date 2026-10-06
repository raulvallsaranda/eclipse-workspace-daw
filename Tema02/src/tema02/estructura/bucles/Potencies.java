package tema02.estructura.bucles;

import java.util.Scanner;

public class Potencies {

	public static void main(String[] args) {
		
		//declaracions
		Scanner entrada = new Scanner(System.in);
		int limit = 0;
		int potencia = 0;
		
		//demanar a l'usuari
		System.out.println("Introdueix un valor enter major que 0");
		if(entrada.hasNextInt()) {
			limit = entrada.nextInt();
			entrada.nextLine();
			if(limit>0) {
				System.out.println("Introdueix un valor per calcular les potències");
				if(entrada.hasNextInt()) {
					potencia = entrada.nextInt();
					entrada.nextLine();
					//mostrem les potències
					for(int i = potencia;i<limit;i*=potencia) {
						System.out.println(i);
					}
					
				} else {
					System.out.println("Error, el valor no és un enter");
				}				
				
			} else {
				System.out.println("Error, el valor no és positiu");
			}
		} else {
			System.out.println("Error, el valor no és un enter");
		}
	}

}
