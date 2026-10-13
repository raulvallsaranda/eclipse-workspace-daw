package tema03.arrays.exemples;

public class ProvaArrays {

	public static void main(String[] args) {

		// declaració + inicialització
		int valor = 0;
		// posició       0  1  2  3  4  5  6
		int[] valors = { 1, 2, 3, 4, 5, 6 ,7 };
		
		double[] valorsDecimals = new double[5];
		
		String[] valorsCadena = new String[5];
		valorsCadena[3]="Tots a casa";
		
		boolean[] valorsBoolean = new boolean[6];
		
		int[] valors2 = new int[5];
		

		// modificació
		valor = 5;
		valors[2] = 10;
		valorsDecimals[3]=5.0;
		
		// mostrar
		System.out.println("Valor: " + valor);
		//recórrer un array per veure el contingut
		for(int i = 0 ; i<valors.length ; i++) {
			System.out.print(valors[i]+" ");
			
		}
		System.out.println("");
		for(int i = 0 ; i<valors2.length ; i++) {
			System.out.print(valors2[i]+" ");
			
		}
		System.out.println("");
		for(int i = 0 ; i<valorsCadena.length ; i++) {
			System.out.print(valorsCadena[i]+" ");
			
		}
		System.out.println("");
		for(int i = 0 ; i<valorsDecimals.length ; i++) {
			System.out.print(valorsDecimals[i]+" ");
			
		}
		System.out.println("");
		for(int i = 0 ; i<valorsBoolean.length ; i++) {
			System.out.print(valorsBoolean[i]+" ");
			
		}
		System.out.println("");
		
		System.out.println("Valors: " + valors);


	}

}
