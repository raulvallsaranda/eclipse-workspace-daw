package tema03.arrays.exemples;

public class ProvaSuma {

	public static void main(String[] args) {

		//declaració / inicialització
		int[] array1 = { 1,  2,  3,  4,  5,  6 };
		int[] array2 = { 10, 20, 30, 40, 50, 60 };
		int[] array3 = new int[array1.length];

		//mostrar en pantalla
		System.out.println("Array1:");
		System.out.println(array1);

		for (int i = 0; i < array1.length; i++) {
			System.out.print(array1[i] + " ");
		}
		System.out.println("\nArray2:");

		System.out.println(array2);

		for (int i = 0; i < array2.length; i++) {
			System.out.print(array2[i] + " ");
		}
		
		//array3 = array1 + array2
		//array3 = array1 + array2;
		
		//sumem element a element array1 i array2
		// i ho fiquem en array3
		for(int i=0;i<array3.length;i++) {
			array3[i]=array1[i]+array2[i];
		}
		
		//mostrem el resultat de la suma d'arrays
		System.out.println("\nArray3:");

		System.out.println(array3);

		for (int i = 0; i < array3.length; i++) {
			System.out.print(array3[i] + " ");
		}
		
		
		

	}

}
