package exercicis.tema03.traces.repas;

public class Traces02Repas {

	public static void main(String[] args) {
		/********** Traça 1 ************/
		System.out.println("Traça 01:");
		System.out.println("---------");
		String cadena = "Sargantana";
		int[] array = new int[cadena.length()/2];
		for (int i = 0;i<=array.length/2;i++)array[i]=i;
		for (int i = 0;i<array.length;i++) array[array.length-i-1]=++array[i];
		for (int i = 0;i<array.length;i++) array[0]+=array[i];
		System.out.println(array[0]);
		System.out.println("");
		/************* Traça 2 **************/
		System.out.println("Traça 02:");

		int[] array2 = new int[4];
		for(int i=0;i<array2.length-1;i+=2) array2[i+1]=array2.length-i;
		for(int i = 0;i <array2.length-1;i++) 
		if(array2[i]>array2[i+1] || i==array2.length-2) array2[i]=array2[i+1];
		for(int i = 0;i<array2.length;i++) System.out.print(array2[i]);
		
		System.out.println();
		/************* Traça 3 **************/
		System.out.println("Traça 03:");
		System.out.println("---------");
		int[] array3 = {1,2,3,10,20,30};
		int m = array3[0];
		for(int i =0;i<array3.length-1;i+=2) {
			if(array3[i+1]%array3[i]!=0) array3[i]+=array3[i+1];
			if(m<array3[i]) m=array3[i];
		}
		System.out.print(m);
		System.out.println();
		/************* Traça 4 **************/
		System.out.println("Traça 04:");
		System.out.println("---------");
		int x = 4;
		char[][] mat = new char[x][x];
		
		for(int i=0;i<mat.length;i++) {
			for(int j = 0;j<mat[0].length;j++) {
				if (i==j) mat[i][j]='+';
				else if(j==mat[0].length-i-1) mat[i][j]='-';
				else mat[i][j]='*';
				System.out.print(mat[i][j]);
			}
			System.out.print("\n");
		}
		System.out.println();
		/************* Traça 5 **************/
		System.out.println("Traça 05:");
		System.out.println("---------");
		int[][] mat2 = {{5,0,8},{1,2,5},{8,6,3}};
		int aux = 0;
		for(int i=0;i<mat2.length;i++) {
			for (int j=0;j<mat2[0].length;j++) {
				//comparar amb tots i intercanviar si és major
				for(int k=0;k<mat2.length;k++) {
					for (int l=0;l<mat2[0].length;l++) {
						if(mat2[i][j]<mat2[k][l]) {
							//intercanviem
							aux = mat2[i][j];
							mat2[i][j]=mat2[k][l];
							mat2[k][l]=aux;
						}
					}
				}
			}
		}
		//en pantalla
		for (int i = 0;i<mat2.length;i++) {
			for(int j=0;j<mat2[0].length;j++) System.out.print(mat2[i][j]);			
			System.out.println();
		}
	}
}
