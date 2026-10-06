package tema02.estructura.bucles;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		
		//declaració de variable
		Scanner entrada = new Scanner(System.in);
		long factorial = 1L; //valor neutre de la multiplicació
		int valorUsuari = 0;
		int i = 1;
		
		//demanem a l'usuari
		System.out.println("Introdueix el valor del factorial que vols calcular (enter positiu)");
		//comprovem si a l'entrada tenim un enter
		if(entrada.hasNextInt()) {
			//obtenim el valor
			valorUsuari = entrada.nextInt();
			entrada.nextLine(); //netegem el buffer
			//comprovem si és un enter positiu
			if(valorUsuari >=1) {
				//calculem el factorial
				while(i<=valorUsuari) {
					//acumule el valor del factorial
					factorial=factorial*i;
					//incremente el valor del comptador
					i++;
				}
				System.out.println("El valor del factorial de "+valorUsuari+" és "+factorial);
				
			} else {
				System.out.println("Error: el valor ha de ser major o igual que 1");
			}
			
		} else {
			System.out.println("Error: l'entrada no és un enter");
		}
			

	}

}
