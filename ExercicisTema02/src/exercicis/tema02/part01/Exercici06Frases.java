package exercicis.tema02.part01;
import java.util.Scanner;

public class Exercici06Frases {

	public static void main(String[] args) {
		//variables
		byte edat;
		char sexe;
		
		//Entrada
		Scanner entrada = new Scanner (System.in);
		
		System.out.println("Introdueix la teua edat: ");
		if (entrada.hasNextByte()) {
			edat = entrada.nextByte();
			System.out.println("Introdueix el teu sexe  (H/D): ");
			if ((entrada.hasNext("D")) || (entrada.hasNext("d")) || (entrada.hasNext("h")) || (entrada.hasNext("H"))) {
				sexe = entrada.next().charAt(0);
				
				if (((sexe=='h') || (sexe=='H')) && (edat<=18)) {
					System.out.println("Hola xaval, com estàs?");
				} else if (((sexe=='h') || (sexe=='H')) && (edat>18)) {
					System.out.println("Vostè ja pot votar, senyor");
				} else if (((sexe=='d') || (sexe=='D')) && (edat<=18)) {
					System.out.println("Hola joveneta, què tal et trobes?");
				} else if (((sexe=='d') || (sexe=='D')) && (edat>18)) {
					System.out.println("Vostè ja pot votar, senyora");
				}
				
			} else {
				System.out.println("Ho sentim, el que has introduït no és un valor vàlid");
			}
			
		} else {
			System.out.println("Ho sentim, el que has introduït no és valor vàlid");
		}
	}

}

