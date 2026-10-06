package tema02.estructura.bucles;

import java.util.Scanner;

public class QuadratsIncrementals {

	public static void main(String[] args) {

		// declaracions
		Scanner entrada = new Scanner(System.in);
		int costat = 0;

		System.out.println("Introdueix un valor enter major que 1");
		if (entrada.hasNextInt()) {
			costat = entrada.nextInt();
			entrada.nextLine();
			if (costat > 0) {

				for (int i = 0; i < costat; i++) {
					for (int j = 0; j < costat; j++) {
						System.out.print("*");
					}
					System.out.println();
				}

			} else {
				System.out.println("Error, el valor no és positiu");
			}
		} else {
			System.out.println("Error, el valor no és un enter");
		}

	}

}
