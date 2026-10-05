package exercicis.tema02.buclessenzills;

public class Exercici10Lletres {
	
	//constants
	private static final String ALFABET = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

	public static void main(String[] args) {
		
		System.out.print("Alfabet:");
		for(int i = 0;i<ALFABET.length();i++) {
			System.out.print(" "+ALFABET.charAt(i));
		}


	}

}
