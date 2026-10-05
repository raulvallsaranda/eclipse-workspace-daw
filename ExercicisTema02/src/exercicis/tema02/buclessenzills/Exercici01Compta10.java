package exercicis.tema02.buclessenzills;

public class Exercici01Compta10 {

	// constant
	private static final int LIMIT_SUPERIOR = 10;
	private static final int LIMIT_INFERIOR = 1;

	public static void main(String[] args) {
		// comptador
		int i = LIMIT_INFERIOR;

		// comptem amb while
		System.out.println("Amb bucle while:");
		while (i <= LIMIT_SUPERIOR) {
			System.out.println(i);
			i++;
		}

		// reiniciem comptador
		i = LIMIT_INFERIOR;
		// comptem amb while
		System.out.println("Amb bucle do while:");
		do {
			System.out.println(i);
			i++;
		} while (i <= LIMIT_SUPERIOR);
		// reiniciem comptador
		i = LIMIT_INFERIOR;
		// comptem amb for
		System.out.println("Amb bucle for:");
		for(;i<=LIMIT_SUPERIOR;i++) {
			System.out.println(i);
		}

	}

}
