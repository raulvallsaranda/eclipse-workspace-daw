package exercicis.tema02.buclessenzills;

public class Exercici02Patro {

	//constants
	private static final int ITERACIONS = 5;
	
	public static void main(String[] args) {
		
		//doble bucle
		for(int i=1;i<=ITERACIONS;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(j+" ");
			}
			System.out.println();
		}

	}

}
