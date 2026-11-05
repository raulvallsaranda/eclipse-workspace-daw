package tema03.cadenes.exemples;

import java.util.Scanner;

public class Exemple05ParaulesFrase {

	public static void main(String[] args) {
		
		String frase ="";
		boolean entradaValida = false;
		Scanner entrada = new Scanner(System.in);
		Scanner fraseUsuari;
		String[] cadenes;
		int comptador = 0;
		
		do {
			System.out.println("Escriu una frase:");
			frase = entrada.nextLine().trim();
			if(frase.isBlank()) {
				System.out.println("Error: no pot estar buida");
			} else  {
				entradaValida=true;
			}			
		}while(!entradaValida);
		
		//manera 1
		fraseUsuari = new Scanner(frase);
		while(fraseUsuari.hasNext()) {
			fraseUsuari.next();
			comptador++;
		}		
		
		System.out.println("Frase: "+frase);
		System.out.println("Mètode 1:");
		System.out.println("Quantitat de paraules: "+comptador);
		fraseUsuari.close();
		
		//manera 2
		//caràcters espai/ tabulador
		comptador=1;
		for(int i=0;i<frase.length()-1;i++) {
			if(frase.charAt(i)==' ' && ((frase.charAt(i+1)!=' ') && (frase.charAt(i+1)!='\t'))) {
				comptador++;
			} else if(frase.charAt(i) =='\t' && ((frase.charAt(i+1)!='\t') && (frase.charAt(i+1)!=' '))){
				comptador++;
			}			
		}
		
		System.out.println("Mètode 2:");
		System.out.println("Quantitat de paraules: "+comptador);
		
		//manera 3
		frase= frase.replaceAll("[\\s\\t]+","\s");
		cadenes = frase.split("[\\s\\t]");
		System.out.println("Mètode 3:");
		System.out.println("Quantitat de paraules: "+cadenes.length);
		
		entrada.close();

	}

}
