package exercicis.tema02.bucles02;

import java.util.Scanner;

public class Exercici05CaragolMussol {
	

	private static final String ANIMAL_1 = "caragol";
	private static final String ANIMAL_2 = "mussol";
	private static final int LIMIT_INFERIOR = 0;
	private static final int LIMIT_SUPERIOR = 50;

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		boolean entradaValida = false;
		boolean eixir = false;
		String animalUsuari = "";
		
		String offset = "";
		int comptadorMoviment = 0;
		String moviment = "";
		
		String CADENA_ANIMAL_1 = offset + "     /^\\    /^\\\r\n"
				+ offset +"    {  O}  {  O}\r\n"
				+ offset +"     \\ /    \\ /\r\n"
				+ offset +"     //     //       _------_\r\n"
				+ offset +"    //     //     ./~        ~-_\r\n"
				+ offset +"   / ~----~/     /              \\\r\n"
				+ offset +" /         :   ./       _---_    ~-\r\n"
				+ offset +"|  \\________) :       /~     ~\\   |\r\n"
				+ offset +"|        /    |      |  :~~\\  |   |\r\n"
				+ offset +"|       |     |      |  \\___-~    |\r\n"
				+ offset +"|        \\ __/`^\\______\\.        ./\r\n"
				+ offset +" \\                     ~-______-~\\.\r\n"
				+ offset +" .|                                ~-_\r\n"
				+ offset +"/_____________________________________~~____";
		
		String CADENA_ANIMAL_2 = offset +"  , _ ,\r\n"
				+ offset +" ( o o )\r\n"
				+ offset +"/'` ' `'\\\r\n"
				+ offset +"|'''''''|\r\n"
				+ offset +"|\\\\'''//|\r\n"
				+ offset +"   \"\"\"";
		

		// demanem el valor a l'usuari mentre no siga vàlid
		do {
			System.out.println("Introdueix un animal : " + ANIMAL_1 + " o " + ANIMAL_2 +", o eixir per acabar");
			animalUsuari = entrada.nextLine().trim().toLowerCase();
			if(animalUsuari.isBlank()) {
				System.out.println("Error: l'entrada no pot estar buida");
			} else	if (animalUsuari.equals(ANIMAL_1) || animalUsuari.equals(ANIMAL_2)) {
				entradaValida = true;
			} else	if (animalUsuari.equals("eixir")) {
				entradaValida = true; //acabem
			}else {
				System.out.println("Error: no és cap dels animals indicats");
			}

		} while (!entradaValida);
		
		//dibuixem animal i escoltem teclat
		if(animalUsuari.equals(ANIMAL_1)) {
			//recalculem el dibuix de l'animal 1 amb offset
			CADENA_ANIMAL_1 = offset + "     /^\\    /^\\\r\n"
					+ offset +"    {  O}  {  O}\r\n"
					+ offset +"     \\ /    \\ /\r\n"
					+ offset +"     //     //       _------_\r\n"
					+ offset +"    //     //     ./~        ~-_\r\n"
					+ offset +"   / ~----~/     /              \\\r\n"
					+ offset +" /         :   ./       _---_    ~-\r\n"
					+ offset +"|  \\________) :       /~     ~\\   |\r\n"
					+ offset +"|        /    |      |  :~~\\  |   |\r\n"
					+ offset +"|       |     |      |  \\___-~    |\r\n"
					+ offset +"|        \\ __/`^\\______\\.        ./\r\n"
					+ offset +" \\                     ~-______-~\\.\r\n"
					+ offset +" .|                                ~-_\r\n"
					+ offset +"/_____________________________________~~____";
			System.out.println(CADENA_ANIMAL_1);
		} else if(animalUsuari.equals(ANIMAL_2)) {
			//recalculem el dibuix de l'animal 1 amb offset
			CADENA_ANIMAL_2 = offset +"  , _ ,\r\n"
					+ offset +" ( o o )\r\n"
					+ offset +"/'` ' `'\\\r\n"
					+ offset +"|'''''''|\r\n"
					+ offset +"|\\\\'''//|\r\n"
					+ offset +"   \"\"\"";
			System.out.println(CADENA_ANIMAL_2);
		}
		if (animalUsuari.equals("eixir")) {
			System.out.println("Adéu, fins aviat!");
		} else {
			do {
				
				System.out.println("Mou el "+animalUsuari+":  a:esquerra - d:dreta - eixir:acabar");
				moviment = entrada.nextLine().toLowerCase();
				if(moviment.equals("a")) {
					if (comptadorMoviment>LIMIT_INFERIOR) {
						comptadorMoviment--;
						offset="";
						for(int i=LIMIT_INFERIOR;i<comptadorMoviment;i++) {
							offset+="  ";
						}
					}
					//dibuixem
					//recalculem el dibuix de l'animal 1 amb offset
					if(animalUsuari.equals(ANIMAL_1)) {
						//recalculem el dibuix de l'animal 1 amb offset
						CADENA_ANIMAL_1 = offset + "     /^\\    /^\\\r\n"
								+ offset +"    {  O}  {  O}\r\n"
								+ offset +"     \\ /    \\ /\r\n"
								+ offset +"     //     //       _------_\r\n"
								+ offset +"    //     //     ./~        ~-_\r\n"
								+ offset +"   / ~----~/     /              \\\r\n"
								+ offset +" /         :   ./       _---_    ~-\r\n"
								+ offset +"|  \\________) :       /~     ~\\   |\r\n"
								+ offset +"|        /    |      |  :~~\\  |   |\r\n"
								+ offset +"|       |     |      |  \\___-~    |\r\n"
								+ offset +"|        \\ __/`^\\______\\.        ./\r\n"
								+ offset +" \\                     ~-______-~\\.\r\n"
								+ offset +" .|                                ~-_\r\n"
								+ offset +"/_____________________________________~~____";
						System.out.println(CADENA_ANIMAL_1);
					} else if(animalUsuari.equals(ANIMAL_2)) {
						//recalculem el dibuix de l'animal 1 amb offset
						CADENA_ANIMAL_2 = offset +"  , _ ,\r\n"
								+ offset +" ( o o )\r\n"
								+ offset +"/'` ' `'\\\r\n"
								+ offset +"|'''''''|\r\n"
								+ offset +"|\\\\'''//|\r\n"
								+ offset +"   \"\"\"";
						System.out.println(CADENA_ANIMAL_2);
					}
				} else if (moviment.equals("d")) {
					if (comptadorMoviment<LIMIT_SUPERIOR) {
						comptadorMoviment++;
						offset="";
						for(int i=0;i<comptadorMoviment;i++) {
							offset+="  ";
						}
					}
					//dibuixem
					//recalculem el dibuix de l'animal 1 amb offset
					if(animalUsuari.equals(ANIMAL_1)) {
						//recalculem el dibuix de l'animal 1 amb offset
						CADENA_ANIMAL_1 = offset + "     /^\\    /^\\\r\n"
								+ offset +"    {  O}  {  O}\r\n"
								+ offset +"     \\ /    \\ /\r\n"
								+ offset +"     //     //       _------_\r\n"
								+ offset +"    //     //     ./~        ~-_\r\n"
								+ offset +"   / ~----~/     /              \\\r\n"
								+ offset +" /         :   ./       _---_    ~-\r\n"
								+ offset +"|  \\________) :       /~     ~\\   |\r\n"
								+ offset +"|        /    |      |  :~~\\  |   |\r\n"
								+ offset +"|       |     |      |  \\___-~    |\r\n"
								+ offset +"|        \\ __/`^\\______\\.        ./\r\n"
								+ offset +" \\                     ~-______-~\\.\r\n"
								+ offset +" .|                                ~-_\r\n"
								+ offset +"/_____________________________________~~____";
						System.out.println(CADENA_ANIMAL_1);
					} else if(animalUsuari.equals(ANIMAL_2)) {
						//recalculem el dibuix de l'animal 1 amb offset
						CADENA_ANIMAL_2 = offset +"  , _ ,\r\n"
								+ offset +" ( o o )\r\n"
								+ offset +"/'` ' `'\\\r\n"
								+ offset +"|'''''''|\r\n"
								+ offset +"|\\\\'''//|\r\n"
								+ offset +"   \"\"\"";
						System.out.println(CADENA_ANIMAL_2);
					}
				} else if(moviment.equals("eixir")) {
					eixir = true;
					System.out.println("Adéu, fins aviat!");
				} 
			} while(!eixir);
		}

		
		// tanquem Scanner
		entrada.close();

	}

}
