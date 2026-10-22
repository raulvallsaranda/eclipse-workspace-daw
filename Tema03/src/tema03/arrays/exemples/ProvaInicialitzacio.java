package tema03.arrays.exemples;

import java.lang.reflect.Array;

public class ProvaInicialitzacio {
	
	private static final int LONGITUD = 15;

	public static void main(String[] args) {
		
		//declarar array (15 posicions)
		int n = 1;
		int[] array =  new int[LONGITUD];		
		
		//emplenar array amb potències de 2
		
		//manera 1
		/*for (int i = 0; i<array.length; i++) {
			array[i]=(int) Math.pow(2, i);
		}*/	
		
		//manera 2
		/*for (int i=0;i<array.length;i++) {
			array[i]=n;
			n=n*2;			
		}*/
		array[0] = 1;
		for(int i=1; i<array.length;i++) {
			array[i]=array[i-1]*2;			
		}
		
		//mostrar array
		System.out.print("[");
		for (int i=0; i<array.length; i++) {
			if(i==array.length-1) {
				System.out.print(array[i]);
			} else {
				System.out.print(array[i]+", ");
			}
		}
		System.out.print("]");

	}

}
