package exercicis.tema03.cadenessenzills01;

public class Exercici03 {

	public static void main(String[] args) {
		String cadena="RemuGAR";
		String cadenaaux="";
		String cadenaaux2="";
		cadenaaux= cadena.replaceFirst(cadena.substring(0,2),cadena.substring(cadena.length()-2));
		cadenaaux=cadenaaux.repeat(3);
		for(int i=0;i<cadenaaux.length();i++) {
			cadenaaux2+=(""+cadenaaux.charAt(i)).toUpperCase()+(""+cadenaaux.charAt(i)).toLowerCase();
		}
		
		System.out.println("Cadena inicial: "+cadena);
		System.out.println("Resultat final: "+cadenaaux2);

	}

}
