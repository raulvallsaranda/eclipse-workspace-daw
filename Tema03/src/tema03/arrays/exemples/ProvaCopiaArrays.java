package tema03.arrays.exemples;

public class ProvaCopiaArrays {

	public static void main(String[] args) {
		
		int[] array1 = {1,2,3};
		
		int[] array2 = {3,4,5};
		
		System.out.println("Array 1");
		for(int i =0;i<array1.length;i++) {
			System.out.print(array1[i]+" ");
		}
		//còpia?
		array2 = array1;
		System.out.println();
		System.out.println("Array 2");
		for(int i =0;i<array2.length;i++) {
			System.out.print(array2[i]+" ");
		}
		
		array1[0]=10;
		System.out.println();
		System.out.println("Array 1");
		for(int i =0;i<array1.length;i++) {
			System.out.print(array1[i]+" ");
		}
		
		System.out.println();
		System.out.println("Array 2");
		for(int i =0;i<array2.length;i++) {
			System.out.print(array2[i]+" ");
		}
		

	}

}
