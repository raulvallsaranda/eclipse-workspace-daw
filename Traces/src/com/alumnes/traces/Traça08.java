package com.alumnes.traces;
//Marc i Alex
public class Traça08 {

	public static void main(String[] args) {
		Traça08 programa = new Traça08();
		programa.inici();
	}

	public void inici() {
		String cadena = "programacio";
		char[][] matriu = new char[cadena.length()][cadena.length()];

		for (int i = 0; i < cadena.length(); i++) {
			for (int j = cadena.length() - 1; 0 <= j; j--) {
				if (j == 0) {
					matriu[i][j] = cadena.charAt(j);
				} else {
					matriu[i][j] = cadena.charAt(j);
				}
			}
		}
		for (int i = 0; i < 1; i++) {
			for (int j = 0; j < matriu[i].length; j++) {
				System.out.print("*".repeat(j));
				System.out.print(matriu[i][j]);
				System.out.println("*".repeat(matriu.length - j));
			}

		}
		for (int i = 0; i < 1; i++) {
			for (int j = matriu[i].length -1; j >= 0; j--) {
				System.out.print("*".repeat(j));
				System.out.print(matriu[i][j]);
				System.out.println("*".repeat(matriu.length - j));
			}

		}

	}

}
