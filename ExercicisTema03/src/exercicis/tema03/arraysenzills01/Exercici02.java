package exercicis.tema03.arraysenzills01;

import java.util.Random;

public class Exercici02 {
	public static final int NOMS_TRIATS = 3;
	public static final int FRASES_ALEATÒRIES = 4;
	
	

	public static void main(String[] args) {
		//declaració de variables
		String[] noms = {"Jordi", "Robert", "Salva", "Anna", "Marta", "Rubén", "Rebeca", "Patrícia", "Àlex","Dària"};
		String[] nomsTriats = new String[NOMS_TRIATS];
		String[] frases = {"fan bicicleta per la Cova Negra.",
						   "se'n van a un concert de Zoo.",
						   "dinen a un restaurant indi.",
						   "implementen un programa en java amb arrays."
						   };
		Random aleatori = new Random();
		int fraseAleatoria = 0;
		String fraseCompleta = "";
		
		//triem els noms aleatòriament
		for(int  i = 0;i<NOMS_TRIATS;i++) {
			nomsTriats[i] = noms[aleatori.nextInt(0,noms.length)];
		}
		
		System.out.print("Les persones: ");
		for (int i=0;i<noms.length;i++) {
			if (i==noms.length-1) {
				System.out.println(noms[i]+"]");
			}else if(i==0) {
				System.out.print("["+noms[i]+", ");
			} else {
				System.out.print(noms[i]+", ");
			}
		}
		//Mostrem la frase:
		//primer juntem els noms
		for (int i =0;i<nomsTriats.length;i++) {
			if (i==nomsTriats.length-1) {
				fraseCompleta += "i "+nomsTriats[i]+" ";
			}else if(i==0) {
				fraseCompleta += nomsTriats[i]+", ";
			} else {
				fraseCompleta += nomsTriats[i]+" ";
			}
		}
		
		//triem frase aleatòria
		fraseAleatoria= aleatori.nextInt(0,frases.length);
		
		//unim les 2 cadenes
		fraseCompleta += frases[fraseAleatoria];
		
		//Mostrem per pantalla
		System.out.print("La frase: ");
		System.out.println(fraseCompleta);

	}

}
