package tema02.estructura.condicionals;

import java.util.Scanner;

public class DescomptePenalitzacio {

	public static void main(String[] args) {

		// declaració de variables

		// preu mínim (constant)
		final double PREU_MINIM = 30.0;
		// valor de penalització (constant)
		final double PENALITZACIO = 2.0;
		// preu introduït per l'usuari
		double preuUsuari = 0.0;
		// Scanner (entrada de teclat)
		Scanner entrada = new Scanner(System.in);
		//preu final
		double preuFinal = 0.0;

		// programa principal

		// demanar el preu a l'usuari (Scanner)
		System.out.println("Indica'm el preu:");
		preuUsuari = entrada.nextDouble();
		System.out.println("Preu introduït per l'usuari : " + preuUsuari + "€");

		//assignem el preu de l'usuari al preu final, per si no s'aplica penalització
		preuFinal = preuUsuari;
		
		// comprovar si és menor o igual que el preu mínim (200)
		if (preuUsuari < PREU_MINIM) {
			System.out.println("S'aplicarà una penalització de : "+PENALITZACIO+"€");
			//càlcul del preu final
			preuFinal = preuUsuari + PENALITZACIO;
			
		}
		// mostrar per pantall preu final
		System.out.println("El preu final a pagar és: "+preuFinal+"€");

		//tanquem scanner
		entrada.close();


	}

}
