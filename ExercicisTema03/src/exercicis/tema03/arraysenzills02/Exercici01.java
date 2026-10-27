package exercicis.tema03.arraysenzills02;

public class Exercici01 {
	
	public static final int NUMERO = 10;

	public static void main(String[] args) {
		int[] array = {2,4,6,1,7,9,2,0,4,0,4,7};
		int comptador =0;
		
		//mostrem l'array
		System.out.print("L'array: ");
		for(int i=0;i<array.length;i++) {
			if(i==0) {
				System.out.print("["+array[i]+", ");
			}else if(i==array.length-1) {
				System.out.println(array[i]+"]");
			}else {
				System.out.print(array[i]+", ");
			}
		}
		//busquem a l'array
		System.out.println("Número a cercar: "+NUMERO);
		for(int i=0;i<array.length;i++) {
			if(array[i]==NUMERO) {
				comptador++;
				System.out.println("Número "+NUMERO+", posició: "+i);
			}
		}
		if(comptador==0) {
			System.out.println("No hi ha número "+NUMERO+" en l'array");
		}else {
			System.out.println("Hi ha "+comptador+" números "+NUMERO+" en l'array");
		}
		

	}

}
