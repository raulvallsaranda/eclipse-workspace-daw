package exercicis.tema02.part03;

import java.util.Scanner;

public class Poblacions {
	
	private static final String menu =
			"Poblacions Disponibles\n"
			+ "----------------------\n"
			+ "A) Benigànim\n"
			+ "B) Canals\n"
			+ "C) Novetlè\n"
			+ "D) Xàtiva\n"
			+ "----------------------\n"
			+ "Tria una opcio:";
	private static final int POBLACIO_BENIGANIM = 5759;
	private static final int POBLACIO_CANALS = 13746;
	private static final int POBLACIO_NOVETLE = 872;
	private static final int POBLACIO_XATIVA = 31008;

	public static void main(String[] args) {
		//variables
		String opcioUsuari = "";
		Scanner entrada = new Scanner(System.in);
		
		//demanem població a l'usuari
		System.out.println(menu);
		opcioUsuari = entrada.nextLine();
		
		//comprovem l'entrada indicada per l'usuari
		switch(opcioUsuari) {
		case "a","A":
			System.out.println("Has triat Benigànim. Població: "+POBLACIO_BENIGANIM+" habitants");
			break;
		case "b","B":
			System.out.println("Has triat Canals. Població: "+POBLACIO_CANALS+" habitants");
			break;
		case "c","C":
			System.out.println("Has triat Novetlè. Població: "+POBLACIO_NOVETLE+" habitants");
			break;
		case "d","D":
			System.out.println("Has triat Xàtiva. Població: "+POBLACIO_XATIVA+" habitants");
			break;
		default:
			System.out.println("No has triat cap de les opcions disponibles.");
		}
		
		//tanquem Scanner
		entrada.close();

	}

}
