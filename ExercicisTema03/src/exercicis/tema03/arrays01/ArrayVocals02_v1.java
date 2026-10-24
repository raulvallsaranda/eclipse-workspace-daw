package exercicis.tema03.arrays01;

import java.util.Random;
import java.util.Scanner;

public class ArrayVocals02_v1 {

	public static void main(String[] args) {
		//demanar longitud de l'array a l'usuari
		char[] vocals = {'a','e','i','o','u'};
		char[] arrayVocals;
		//per generar vocals aleatòriament, generarem un integer entre 0 i 4
		//amb el que accedirem a una de les vocals de l'array
		int[] recompteVocals = new int[5]; //en cada posició comptarem el número de cada vocal
		int longitudArray=0;
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
		}while ((longitudArray<=0) || (longitudArray>500));
		
		System.out.println("La longitud de l'array és: "+longitudArray);
		
		// inicialitzem l'array de la longitud indicada per l'usuari
		arrayVocals = new char[longitudArray];
		// emplenem l'array de vocals aleatòries.
		for(int i=0; i<arrayVocals.length;i++) {
			arrayVocals[i]=vocals[aleatori.nextInt(0,vocals.length)];
		}
		// mostrem l'array:
		for (int i =0;i<arrayVocals.length;i++) {
			System.out.println("arrayVocals["+i+"]: "+arrayVocals[i]);
		}
		//fem el recompte
		for(int i=0;i<arrayVocals.length;i++) {
			switch(arrayVocals[i]) {
			case 'a': recompteVocals[0]++;
				break;
			case 'e': recompteVocals[1]++;
				break;
			case 'i': recompteVocals[2]++;
				break;
			case 'o': recompteVocals[3]++;
				break;
			case 'u': recompteVocals[4]++;
				break;
			}
		}
		// mostrem els resultats
		for(int i=0;i<recompteVocals.length;i++) {
			System.out.println("La quantitat d'"+vocals[i]+"s: "+recompteVocals[i]);
		}
		

	}

}
