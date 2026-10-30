package exercicis.tema03.cadenessenzills01;

public class Exercici01 {

	public static void main(String[] args) {
		String cadena ="Sargantana";
		
		System.out.println("Cadena original: "+cadena);
		System.out.print("Cadena invertida: ");
		for(int i=cadena.length()-1;i>=0;i--) {
			System.out.print(cadena.charAt(i));
		}

	}

}
