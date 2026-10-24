package exercicis.tema03.arrays01;

import java.util.Random;
import java.util.Scanner;

public class MajorMenorArray01{
	//mostrar el major i el menor número d'un array aleatori, de longitud indicada per l'usuari
	public static void main(String[] args) {
		//demanar longitud de l'array a l'usuari
		int longitudArray=0;
		float[] arrayReals;
		float major; //on guardarem el major en recórrer l'array
		float menor; //on guardarem el menor en recórrer l'array
		Scanner entrada = new Scanner(System.in);
		Random aleatori = new Random();
		do {
			System.out.println("Indica la longitud de l'array (número enter positiu):");
			while(!entrada.hasNextInt()) {
				System.out.println("Valor de longitud invàlid. Torna a introduir la longitud de l'array.");
				entrada.nextLine();
			}
			longitudArray=entrada.nextInt();
			entrada.nextLine();		
		}while ((longitudArray<=0) || (longitudArray>1000));
		
		System.out.println("La longitud de l'array és: "+longitudArray);
		// crear un array de la longitud indicada per l'usuari i plenar-lo de números reals aleatòris
		arrayReals = new float[longitudArray];
		for (int i=0; i<arrayReals.length; i++) {
			arrayReals[i]= aleatori.nextFloat() * 100;
		}
		//Mostrem l'array.
		for (int i =0;i<arrayReals.length;i++) {
			System.out.println("arrayReals["+i+"]: "+arrayReals[i]);
		}
		
		//calculem el major i el menor
		menor=arrayReals[0];
		major=arrayReals[0];
		for (int i=0;i<arrayReals.length;i++) {
			if(arrayReals[i]<menor) {
				menor = arrayReals[i];
			}
			if(arrayReals[i]>major) {
				major =  arrayReals[i];
			}
		}
		//mostrem els valors
		System.out.println("El menor valor de l'array és: "+menor);
		System.out.println("El major valor de l'array és: "+major);

	}

}
