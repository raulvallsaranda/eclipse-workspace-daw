package tema02.estructura.condicionals;

import java.util.Scanner;

public class InformacioModuls {
	
	private static final String MENU = "    MENÚ mòduls 1r DAW\n"
			+ "---------------------------\n"
			+ "SI BD PRO LM IPO ANG ED IP\n"
			+ "--------------------------\n"
			+ "Introdueix el codi d'un dels mòduls:";
	
	private static final String DADES_SI = "SI: Sistemes Informàtics\n"
			+ "Hores Setmanals: 5\n"
			+ "Professorat:  Isidro Gomar";
	private static final String DADES_BD = "BD: Bases de Dades\n"
			+ "Hores Setmanals: 5\n"
			+ "Professorat: Alberto Llorens";
	private static final String DADES_PRO = "PRO: Programació\n"
			+ "Hores Setmanals: 8\n"
			+ "Professorat: Raül Valls";
	private static final String DADES_LM = "\n"
			+ "LM: Llenguatges de Marques\n"
			+ "Hores Setmanals: 3\n"
			+ "Professorat: Sara Moratalla";
	private static final String DADES_IPO = "IPO: Itinerari Personal per a l'Ocupació\n"
			+ "Hores Setmanals: 3\n"
			+ "Professorat: Raül Castillo";
	private static final String DADES_ANG = "ANG: Anglés\n"
			+ "Hores Setmanals: 2\n"
			+ "Professorat: Salvador Sifre";
	private static final String DADES_ED = "ED: Entorns de Desenvolupament\n"
			+ "Hores Setmanals: 3\n"
			+ "Professorat: Sara Moratalla";
	private static final String DADES_PI = "PI: Projecte Intermodular\n"
			+ "Hores Setmanals: 1\n"
			+ "Professorat: Sara Moratalla";
	
	
	public static void main(String[] args) {
		
		String codiModul = "";
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println(MENU);
		
		codiModul = entrada.nextLine().toUpperCase();
		System.out.println("entrada: "+codiModul);
		
		switch(codiModul) {
		
		case "SI" -> System.out.println(DADES_SI);
		case "BD" -> System.out.println(DADES_BD);
		case "PRO" -> System.out.println(DADES_PRO);
		case "LM" -> System.out.println(DADES_LM);
		case "IPO" -> System.out.println(DADES_IPO);
		case "ANG" -> System.out.println(DADES_ANG);
		case "ED" -> System.out.println(DADES_ED);
		case "PI" -> System.out.println(DADES_PI);
		default -> System.out.println("El codi és incorrecte");
		
		
		}
		
		entrada.close();
		
		
		

	}

}
