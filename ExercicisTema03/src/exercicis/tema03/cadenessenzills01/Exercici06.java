package exercicis.tema03.cadenessenzills01;

public class Exercici06 {

	public static void main(String[] args) {
		
		//String cadena ="arrabassar";
		//String cadena ="+-*+-+*--+";
		String cadena ="1201.215831";
		String cadenaaux ="";
		for(int i=0;i<cadena.length();i++) {
			if(cadena.charAt(i)==cadena.charAt(0)) {
				cadenaaux+="["+cadena.charAt(i)+"]";
			}else {
				cadenaaux+=cadena.charAt(i);
			}
		}
		System.out.println("Cadena inicial: " + cadena);
		System.out.println("Cadena modificada: " + cadenaaux);
	}

}
