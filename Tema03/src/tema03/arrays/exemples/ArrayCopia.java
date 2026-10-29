package tema03.arrays.exemples;

public class ArrayCopia {

	public static void main(String[] args) {
		int[] enters = {45, 3, 74, -34, 12, 20, 66, 43, -101};
		int[] enters2 = new int[enters.length];
		
		//enters2 = enters;
		for(int i=0;i<enters2.length;i++) {
			enters2[i]=enters[i];
		}
		
		for(int i=0;i<enters2.length;i++) {
			System.out.print(enters2[i]+" ");
		}
		System.out.println();
		System.out.println("enters: "+enters);
		System.out.println("enters2: "+enters2);
		

	}

}
