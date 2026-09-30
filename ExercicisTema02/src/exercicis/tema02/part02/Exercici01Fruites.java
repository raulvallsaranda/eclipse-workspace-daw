package exercicis.tema02.part02;

import java.util.Scanner;

public class Exercici01Fruites {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		String fruitaUsuari = "";
		System.out.println("Introdueix el nom d'una fruita:");
		fruitaUsuari = entrada.nextLine();
		//comprovem si està buida o està formada per espais
		if(fruitaUsuari.trim().isEmpty()) {
			System.out.println("La cadena no pot estar buida.");
		}else {
			switch (fruitaUsuari.toUpperCase()) {
			case "BANANA", "PINYA", "XIRIMOIA", "MANGO":
				System.out.println("La fruita " + fruitaUsuari.toUpperCase() + " és una fruita tropical.");
				break;
			case "BRESQUILLA", "ALBERCOC", "PRUNA", "CIRERA":
				System.out.println("La fruita " + fruitaUsuari.toUpperCase() + " és una fruita de pinyol.");
				break;
			case "TARONJA", "POMELO", "LLIMA", "MANDARINA":
				System.out.println("La fruita " + fruitaUsuari.toLowerCase() + " és una fruita cítrica.");
				break;
			default:
				System.out.println("La fruita \"" + fruitaUsuari.toLowerCase() + "\" no la puc identificar.");
			}
			if(fruitaUsuari.length()<=3) {
				System.out.println("La paraula és curta ("+fruitaUsuari.length()+" lletres)");
			}else if((fruitaUsuari.length()>=4) && (fruitaUsuari.length()<=6)) {
				System.out.println("La paraula és mitjana ("+fruitaUsuari.length()+" lletres)");
			} else {
				System.out.println("La paraula és llarga ("+fruitaUsuari.length()+" lletres)");
			}
		}
		
		
		//tanquem scanner
		entrada.close();

	}

}
