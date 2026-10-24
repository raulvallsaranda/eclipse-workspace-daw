package exercicis.tema03.arraysenzills01;

import java.util.Scanner;

public class Exercici06 {
	
	//constants
	public static final int LONGITUD_ARRAY = 7;
	public static final int MINIM = 1;
	public static final int MAXIM = 9;

	public static void main(String[] args) {
		//declaració de variables
		double[] arrayDouble = new  double[LONGITUD_ARRAY];
		boolean entradaValida = false;
		int numeroUsuari = 0;
		Scanner entrada= new Scanner(System.in);
		
		//demanem a l'usuari
		do {
			System.out.println("Introdueix un enter entre "+MINIM+ " i "+MAXIM+":");
			if (entrada.hasNextInt()) {
				numeroUsuari = entrada.nextInt();
				entrada.nextLine();
				if(numeroUsuari>=MINIM && numeroUsuari <=MAXIM) {
					entradaValida = true;
				}else {
					System.out.println("El valor ha d'estar entre "+MINIM+" i "+MAXIM+".");
				}
			}else {
				while(entrada.nextLine().equals("")) {}
				System.out.println("L'entrada no és correcta");
			}
		}while(!entradaValida);
		
		//el valor de l'usuari
		System.out.println("El valor introduït: "+numeroUsuari);
		
		//generem els valors i els introduïem a l'array
		for( int i=0;i<arrayDouble.length;i++) {
				arrayDouble[i]=numeroUsuari*Math.pow(10, i)+numeroUsuari*Math.pow(10, -(i+1));			
		}
		//mostrem l'array
		for(int i=0; i<arrayDouble.length;i++) {
			System.out.println(arrayDouble[i]);
			//System.out.println(String.format("%."+(i+1)+"f",arrayDouble[i]));
		}
		//tanquem scanner
		entrada.close();

	}

}
