package exercicis.tema02.buclessenzills;

public class Exercici11QuadratsMultiples10 {
	
	//constants
	private static final int VALOR_LIMIT = 100;
	private static final int VALOR_INICIAL = 10;
	private static final int MULTIPLE  = 10;

	public static void main(String[] args) {
		System.out.println("Múltiples de "+MULTIPLE+" entre "+VALOR_INICIAL+" i "+VALOR_LIMIT+":");
		System.out.println("----------------------------------");
		for(int i=VALOR_INICIAL;i<=VALOR_LIMIT;i+=MULTIPLE) {
			System.out.println("Valor múltiple: "+i+", Quadrat: "+(i*i));
		}

	}

}
