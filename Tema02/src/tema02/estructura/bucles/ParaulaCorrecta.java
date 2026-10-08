package tema02.estructura.bucles;

import java.util.Scanner;

public class ParaulaCorrecta {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		String paraulaUsuari = "";
		String paraula ="";

		boolean paraulaCorrecta = false;

		do {

			System.out.println("Escriu una paraula que comence per m, s, t o b");
			paraulaUsuari = entrada.nextLine().trim();
			paraula = paraulaUsuari.toLowerCase();
			// comprovacions
			if (paraulaUsuari.isBlank()) {
				System.out.println("La paraula no pot estar buida");
			} else if ((paraula.charAt(0) == 'm') || (paraula.charAt(0) == 's')
					|| (paraula.charAt(0) == 't') || (paraula.charAt(0) == 'b')) {
				System.out.println("La paraula " + paraulaUsuari + " és correcta, comença per m , s t o b");
				paraulaCorrecta = true;
			} else if ((paraula.charAt(paraula.length()-1) == 'm') || (paraula.charAt(paraula.length()-1) == 's')
					|| (paraula.charAt(paraula.length()-1) == 't') || (paraula.charAt(paraula.length()-1) == 'b')) {
				System.out.println("La paraula " + paraulaUsuari + " és correcta, acaba per m , s t o b");
				paraulaCorrecta = true;
			} else {
				System.out.println("La paraula " + paraulaUsuari + " és incorrecta");
			}

		} while (!paraulaCorrecta);

	}

}
