package exercicis.tema02.part02;


import java.util.Random;

public class Exercici04CaracterAleatori {

	// constants
	public static final int LIMIT_INFERIOR = 0;
	public static final int LIMIT_SUPERIOR = 9;

	public static void main(String[] args) {

		// declaració i inicialització de variables
		Random aleatori = new Random();
		int numero = aleatori.nextInt(LIMIT_INFERIOR, LIMIT_SUPERIOR + 1);
		// caràcters (es podria fer només amb 1)
		char caracter01 = ' ';
		char caracter02 = ' ';
		char caracter03 = ' ';

		if ((numero <= 4)) { // no cal fical el límit inferior, el Random ja ho fa
			// un caràcter aleatori
			caracter01 = (char) aleatori.nextInt(36, 97);
			System.out.println("El número aleatori (" + numero + ") està entre 0 i 4");
			System.out.println("El caràcter aleatori (" + (int) caracter01 + ") és: " + caracter01);

		} else if ((numero >= 5) && (numero <= 7)) {
			// dos caràcters aleatoris
			caracter01 = (char) aleatori.nextInt(97, 158);
			caracter02 = (char) aleatori.nextInt(97, 158);
			System.out.println("El número aleatori (" + numero + ") està entre 5 i 7");
			// comprovació del primer caràcter
			switch ((int) caracter01) {
			case 129, 141, 143, 144, 157: // no utilitzats
				System.out.println("El caràcter aleatori 1 (" + (int) caracter01 + ") no s'utilitza ");
				break;
			default:
				System.out.println("El caràcter aleatori 1 (" + (int) caracter01 + ") és: " + caracter01);
			}
			// comprovació del primer caràcter
			switch ((int) caracter02) {
			case 129, 141, 143, 144, 157: // no utilitzats
				System.out.println("El caràcter aleatori 2 (" + (int) caracter02 + ") no s'utilitza ");
				break;
			default:
				System.out.println("El caràcter aleatori 2 (" + (int) caracter02 + ") és: " + caracter02);
			}
		} else { // si no és cap dels anteriors, el random garanteix que és <=9
			// tres caràcters aleatoris
			caracter01 = (char) aleatori.nextInt(161, 256);
			caracter02 = (char) aleatori.nextInt(161, 256);
			caracter03 = (char) aleatori.nextInt(161, 256);
			System.out.println("El número aleatori (" + numero + ") està entre 8 i 9");
			// comprovació del primer caràcter

			System.out.println("El caràcter aleatori 1 (" + (int) caracter01 + ") és: " + caracter01);
			System.out.println("El caràcter aleatori 2 (" + (int) caracter02 + ") és: " + caracter02);
			System.out.println("El caràcter aleatori 3 (" + (int) caracter03 + ") és: " + caracter03);
		}
		//prova caràcter no visible
		//System.out.println(new String(new byte[] { (byte) 130 }, Charset.forName("Cp437")));
		//System.out.println("135: "+(char)135+" i 136: "+(char)136+" no es visualitzen per defecte");
		//System.out.println(new String(new byte[] { (byte) 245 }, Charset.forName("Cp437")));

	}

}
