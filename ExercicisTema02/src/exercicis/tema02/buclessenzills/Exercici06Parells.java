package exercicis.tema02.buclessenzills;

public class Exercici06Parells {
	
	//constants
	private static final int LIMIT_INFERIOR = 0;
	private static final int LIMIT_SUPERIOR = 50;

	public static void main(String[] args) {
		System.out.println("Nombres parells enter "+LIMIT_INFERIOR+" i "+LIMIT_SUPERIOR+":");
		for(int i = 0;i<=LIMIT_SUPERIOR;i+=2) {
			System.out.println(i);
		}

	}

}
