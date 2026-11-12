package exercicis.tema03.matriussenzills01;

import java.util.Random;

public class ClasseExercici07 {
	
	private static final int FILES = 10;
	private static final int MIN_COL = 2;
	private static final int MAX_COL = 10;
	
	private static final String VOCALS  = "AEIOU";
	
	public static void main(String[] args) {
		
		Random aleatori = new Random();
		//definim quantitat de files de la matriu
		char[][] matriu = new char[FILES][];
		
		//definim quantitat de columnes de cada fila de la matriu
		for(int i=0;i<matriu.length;i++) {
			matriu[i] = new char[aleatori.nextInt(MIN_COL,MAX_COL+1)];
		}
		//inicialitzem la matriu
		for(int i=0;i<matriu.length;i++) {
			for(int j=0;j<matriu[i].length;j++) {
				matriu[i][j]=VOCALS.charAt(aleatori.nextInt(VOCALS.length()));
			}
		}
		//mostrem la matriu
		for(int i=0;i<matriu.length;i++) {
			for(int j=0;j<matriu[i].length;j++) {
				System.out.print(matriu[i][j]+" ");
			}
			System.out.println();
		}
		

		
		
		
		
		
		
		
	}
	

}
