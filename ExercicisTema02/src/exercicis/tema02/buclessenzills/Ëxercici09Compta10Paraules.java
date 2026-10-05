package exercicis.tema02.buclessenzills;

import java.util.Scanner;

public class Ëxercici09Compta10Paraules {

	// constants
	private static final int LIMIT_INFERIOR = 1;
	private static final int LIMIT_SUPERIOR = 10;

	public static void main(String[] args) {

		// declaracions
		Scanner entrada = new Scanner(System.in);
		System.out.println("Inici del recompte");
		for (int i = LIMIT_INFERIOR; i <= LIMIT_SUPERIOR; i++) {
			switch (i) {
			case 10:
				System.out.print("deu (prem Intro per continuar)");
				entrada.nextLine();
				break;
			case 9:
				System.out.print("nou (prem Intro per continuar)");
				entrada.nextLine();
				break;
			case 8:
				System.out.print("huit (prem Intro per continuar)");
				entrada.nextLine();
				break;
			case 7:
				System.out.print("set (prem Intro per continuar)");
				entrada.nextLine();
				break;
			case 6:
				System.out.print("sis (prem Intro per continuar)");
				entrada.nextLine();
				break;
			case 5:
				System.out.print("cinc (prem Intro per continuar)");
				entrada.nextLine();
				break;
			case 4:
				System.out.print("quatre (prem Intro per continuar)");
				entrada.nextLine();
				break;
			case 3:
				System.out.print("tres (prem Intro per continuar)");
				entrada.nextLine();
				break;
			case 2:
				System.out.print("dos (prem Intro per continuar)");
				entrada.nextLine();
				break;
			case 1:
				System.out.print("u (prem Intro per continuar)");
				entrada.nextLine();
				break;
			}

		}
		System.out.println("Final del recompte");
	}
}
