package tema03.arrays.scanner;

import java.util.Scanner;

public class ProvaScannerNext {

	public static void main(String[] args) {
		
		String cadena = "";
		int num = 0;
		double doble = 0.0;
		Scanner entrada = new Scanner(System.in);
		System.out.println("Introdueix enters, acaba amb 1000");
		do {
			if(entrada.hasNextInt()) {
				num = entrada.nextInt();
				System.out.println("Enter introduit: "+num);
				//entrada.next()
			} else {
				if(entrada.hasNextDouble()) {
					doble = entrada.nextDouble();
					System.out.println("double introduit: "+doble);
				} else {
					cadena=entrada.next();
					System.out.println("Valor incorrecte: "+cadena);
				}
				
			}
			
			
		} while (num!=1000);
		
		System.out.println("Fi del programa");
		entrada.close();

	}

}
