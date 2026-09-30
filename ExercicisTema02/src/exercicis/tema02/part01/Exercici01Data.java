package exercicis.tema02.part01;

import java.util.Scanner;

public class Exercici01Data {

	public static void main(String[] args) {

		// variables per a les dades de la data
		byte variableDiaSetmana; // de l'1 al 7 (dilluns a diumenge)
		byte variableDiaMes; // de l'1 al 31
		byte variableMes; // de l'1 al 12 (gener a desembre)
		// Teclat
		Scanner entrada = new Scanner(System.in);

		System.out.println("Introdueix un valor per al dia de la setmana entre 1 i 7:");
		if (entrada.hasNextByte()) {
			variableDiaSetmana = entrada.nextByte();
			if ((variableDiaSetmana >= 1) && (variableDiaSetmana <= 7)) {
				// dia de la setmana correcte, demanem dia del mes
				System.out.println("Introdueix un valor per al dia del mes entre 1 i 31:");
				if (entrada.hasNextByte()) {
					variableDiaMes = entrada.nextByte();
					if ((variableDiaMes >= 1) && (variableDiaMes <= 31)) {
						// dia del mes correcte, demanem mes
						System.out.println("Introdueix un valor per al mes entre 1 i 12:");
						if (entrada.hasNextByte()) {
							variableMes = entrada.nextByte();
							if ((variableMes >= 1) && (variableMes <= 12)) {
								// mes correcte, mostrem valor de data per pantalla
								
								// creem variable de cadena i fiquem text inicial
								String cadenaData = "Data introduïda: ";
								// hem d'afegir el nom del dia, en funció de variableDiaSetmana
								switch (variableDiaSetmana) {
									case 1 : cadenaData+="dilluns, "; break;
									case 2 : cadenaData+="diamrts, "; break;
									case 3 : cadenaData+="dimecres, "; break;
									case 4 : cadenaData+="dijous, "; break;
									case 5 : cadenaData+="divendres, "; break;
									case 6 : cadenaData+="dissabte, "; break;
									case 7 : cadenaData+="diumenge, "; break;
								}
								
								// ara hem d'afegir el dia del mes
								cadenaData+=variableDiaMes+" ";
								// i finalment el nom del més
								switch (variableMes) {
									case 1 : cadenaData+=" de gener."; break;
									case 2 : cadenaData+=" de febrer."; break;
									case 3 : cadenaData+=" de març."; break;
									case 4 : cadenaData+=" d'abril."; break;
									case 5 : cadenaData+=" de maig."; break;
									case 6 : cadenaData+=" de juny."; break;
									case 7 : cadenaData+=" de juliol."; break;
									case 8 : cadenaData+=" d'agost."; break;
									case 9 : cadenaData+=" de setembre."; break;
									case 10 : cadenaData+=" d'octubre."; break;
									case 11 : cadenaData+=" de novembre."; break;
									case 12 : cadenaData+=" de desembre."; break;
								}
								
								System.out.println(cadenaData);
								
							} else {
								System.out.println("Ho sentim, el valor " + variableMes + " no està entre 1 i 12");
							}
						} else {
							System.out.println("Ho sentim, el que has introduït no és un valor vàlid.");
						}

					} else {
						System.out.println("Ho sentim, el valor " + variableDiaMes + " no està entre 1 i 31");
					}
				} else {
					System.out.println("Ho sentim, el que has introduït no és un valor vàlid.");
				}
			} else {
				System.out.println("Ho sentim, el valor " + variableDiaSetmana + " no està entre 1 i 7");
			}
		} else {
			System.out.println("Ho sentim, el que has introduït no és un valor vàlid.");
		}
	}

}

