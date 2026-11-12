package exercicis.tema03.matriussenzills01;

import java.util.Random;

public class ClasseExercici03 {
	
	
	private static final int N = 7;
//	private static final String LLETRES = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

	public static void main(String[] args) {
		
		String[][] matriu = new String[N][N];
		Random aleatori = new Random();
		
		//generar
		for(int i=0;i<matriu.length;i++) {
			for(int j=0;j<matriu[i].length;j++) {
				matriu[i][j]=""+((char) aleatori.nextInt(65,91));
			}
		}
		
		//mostrar
		for(int i=0;i<matriu.length;i++) {
			for(int j=0;j<matriu[i].length;j++) {
				System.out.print(matriu[i][j]+"\t");
			}
			System.out.println();
		}
		

	}

}
