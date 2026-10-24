package exercicis.tema03.arraysenzills01;

import java.util.Random;
import java.util.Scanner;

public class Exercici01 {
	
	public static final int LONGITUD_ARRAY = 10;
	public static final int MINIM = 1;
	public static final int MAXIM =10;
	public static final int VALOR_MAXIM = 100;
	
	public static void main (String[] args) {
		//declaració de variables
		int[] arrayEnters = new int[LONGITUD_ARRAY];
		Random aleatori = new Random();
		Scanner entrada = new Scanner(System.in);
		boolean entradaValida = false;
		int valorUsuari = 0;
		//inicialitzem a valors aleatoris
		for(int i =0;i<arrayEnters.length;i++) {
			arrayEnters[i]=aleatori.nextInt(0,VALOR_MAXIM+1);
		}
		//demanem número a l'usuari entre 1 i 10
		do {
			System.out.println("Introdueix un enter entre "+MINIM+" i "+MAXIM+":");
			if(entrada.hasNextInt()) {
				valorUsuari = entrada.nextInt();
				entrada.nextLine();
				if(valorUsuari >=MINIM && valorUsuari<=MAXIM) {
					entradaValida = true;
				}else {
					System.out.println("El valor ha d'estar entre "+MINIM+" i "+MAXIM+".");
				}
			}else{
				while(entrada.nextLine().equals("")) {}
				System.out.println("L'entrada no és vàlida.");
			}
			
		}while(!entradaValida);
		
		//fiquem en pantalla l'array, amb una indentació
		for(int i = 0;i<valorUsuari;i++) {
			//identació
			for(int j=0;j<i;j++) {
				System.out.print("\t");
			}
			//array
			for(int k=0;k<arrayEnters.length;k++) {
				if(k==0) {
					System.out.print("["+arrayEnters[k]+", ");
				} else if(k==arrayEnters.length-1) {
					System.out.println(arrayEnters[k]+"]");
				} else {
					System.out.print(arrayEnters[k]+", ");
				}				
			}
			//següent línia
		}
		//tanquem scanner
		entrada.close();
	}

}
