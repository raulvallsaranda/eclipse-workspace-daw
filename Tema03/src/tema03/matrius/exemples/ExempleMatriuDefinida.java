package tema03.matrius.exemples;

public class ExempleMatriuDefinida {

	public static void main(String[] args) {

		int[] array = { 1, 2, 3, 4, 5 };
		int[][] matriu2 = new int[6][6];
		int[][] matriu3 = new int[5][2];
		int[][] matriu4 = {
						   {1,2,3},
						   {4},
						   {7,8}
						  };
		int[][][] matriu5 = {
							 {
								 {1,2,3},
								 {4,5,6},
							 },
							 {
								 {7,8,9},
								 {10,11,12},
							 }
							};
		
		int[][] matriu = new int[5][];
		
		//fila 0
		matriu[0] = new int[5];
		//fila 1
		matriu[1] = new int[10];
		//fila 2
		matriu[2] = new int[10];
		//fila 3
		matriu[3] = new int[6];
		//fila 4
		matriu[4] = new int[7];

		
		/*for (int i = 0; i < matriu.length; i++) { // recórrer files
			for (int j = 0; j < matriu[i].length; j++) { // recórrer columnes
				System.out.print(matriu[i][j] + "\t");
			}
			System.out.println();
		}*/
		for (int i = 0; i < matriu5.length; i++) { // recórrer files
			for (int j = 0; j < matriu5[i].length; j++) { // recórrer columnes
				for (int k = 0; k < matriu5[i][j].length; k++) {
					System.out.print(matriu5[i][j][k] + "\t");
				}
				System.out.println();
			}
			System.out.println();
		}
		System.out.println();
	}

}
