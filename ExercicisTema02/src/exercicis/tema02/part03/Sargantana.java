package exercicis.tema02.part03;

import java.util.Scanner;

public class Sargantana {
	
	//constants
	
	public static final String IMATGE_SARGANTANA =
			"              ____...---...___\n"
			+ "___.....---\"\"\"        .       \"\"--..____\n"
			+ "     .                  .            .\n"
			+ " .             _.--._       /|\n"
			+ "        .    .'()..()`.    / /\n"
			+ "            ( `-.__.-' )  ( (    .\n"
			+ "   .         \\        /    \\ \\\n"
			+ "       .      \\      /      ) )        .\n"
			+ "            .' -.__.- `.-.-'_.'\n"
			+ " .        .'  /-____-\\  `.-'       .\n"
			+ "          \\  /-.____.-\\  /-.\n"
			+ "           \\ \\`-.__.-'/ /\\|\\|           .\n"
			+ "          .'  `.    .'  `.\n"
			+ "          |/\\/\\|    |/\\/\\|\n";

	public static final String IMATGE_TRISTA =
			"     .-\"\"\"\"\"\"-.\n"
			+ "   .'          '.\n"
			+ "  /   O      O   \\\n"
			+ " :           `    :\n"
			+ " |                | \n"
			+ " :    .------.    :\n"
			+ "  \\  '        '  /\n"
			+ "   '.          .'\n"
			+ "     '-......-'\n"
			+ "";
	public static final String SARGANTANA = "Sargantana";
			
	public static void main(String[] args) {
		//variables
		String cadenaUsuari = "";
		Scanner entrada = new Scanner(System.in);
		
		
		System.out.println("Introdueix una cadena:");
		cadenaUsuari = entrada.nextLine();
		if(cadenaUsuari.equalsIgnoreCase(SARGANTANA)) {
			System.out.println("Has introduït la paraula "+SARGANTANA);
			System.out.println(IMATGE_SARGANTANA);
		}else {
			System.out.println("No has introduït la paraula "+SARGANTANA);
			System.out.println(IMATGE_TRISTA);
		}

	}

}
