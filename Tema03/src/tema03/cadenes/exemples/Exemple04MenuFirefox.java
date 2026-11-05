package tema03.cadenes.exemples;

import java.io.IOException;
import java.util.Scanner;

public class Exemple04MenuFirefox {
	
	private static final String MENU = "Menú:\n"
			+ "---------\n"
			+ "a) Albercoc\n"
			+ "b) Banana\n"
			+ "c) Coco\n"
			+ "---------\n";
	
	private static final String URL = "https://ca.wikipedia.org/wiki/";
	
	

	public static void main(String[] args) {
		
		String opcio = "";
		String fruita ="";
		boolean opcioValida = false;
		Scanner entrada = new Scanner(System.in);
		
		//mostrar menu
		System.out.println(MENU);
		
		//demanar opció mentre no siga correcta (a, b, c)
		do {
			System.out.println("Tria una opció:");
			opcio = entrada.next().toLowerCase();
			if(opcio.isBlank()) {
				System.out.println("Error: no pot estar buida");
			}else if(opcio.length()>1) {
				System.out.println("Error: només pot ser un caràcter");
			} else if(opcio.equals("a") || opcio.equals("b") ||opcio.equals("c") ) {
				opcioValida=true;
			} else {
				System.out.println("Error: caràcter no vàlid");
			}			
		}while(!opcioValida);
		
		//obrir viquipèdia en funció de l'opció
		System.out.println("Opció triada: "+opcio);
		
		switch(opcio) {
		case "a":  fruita = "Albercoc"; break;
		case "b":  fruita = "Banana"; break;
		case "c":  fruita = "Coco"; break;		
		}
		
		try {
			ProcessBuilder process = new ProcessBuilder("/usr/bin/firefox", URL+fruita);
			process.start();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
