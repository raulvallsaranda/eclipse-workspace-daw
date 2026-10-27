package exercicis.tema03.arraysenzills02;

public class Exercici02 {

	public static void main(String[] args) {
		int[] array = {1,2,3,4,5,6,7,8,9,10,11,12};
		System.out.print("L'array original:");
		for(int i = 0;i<array.length;i++) {
			if(i==array.length-1) {
				System.out.println(array[i]+"]");
			}else if(i==0) {
				System.out.print("["+array[i]+", ");
			}else {
				System.out.print(array[i]+", ");
			}			
		}
		
		System.out.print("L'array invertit:");
		for(int i = array.length-1;i>=0;i--) {
			if(i==array.length-1) {
				System.out.print("["+array[i]+", ");
			}else if(i==0) {
				System.out.println(array[i]+"]");
			}else {
				System.out.print(array[i]+", ");
			}			
		}
	}

}
