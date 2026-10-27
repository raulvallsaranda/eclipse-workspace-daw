package exercicis.tema03.arraysenzills02;

public class Exercici08 {
	
	public static final int N = 8;

	public static void main(String[] args) {
		//declarem variable
		char[][] matriu = new char[N][N];
		for(int i=0;i<matriu.length;i++) {
			for(int j=0;j<matriu[i].length;j++) {
				if(i==0 || i==matriu.length-1) {
					matriu[i][j]='*';
				}else if(j==0 || j==matriu[i].length-1) {
					matriu[i][j]='*';
				}else {
					matriu[i][j]='-';
				}
			}
		}
		
		//mostrem
		for(int i=0;i<matriu.length;i++) {
			for(int j=0;j<matriu[i].length;j++) {
				System.out.print(matriu[i][j]);
			}
			System.out.println();
		}
		

	}

}
