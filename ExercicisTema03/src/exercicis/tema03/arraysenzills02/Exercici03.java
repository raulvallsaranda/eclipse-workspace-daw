package exercicis.tema03.arraysenzills02;

public class Exercici03 {

	public static void main(String[] args) {
		//variables
		//char[] array = {'a','b','c','d','e','f','g','h','i','j'};
		char[] array = {'z','x','y','r','w','s','t','m','o','q'};
		String cadena = "";
		
		//mostrem array
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
		//creem una cadena a partir de l'array concatenant amb :
		//al final no en té
		for(int i = 0;i<array.length;i++) {
			if(i==array.length-1) {
				cadena+=array[i];
			}else {
				cadena+=array[i]+":";
			}
		}
		
		//mostrem la cadena:
		System.out.println("La cadena: "+cadena);

	}

}
