package exercicis.tema03.arrays01;

import java.util.Random;
import java.util.Scanner;

public class ArrayVocals03_v2 {

	public static void main(String[] args) {
		//demanar longitud de l'array a l'usuari
		char[] vocals = {'a','e','i','o','u'}; // array auxiliar que conté les vocals
		char[] arrayVocals; // array on inserirem vocals aleatòries
		char vocalRecompte; // la vocal de la que l'usuari vol fer el recompte
		int recompteVocal=0;  // comptador per a la quantitat de la vocal triada per l'usuari
		//per generar vocals aleatòriament, generarem un integer entre 0 i 4
		//amb el que accedirem a una de les vocals de l'array
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
		//Demanem a l'usuari de quina vocal volem fer el recompte
		
			System.out.println("De quina vocal vols fer el recompte a, e, i, o, u?");
			while((!entrada.hasNext("a")) && (!entrada.hasNext("e")) && (!entrada.hasNext("i")) && (!entrada.hasNext("o"))  && (!entrada.hasNext("u"))) {
				System.out.println("Valor de vocal invàlid. Torna a introduir la vocal a, e, i, o ,u");
				entrada.nextLine();
			}
			//obtenim la vocal
			vocalRecompte=entrada.next().charAt(0);
			entrada.nextLine();	
		System.out.println("La vocal triada es: "+vocalRecompte);
		// fem el recompte de la vocal triada per l'usuari i el mostrem
		for(int i=0;i<arrayVocals.length;i++) {
			if(arrayVocals[i]==vocalRecompte) {
				recompteVocal++;
			}
		}
		System.out.println("La quantitat d'"+vocalRecompte+"s: "+recompteVocal);
		
		
		

	}

}
