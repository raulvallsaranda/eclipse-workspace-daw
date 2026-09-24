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
		// càlcul del descompte
		//double valorDescompte = 0.0;
		// Scanner (entrada de teclat)
		Scanner entrada = new Scanner(System.in);
		//preu final
		double preuFinal = 0.0;

		// programa principal

		// demanar el preu a l'usuari (Scanner)
		System.out.println("Indica'm el preu:");
		preuUsuari = entrada.nextDouble();
		System.out.println("Preu introduït per l'usuari : " + preuUsuari + "€");

		//assigne el preu de l'usuari al preu final
		preuFinal = preuUsuari;
		// comprovar si és menor o igual que el preu mínim (200)
		if (preuUsuari < PREU_MINIM) {
			System.out.println("S'aplica penalització");
			// si és major o igual : calcular descompte
			//valorDescompte = preuUsuari * PERCENTATGE_DESCOMPTE;
			
			System.out.println("S'aplicarà una penalització de : "+PENALITZACIO+"€");
			//càlcul del preu final
			preuFinal = preuUsuari + PENALITZACIO;
			
		}
		
		System.out.println("El preu final a pagar és: "+preuFinal+"€");

		// mostrar per pantalla:
		// preu de l'usuari
		// si s'aplica o no el descompte
		// percentatge a aplicar
		// preu

	}

}
