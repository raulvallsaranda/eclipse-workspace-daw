package tema02.estructura.bucles;

import java.util.Scanner;

public class HolaMon {
	
	private static final int LIMIT = 20;

	public static void main(String[] args) {
		
		int limit = 0;
		//inicialitzar comptador
		int i = 0;
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Introdueix el límit");
		if(entrada.hasNextInt()) {			
			limit = entrada.nextInt();
			entrada.nextLine();
			
			//condició del bucle
			while(i<limit) {				
				System.out.println(i+" Hola Món!");
				//increment del comptador
				i++;				
			}
			System.out.println("S'ha acabat el bucle");
		} else {
			System.out.println("VAlor erroni");
		}
		
		

	}

}
