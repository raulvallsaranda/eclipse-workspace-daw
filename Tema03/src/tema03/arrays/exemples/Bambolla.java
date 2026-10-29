package tema03.arrays.exemples;

import java.util.Random;

public class Bambolla {

	public static void main(String[] args) {

		//int[] arrayEnters = { 55, 90, 21, 10, 44, 36, 20, 78, 12, 44 };
		int[] arrayEnters = new int[10000];
		Random aleatori = new Random();
		for(int i = 0;i<arrayEnters.length;i++) {
			arrayEnters[i]= aleatori.nextInt(20001);					
		}
		
		long tempsInici = 0l;
		long tempsFinal = 0l;
		int comptador = 0;
		int aux = 0;
		// El mostrem per pantalla.
		System.out.println("L'array original és:");
		for (int i = 0; i < arrayEnters.length; i++) {
			if (i == 0) {
				System.out.print("[" + arrayEnters[i] + ",");
			} else if (i == arrayEnters.length - 1) {
				System.out.print(arrayEnters[i] + "]");
			} else {
				System.out.print(arrayEnters[i] + ",");
			}
		}

		// ordenar amb bambolla
		tempsInici = System.currentTimeMillis();
		//bucle extern, i
		for(int i=0;i<arrayEnters.length-1;i++) {
			for(int j=0;j<arrayEnters.length-i-1;j++) {
				if(arrayEnters[j]<arrayEnters[j+1]) {
					//intercanvi
					aux=arrayEnters[j+1];
					arrayEnters[j+1] = arrayEnters[j];
					arrayEnters[j]=aux;
				}
				comptador++;
			}
		}
		tempsFinal = System.currentTimeMillis();
		
		// mostrar per pantalla
		System.out.println("\nL'array ordenat és:");
		for (int i = 0; i < arrayEnters.length; i++) {
			if (i == 0) {
				System.out.print("[" + arrayEnters[i] + ",");
			} else if (i == arrayEnters.length - 1) {
				System.out.print(arrayEnters[i] + "]");
			} else {
				System.out.print(arrayEnters[i] + ",");
			}
		}

		System.out.println("\nComptador: "+comptador);
		System.out.println("Temps: "+(tempsFinal-tempsInici)+"ms");
	}

}
