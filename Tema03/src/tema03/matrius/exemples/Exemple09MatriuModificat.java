package tema03.matrius.exemples;

import java.util.Random;
import java.util.Scanner;

public class Exemple09MatriuModificat {

	//constants
	private static final int VALOR_MIN = 0;
	private static final int VALOR_MAX = 10;
	private static final int N_MIN = 1;
	private static final int M_MIN = 1;
	private static final int N_MAX = 20;
	private static final int M_MAX = 20;

	public static void main(String[] args) {

		
		// declaració
		Scanner entrada = new Scanner(System.in);
		Random aleatori = new Random();
		int files = 0;
		int columnes = 0;
		boolean filesValid = false;
		boolean columnesValid = false;
		
		int[][] matriu;
		
		//demanar mides a l'usuari
		
		//demanem files
		do {
			System.out.println("Escriu la quantitat de files ("+N_MIN+"-"+N_MAX+")");
			if(entrada.hasNextInt()) {
				files = entrada.nextInt();
				if(files>=N_MIN && files<=N_MAX) {
					filesValid = true;
				}else {
					System.out.println("Error: quantitat de files incorrecta");
				}
				
			} else {
				while(entrada.nextLine().isBlank()) {}
				System.out.println("Error: l'entrada no és un enter");
			}			
		}while(!filesValid);
		
		//demanem columnes
		do {
			System.out.println("Escriu la quantitat de columnes ("+M_MIN+"-"+M_MAX+")");
			if(entrada.hasNextInt()) {
				columnes = entrada.nextInt();
				if(columnes>=N_MIN && columnes<=N_MAX) {
					columnesValid = true;
				}else {
					System.out.println("Error: quantitat de columnes incorrecta");
				}
				
			} else {
				while(entrada.nextLine().trim().isBlank()) {}
				System.out.println("Error: l'entrada no és un enter");
			}			
		}while(!columnesValid);
		
		//declaració de matriu
		
		matriu = new int[files][columnes];
		
		
		//emplenem de valors aleatoris
		for (int i = 0; i < matriu.length; i++) { // recórrer files
			for (int j = 0; j < matriu[i].length; j++) { // recórrer columnes
				matriu[i][j]=aleatori.nextInt(VALOR_MIN,VALOR_MAX+1);
			}
		}
			

		// mostrem
		for (int i = 0; i < matriu.length; i++) { // recórrer files
			for (int j = 0; j < matriu[i].length; j++) { // recórrer columnes
				System.out.print(matriu[i][j] + "\t");
			}
			System.out.println();
		}

	}

}
