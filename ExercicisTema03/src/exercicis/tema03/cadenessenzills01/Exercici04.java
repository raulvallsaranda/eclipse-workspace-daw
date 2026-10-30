package exercicis.tema03.cadenessenzills01;

public class Exercici04 {

	public static void main(String[] args) {
		String cadenaNumeros ="";
		String cadenaLletres ="";
		String cadenaAltres ="";
		String cadena ="r0h4�k+/�4lt023<*";
		for(int i = 0; i<cadena.length();i++) {
			if("0123456780".contains(""+cadena.charAt(i))) {
				cadenaNumeros+=cadena.charAt(i);
			}else if("a���������������bcdefghijklmnopqrstuvwxyz".contains((""+cadena.charAt(i)).toLowerCase())){
				cadenaLletres+=cadena.charAt(i);
			}else {
				cadenaAltres+=cadena.charAt(i);
			}
		}
		System.out.println("Cadena inicial: "+cadena);
		cadena = cadenaNumeros+cadenaLletres+cadenaAltres;
		System.out.println("Cadena final: "+cadena);

	}
}
