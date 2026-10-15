package exercicis.tema03.senzills01;

import java.util.Random;
import java.util.Scanner;

public class Exercici01ArrayAleatori {
	
	//constants
	private static final int LONGITUD_ARRAY = 10;
	private static final int VALOR_MAXIM_ARRAY = 100;
	private static final int REPETICIONS_MINIMES = 1;
	private static final int REPETICIONS_MAXIMES = 10;

	public static void main(String[] args) {
		
		
		//declaració de variables
		Scanner entrada = new Scanner(System.in);
		Random aleatori = new Random();
		int repeticions = 0;
		int[] arrayValors = new int[LONGITUD_ARRAY];
		boolean entradaValida = false;
		
		//demanar valor a l'usuari
		do {
			System.out.println("Dona'm un enter entre "+REPETICIONS_MINIMES+" i "+REPETICIONS_MAXIMES);
			if(entrada.hasNextInt()) {
				repeticions = entrada.nextInt();
				entrada.nextLine();
				if((repeticions>=REPETICIONS_MINIMES) && (repeticions<=REPETICIONS_MAXIMES)) {
					entradaValida=true;					
				} else {
					System.out.println("Error: el valor no està entre "+REPETICIONS_MINIMES+" i "+REPETICIONS_MAXIMES);
				}
			}else {
				while(entrada.nextLine().equals("")) {}
				System.out.println("Error: no és un enter");
			}
		} while(!entradaValida);
		
		System.out.println("Quantitat de repeticions: "+repeticions);
		
		
		//operacions amb l'array
		//crear un array amb valors aleatoris
		for(int i=0;i<arrayValors.length;i++) {
			arrayValors[i]=aleatori.nextInt(VALOR_MAXIM_ARRAY+1);
		}
		
		
		//mostrar el resultat
		for(int i=0;i<repeticions;i++) {
			//tabulacions
			for(int j=0;j<i;j++) {
				System.out.print("\t");
			}
			//array
			for(int j=0;j<arrayValors.length;j++) {
				if(j==arrayValors.length-1) {
					System.out.println(arrayValors[j]+"]");
				} else if(j==0){
					System.out.print("["+arrayValors[j]+", ");
				}else {
					System.out.print(arrayValors[j]+", ");
				}
			}
		}
		
		//tanquem scanner
		entrada.close();
		

	}

}
