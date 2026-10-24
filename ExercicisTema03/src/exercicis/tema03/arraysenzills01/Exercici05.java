package exercicis.tema03.arraysenzills01;

public class Exercici05 {
	
	//constants
	public static final int LONGITUD_ARRAY = 100;
	public static final int LONGITUD_FILA = 10;
	public static final char CHAR_01 = '-';
	public static final char CHAR_02 = '*';
	
	public static void main(String[] args) {
		//declaració de variables
		char[] arrayChar = new char[LONGITUD_ARRAY];
		
		//inicialització
		for(int i = 0; i<arrayChar.length;i++) {
			if(i%11==0 || i%10==0 || i%10 == 9) {
				arrayChar[i]=CHAR_02;
			}else {
				arrayChar[i]=CHAR_01;
			}
		}
		
		//mostrem les columnes
		for(int i=0;i<LONGITUD_FILA;i++) {
			if(i==LONGITUD_FILA-1) {
				System.out.println(i);
			}else {
				System.out.print(i+" ");
			}				
		}
		
		//mostrem l'array en files de 10
		for(int i=0;i<arrayChar.length;i++) {
			if(i%LONGITUD_FILA==9) {
				System.out.println(arrayChar[i]);
			} else {
				System.out.print(arrayChar[i]+" ");
			}
		}
		

	}

}
