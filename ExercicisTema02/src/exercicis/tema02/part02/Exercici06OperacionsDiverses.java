package exercicis.tema02.part02;


import java.util.Random;
import java.util.Scanner;

public class Exercici06OperacionsDiverses {
	public static final int LIMIT_INFERIOR = 0;
	public static final int LIMIT_SUPERIOR = 1000000;

	public static void main(String[] args) {

		//declaració i inicialització de variables
		Scanner entrada = new Scanner(System.in);
		int valorUsuari = 0;
		int restaDivisio = 0;
		String numeroInvertit ="";
		boolean valorCorrecte = false;
		String lletres = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		Random aleatori = new Random();
		char lletra01  = ' ';
		char lletra02  = ' ';
		char lletra03  = ' ';
		//demanem el número a l'usuari
		do {
			System.out.println("Introdueix un enter entre "+LIMIT_INFERIOR+" i "+LIMIT_SUPERIOR+":");
			if(entrada.hasNextInt()) {
				//obtenim el valor i netegem el buffer
				valorUsuari = entrada.nextInt();
				entrada.nextLine();
				//comprovem si està entre els límits
				if((valorUsuari>=LIMIT_INFERIOR) && (valorUsuari<=LIMIT_SUPERIOR)) {
					//valor correcte
					valorCorrecte=true;
				}else {
					System.out.println("El valor no està dins del rang demanat");
				}
				
			} else {
				//valor incorrecte
				//evitem l'efecte de diversos intro a l'entrada
				while(entrada.nextLine().equals("")) {}
				System.out.println("Entrada incorrecta");
			}
			
		}while(!valorCorrecte);
		
		//hem de comprovar la quantitat de dígits que té el número
		if((valorUsuari>=100)&&(valorUsuari<=999)) { //3 dígits
			//mostrar el número i indicar si és parell/imparell
			System.out.println("El número introduït és el: "+valorUsuari);
			if(valorUsuari%2==0) {
				System.out.println("És un número parell");
			}else {
				System.out.println("És un número imparell");
			}
		}else if((valorUsuari>=1000)&& (valorUsuari<=9999)) {// 4 dígits
			//mostrar 3 lletres aleatòries i el número
			
			lletra01 = lletres.charAt(aleatori.nextInt(0,lletres.length()));
			lletra02 = lletres.charAt(aleatori.nextInt(0,lletres.length()));
			lletra03 = lletres.charAt(aleatori.nextInt(0,lletres.length()));
			
			System.out.println("La matrícula: "+valorUsuari+" "+lletra01+lletra02+lletra03);
			
		} else if((valorUsuari>=10000)&& (valorUsuari<=99999)) {// 5 dígits
			System.out.println("El número introduït: "+valorUsuari);
			//mostrar el número invertit
			
			//sense bucle, sabem que són 5 dígits
			//primer dígit
			restaDivisio = valorUsuari % 10;
			valorUsuari/=10;
			numeroInvertit+=restaDivisio;
			//segon dígit
			restaDivisio = valorUsuari % 10;
			valorUsuari/=10;
			numeroInvertit+=restaDivisio;
			//tercer dígit
			restaDivisio = valorUsuari % 10;
			valorUsuari/=10;
			numeroInvertit+=restaDivisio;
			//quart dígit
			restaDivisio = valorUsuari % 10;
			valorUsuari/=10;
			numeroInvertit+=restaDivisio;
			//cinquè dígit
			numeroInvertit+=valorUsuari;
			//amb bucle
			/*while(valorUsuari>10) {
				restaDivisio = valorUsuari % 10;
				valorUsuari/=10;
				numeroInvertit+=restaDivisio;
			}
			numeroInvertit+=valorUsuari;*/
			System.out.println("El número invertit : "+numeroInvertit);		
			
		} else {
			System.out.println("EL NÚMERO NO M'INTERESSA");
		}
		

	}

}
