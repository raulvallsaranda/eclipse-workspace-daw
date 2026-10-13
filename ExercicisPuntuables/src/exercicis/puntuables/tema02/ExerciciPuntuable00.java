package exercicis.puntuables.tema02;

import java.util.Scanner;

public class ExerciciPuntuable00 {
	
	private static final int LIMIT_INFERIOR = 1;
	private static final int LIMIT_SUPERIOR = 18;
	private static final int VALOR_MINIM = 1;
	private static final int VALOR_MAXIM = 99;

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		int numero1 = 0;
		int numero2 = 0;
		boolean numero1Valid = false;
		int desenes = 0;
		int unitats = 0;
		int quantitatSuma = 0;
		
		do {
			System.out.println("Introdueix un enter entre "+LIMIT_INFERIOR+" i "+LIMIT_SUPERIOR);
			if(entrada.hasNextInt()) {
				numero1 = entrada.nextInt();
				entrada.nextLine();
				if((numero1>=LIMIT_INFERIOR)&&(numero1<=LIMIT_SUPERIOR)) {
					numero1Valid=true; //ja tenim valor correcte					
				} else {
					System.out.println("Error: l'enter no està entre "+LIMIT_INFERIOR+" i "+LIMIT_SUPERIOR);
				}				
			} else {
				while(entrada.nextLine().equals("")) {}
				System.out.println("Error: l'entrada no és un enter");
			}			
		} while(!numero1Valid);
		
		//càlculs suma dels dígits
		for(int i = VALOR_MINIM;i<=VALOR_MAXIM;i++) {
			if(i<10) {
				if(i==numero1) {
					System.out.println("Dígits sumen "+numero1+": "+i);
					quantitatSuma++;
				}
			} else {
				desenes = i / 10;
				unitats = i % 10;
				if((desenes + unitats)==numero1) {
					System.out.println("Dígits sumen "+numero1+": "+i);
					quantitatSuma++;
				}
			}
		}
		
		System.out.println("En total hi ha "+quantitatSuma+" números que sumen "+numero1);

		//tanquem Scanner
		entrada.close();
		

	}

}
