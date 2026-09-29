package exercicis.tema02.part03;

import java.util.Scanner;

public class ComprovaParaula {

	public static void main(String[] args) {
		
		//declaració de variables
		String cadena01 = "";
		String cadena02 = "";
		
		Scanner entrada = new Scanner(System.in);
		
		//demanem primera cadena a l'usuari
		System.out.println("Introdueix la primera cadena:");
		cadena01= entrada.nextLine();
		
		if (cadena01.isBlank() || cadena01.isEmpty()) {
			System.out.println("La primera cadena no pot estar buida");
		} else {
			//hem de demanar la segona cadena
			//demanem segona cadena a l'usuari
			System.out.println("Introdueix la segona cadena:");
			cadena02= entrada.nextLine();
			if (cadena02.isBlank() || cadena02.isEmpty()) {
				System.out.println("La segona cadena no pot estar buida");
			} else {
				//fem les comprovacions  //cadena01.toLowerCase().charAt(0)
				//comença per aA
				if(cadena01.charAt(0)=='a' || cadena01.charAt(0)=='A') {
					System.out.println("La cadena "+cadena01+ " comença per [aA]");
				}else {
					System.out.println("La cadena "+cadena01+ " no comença per [aA]");
				}
				//acaba amb rR
				if(cadena01.charAt(cadena01.length()-1)=='r' || cadena01.charAt(cadena01.length()-1)=='R') {
					System.out.println("La cadena "+cadena01+ " acaba amb [rR]");
				}else {
					System.out.println("La cadena "+cadena01+ " no acaba amb [rR]");
				}
				//conté un dígit
				if(cadena01.contains("0") || cadena01.contains("1") || cadena01.contains("2")|| cadena01.contains("3") ||
				   cadena01.contains("4") || cadena01.contains("5")	|| cadena01.contains("6")|| cadena01.contains("7") ||
				   cadena01.contains("8")|| cadena01.contains("9")) {
					System.out.println("La cadena "+cadena01+ " conté un dígit");
				}else {
					System.out.println("La cadena "+cadena01+ " no conté un dígit");
				}
				//conté l'altra cadena
				if(cadena01.contains(cadena02)) {
					System.out.println("La cadena "+cadena01+ " conté la cadena "+cadena02);
				}else {
					System.out.println("La cadena "+cadena01+ " no conté la cadena "+cadena02);
				}
				
			}
			
		}
		
		//tanquem Scanner
		entrada.close();

	}

}
