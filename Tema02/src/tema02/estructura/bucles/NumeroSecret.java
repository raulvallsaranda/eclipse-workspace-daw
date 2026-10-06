package tema02.estructura.bucles;

import java.util.Random;
import java.util.Scanner;

public class NumeroSecret {
	
	//constants
	private static final int LIMIT_INFERIOR = 0;
	private static final int LIMIT_SUPERIOR =10;

	public static void main(String[] args) {
		// declarar constant número secret
		Random aleatori = new Random();
		final int NUMERO_SECRET = aleatori.nextInt(LIMIT_SUPERIOR+1);
		
		int numeroUsuari = 0;
		Scanner entrada = new Scanner(System.in);
		boolean encertat = false;
		// declarar variables...
		System.out.println("El número secret és: "+NUMERO_SECRET);
		// demanar a l'usuari número secret entre LIMIT_INFERIOR i LIMIT_SUPERIOR
		while (!encertat) {
			System.out.println("\nIntrodueix un número entre "+LIMIT_INFERIOR+" i "+LIMIT_SUPERIOR);

			// comprove si l'usuari ha introduït un enter
			if (entrada.hasNextInt()) {
				numeroUsuari = entrada.nextInt();
				// per resetejar scanner
				entrada.nextLine();
				if (numeroUsuari==-1) {
					System.out.println("Adéu, el número secret era el "+NUMERO_SECRET);
					encertat = true;
				} else	if ((numeroUsuari >= LIMIT_INFERIOR) && (numeroUsuari <= LIMIT_SUPERIOR)) {// comprovar si està entre 0 i 10
					// si està entre 0 i 10

					// comprovar si és el número secret
					if (numeroUsuari == NUMERO_SECRET) {
						System.out.println("Enhorabona, has encertat el número: " + NUMERO_SECRET);
						encertat = true;
					} else {
						System.out.println("El número " + numeroUsuari + " no és el número secret. Torna a intentar-ho");
					}
					// Si és el número secret: enhorabona
					// Si no és , torna a provar
				} else {
					// si no està entre 0 i 10: error
					System.out.println("Error: El número no està entre "+LIMIT_INFERIOR+" i "+LIMIT_SUPERIOR);
				}

			} else {
				System.out.println("Error: no has introduït un enter");
				// per resetejar scanner
				entrada.nextLine();

			}
		} // fi del while

		entrada.close();

	}

}
