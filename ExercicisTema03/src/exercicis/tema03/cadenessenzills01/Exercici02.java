package exercicis.tema03.cadenessenzills01;

public class Exercici02 {

	public static void main(String[] args) {
		String cadena01 = "avatar";
		String cadena02 = "tempesta";
		
		String cadena01mesclada ="";
		String cadena02mesclada="";
		
		cadena01mesclada= cadena01.substring(0,2)+
						  cadena02.substring(2,cadena02.length()-2).toUpperCase()+
						  cadena01.substring(cadena01.length()-2);
		cadena02mesclada= cadena02.substring(0,2)+
				  cadena01.substring(2,cadena01.length()-2).toUpperCase()+
				  cadena02.substring(cadena02.length()-2);
		
		
		//mostrem resultat
		
		System.out.println("Cadenes originals:");
		System.out.println("cadena 01: "+cadena01);
		System.out.println("cadena 02: "+cadena02);
	
		
		System.out.println("Cadenes mesclades:");
		System.out.println("cadena mesclada 01: "+cadena01mesclada);
		System.out.println("cadena mesclada 02: "+cadena02mesclada);

	}

}
