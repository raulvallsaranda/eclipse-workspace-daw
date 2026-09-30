package tema02.estructura.condicionals;

import java.util.Scanner;

public class MenuOperacions {
	
	private static final String menu = "Menú operacions:\n"
			+ "----------------\n"
			+ "1) Suma\n"
			+ "2) Resta\n"
			+ "3) Multiplicació\n"
			+ "4) Divisió\n"
			+ "----------------\n"
			+ "Tria una opció:";

	public static void main(String[] args) {		
			
		String opcio = "";
		int numero1 = 0;
		int numero2 = 0;
		Scanner entrada = new Scanner(System.in);
		System.out.println("Introdueix el primer enter:");
		if(entrada.hasNextInt()) {
			numero1 = entrada.nextInt();
			entrada.nextLine();
			System.out.println("Primer número: "+numero1);
			System.out.println("Introdueix el segon enter:");
			if(entrada.hasNextInt()) {
				numero2 = entrada.nextInt();
				entrada.nextLine();
				System.out.println("Segon número: "+numero2);
				System.out.println(menu);
				
			} else {
				System.out.println("Error: no és un enter");
			}
			
		} else {
			System.out.println("Error: no és un enter");
		}
		
		
		entrada.close();

		
		


	}

}
