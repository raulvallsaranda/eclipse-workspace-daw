package exercicis.tema03.arraysenzills01;

import java.util.Scanner;

public class Exercici08 {
	//constants
	public static final int VALOR_MIN = 1;
	public static final int VALOR_MAX = 20;
	
	public static void main(String[] args) {
		//variables
		Scanner entrada = new Scanner(System.in);
		int valorUsuari = 0;
		String[] piramide; //declarem però no inicialitzem
		boolean entradaValida = false;
		
		//demanem a l'usuari un valor enter entre mínim i màxim
		do {
			System.out.println("Insereix un valor entre "+VALOR_MIN+" i "+VALOR_MAX+":");
			if(entrada.hasNextInt()) {
				valorUsuari = entrada.nextInt();
				entrada.nextLine();
				if(valorUsuari>=VALOR_MIN && valorUsuari<=VALOR_MAX) {
					entradaValida = true;
				} else {
					System.out.println("El valor ha d'estar entre "+VALOR_MIN+" i "+VALOR_MAX+".");
				}
			}else {
				while(entrada.nextLine().equals("")) {}
				System.out.println("L'entrada no és vàlida");
			}
		}while(!entradaValida);
		
		//inicialitzem l'array
		piramide = new String[valorUsuari];
		
		//generem els valors
		for(int i = 0;i<piramide.length;i++) {
			if(i==0) {
				piramide[i]="*";
			}else {
				piramide[i]=piramide[i-1]+"**";
			}
		}
		
		//mostrem les files sense espais davant
		for(int i=0;i<piramide.length;i++) {
			System.out.println(piramide[i]);
		}
		//ara ho mostrem amb espais
		for(int i=0;i<piramide.length;i++) {
			for(int j=0;j<valorUsuari-i-1;j++) {
				System.out.print(" ");
			}
			System.out.println(piramide[i]);
		}
		
	}

}
