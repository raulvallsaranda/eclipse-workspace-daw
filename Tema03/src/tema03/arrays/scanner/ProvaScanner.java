package tema03.arrays.scanner;

import java.util.Scanner;

public class ProvaScanner {

	public static void main(String[] args) {
		
		
		Scanner entrada = new Scanner(System.in);
		
		int num1 = 0, num2 = 0; 
		double num3 = 0.0;
		
		System.out.println("Introdueix un enter");
		
		num1 = entrada.nextInt();
		//entrada.nextLine();
		
		System.out.println("num1: "+num1);
		
		System.out.println("Introdueix un enter");
		
		num2 = entrada.nextInt();
		System.out.println("num2: "+num2);
		
		System.out.println("Introdueix un double");
		
		num3 = entrada.nextDouble();
		System.out.println("num3: "+num3);
		

		entrada.close();
	}

}
