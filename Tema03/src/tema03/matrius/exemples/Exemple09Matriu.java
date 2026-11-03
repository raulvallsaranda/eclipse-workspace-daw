package tema03.matrius.exemples;

public class Exemple09Matriu {
	
	private static final int N = 5;
	private static final int M = 10;

	public static void main(String[] args) {
		
		//declaració
		int[][] matriu = new int[N][M];
		
		
		//inicialització: bucle i j
		for (int i = 0; i < matriu.length; i++) { // recórrer files
			for (int j = 0; j < matriu[i].length; j++) { // recórrer columnes
				matriu[i][j]=1;
			}
		}
		
		//mostrar: bucle i j
		for (int i = 0; i < matriu.length; i++) { // recórrer files
			for (int j = 0; j < matriu[i].length; j++) { // recórrer columnes
				System.out.print(matriu[i][j] + "\t");
			}
			System.out.println();
		}
		
		
		

	}

}
