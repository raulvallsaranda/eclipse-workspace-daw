package tema03.arrays.exemples;

import java.util.Random;

public class ProvaArraysForEach {
	
	private static final int LONGITUD_ARRAY = 5;
	
	private static final int VALOR_MAXIM = 100;

	public static void main(String[] args) {
		Random aleatori = new Random();
		
		//declaració
		int[] array1;
		

		//inicialització
		array1 = new int[LONGITUD_ARRAY];
		
		for(int i =0; i<array1.length;i++) {
			array1[i]=aleatori.nextInt(VALOR_MAXIM+1);
		}
		
		
		
		//recorregut
		
		for(int i =0; i<array1.length;i++) {
			System.out.println("array1["+i+"]: "+array1[i]);
		}
		
		//foreach
		int i = 0;
		for(int valor :  array1) {
			System.out.println("array1["+i+"]: "+valor);
			i++;
		}
		
		
		

	}

}
