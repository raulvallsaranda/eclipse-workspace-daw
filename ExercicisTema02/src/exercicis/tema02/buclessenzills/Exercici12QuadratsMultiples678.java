package exercicis.tema02.buclessenzills;

public class Exercici12QuadratsMultiples678 {
	
	//constants
	private static final int VALOR_LIMIT = 100;
	private static final int VALOR_INICIAL_6 = 6;
	private static final int VALOR_INICIAL_7 = 7;
	private static final int VALOR_INICIAL_8 = 8;
	private static final int MULTIPLE_6  = 6;
	private static final int MULTIPLE_7  = 7;
	private static final int MULTIPLE_8  = 8;

	public static void main(String[] args) {
		System.out.println("Múltiples de "+MULTIPLE_6+" entre "+VALOR_INICIAL_6+" i "+VALOR_LIMIT+":");
		System.out.println("----------------------------------");
		for(int i=VALOR_INICIAL_6;i<=VALOR_LIMIT;i+=MULTIPLE_6) {
			System.out.println("Valor múltiple: "+i+", Quadrat: "+(i*i));
		}
		
		System.out.println("Múltiples de "+MULTIPLE_7+" entre "+VALOR_INICIAL_7+" i "+VALOR_LIMIT+":");
		System.out.println("----------------------------------");
		for(int i=VALOR_INICIAL_7;i<=VALOR_LIMIT;i+=MULTIPLE_7) {
			System.out.println("Valor múltiple: "+i+", Quadrat: "+(i*i));
		}
		
		System.out.println("Múltiples de "+MULTIPLE_8+" entre "+VALOR_INICIAL_8+" i "+VALOR_LIMIT+":");
		System.out.println("----------------------------------");
		for(int i=VALOR_INICIAL_8;i<=VALOR_LIMIT;i+=MULTIPLE_8) {
			System.out.println("Valor múltiple: "+i+", Quadrat: "+(i*i));
		}

	}

}
