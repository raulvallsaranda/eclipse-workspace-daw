package tema02.estructura.condicionals;

import java.util.Scanner;

public class NumeroSecret {

	public static void main(String[] args) {
		// declarar constant número secret
		final int NUMERO_SECRET = 6;
		int numeroUsuari = 0;
		Scanner entrada = new Scanner(System.in);
		// declarar variables...

		// demanar a l'usuari número secret entre 0 i 10

		System.out.println("Introdueix un número entre 0 i 10");
		
		//comprove si l'usuari ha introduït un enter
		if(entrada.hasNextInt()) {
			numeroUsuari = entrada.nextInt();
			// per resetejar scanner
			entrada.nextLine();

			// comprovar si està entre 0 i 10
			if ((numeroUsuari >= 0) && (numeroUsuari <= 10)) {
				// si està entre 0 i 10

				// comprovar si és el número secret
				if (numeroUsuari == NUMERO_SECRET) {
					System.out.println("Enhorabona, has encertat el número: " + NUMERO_SECRET);
				} else {
					System.out.println("El número " + numeroUsuari + " no és el número secret. Torna a intentar-ho");
				}
				// Si és el número secret: enhorabona
				// Si no és , torna a provar
			} else {
				// si no està entre 0 i 10: error
				System.out.println("Error: El número no està entre 0 i 10");
			}
			
			
		} else {
			System.out.println("Error: no has introduït un enter");
			
		}
		
		
		entrada.close();

	}

}
