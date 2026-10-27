package exercicis.tema03.arrays02;

public class Exercici01MatriuVocals {

	private static final int N = 10;
	private static final String VOCALS = "AEIOU";

	public static void main(String[] args) {

		char[][] matriu = new char[N][N];
		char[][] matriu2 = new char[N][N];

		// creem matriu rotació esquerra
		for (int i = 0; i < matriu.length; i++) {
			for (int j = 0; j < matriu[i].length; j++) {
				matriu[i][j] = VOCALS.charAt((j + i) % VOCALS.length()); // rotació cap a l'esquerra
			}
		}
		System.out.println("\nRotació cap a l'esquerra:");
		System.out.println("-------------------------");
		// mostrem
		for (int i = 0; i < matriu.length; i++) {
			for (int j = 0; j < matriu[i].length; j++) {
				System.out.print(matriu[i][j] + " ");
			}
			System.out.println();
		}
		
		
		// creem matriu rotació dreta
		for (int i = 0; i < matriu2.length; i++) {
			for (int j = 0; j < matriu2[i].length; j++) {
				matriu2[i][j] = VOCALS.charAt((VOCALS.length()+j-(i%VOCALS.length())) % (VOCALS.length())); // rotació cap a la dreta		
			}
		}
		
		System.out.println("\nRotació cap a la dreta:");
		System.out.println("-----------------------");
		// mostrem
		for (int i = 0; i < matriu2.length; i++) {
			for (int j = 0; j < matriu2[i].length; j++) {
				System.out.print(matriu2[i][j] + " ");
			}
			System.out.println();
		}

	}

}
