package exercicis.tema02.part02;


import java.util.Scanner;

public class Exercici07IP {

	// constants
	public static final int LIMIT_INFERIOR = 0;
	public static final int LIMIT_SUPERIOR = 255;

	public static void main(String[] args) {

		// declaració i inicialització de variables
		Scanner entrada = new Scanner(System.in);
		int part01IP = 0;
		int part02IP = 0;
		int part03IP = 0;
		int part04IP = 0;
		boolean valorIPCorrecte = false;

		// demanem la primera part de l'adreça IP
		do {
			System.out.println("Introdueix la primera part de l'adreça IP, entre " + LIMIT_INFERIOR + " i "
					+ LIMIT_SUPERIOR + ":");
			if (entrada.hasNextInt()) {
				// obtenim la primera part
				part01IP = entrada.nextInt();
				entrada.nextLine(); // netegem el buffer
				// comprovem que és un valor vàlid
				if ((part01IP >= LIMIT_INFERIOR) && (part01IP <= LIMIT_SUPERIOR)) {
					valorIPCorrecte = true; // per eixir del bucle
				}
			} else {
				while (entrada.nextLine().equals("")) {
				}
				System.out.println("Entrada incorrecta");
			}
		} while (!valorIPCorrecte);

		// reiniciem el valor del booleà per demanar el següent valor
		valorIPCorrecte = false;

		// demanem la segona part de l'adreça IP
		do {
			System.out.println(
					"Introdueix la segona part de l'adreça IP, entre " + LIMIT_INFERIOR + " i " + LIMIT_SUPERIOR + ":");
			if (entrada.hasNextInt()) {
				// obtenim la primera part
				part02IP = entrada.nextInt();
				entrada.nextLine(); // netegem el buffer
				// comprovem que és un valor vàlid
				if ((part02IP >= LIMIT_INFERIOR) && (part02IP <= LIMIT_SUPERIOR)) {
					valorIPCorrecte = true; // per eixir del bucle
				}
			} else {
				while (entrada.nextLine().equals("")) {
				}
				System.out.println("Entrada incorrecta");
			}
		} while (!valorIPCorrecte);

		// reiniciem el valor del booleà per demanar el següent valor
		valorIPCorrecte = false;

		// demanem la tercera part de l'adreça IP
		do {
			System.out.println(
					"Introdueix la tercera part de l'adreça IP, entre " + LIMIT_INFERIOR + " i " + LIMIT_SUPERIOR + ":");
			if (entrada.hasNextInt()) {
				// obtenim la primera part
				part03IP = entrada.nextInt();
				entrada.nextLine(); // netegem el buffer
				// comprovem que és un valor vàlid
				if ((part03IP >= LIMIT_INFERIOR) && (part03IP <= LIMIT_SUPERIOR)) {
					valorIPCorrecte = true; // per eixir del bucle
				}
			} else {
				while (entrada.nextLine().equals("")) {
				}
				System.out.println("Entrada incorrecta");
			}
		} while (!valorIPCorrecte);

		// reiniciem el valor del booleà per demanar el següent valor
		valorIPCorrecte = false;

		// demanem la tercera part de l'adreça IP
		do {
			System.out.println(
					"Introdueix la quarta part de l'adreça IP, entre " + LIMIT_INFERIOR + " i " + LIMIT_SUPERIOR + ":");
			if (entrada.hasNextInt()) {
				// obtenim la primera part
				part04IP = entrada.nextInt();
				entrada.nextLine(); // netegem el buffer
				// comprovem que és un valor vàlid
				if ((part04IP >= LIMIT_INFERIOR) && (part04IP <= LIMIT_SUPERIOR)) {
					valorIPCorrecte = true; // per eixir del bucle
				}
			} else {
				while (entrada.nextLine().equals("")) {
				}
				System.out.println("Entrada incorrecta");
			}
		} while (!valorIPCorrecte);

		// reiniciem el valor del booleà per demanar el següent valor
		valorIPCorrecte = false;
		
		//ja tenim l'adreça IP completa, la fiquem per pantalla
		System.out.println("Adreça IP: "+part01IP+"."+part02IP+"."+part03IP+"."+part04IP);
		//ara hem de decidir
		//si és privada
		//de quina classe és
		if(part01IP==10) {
			System.out.println("L'adreça és privada de classe A, amb màscara 255.0.0.0");
		}else if((part01IP==172)&&(part02IP>=16)&&(part02IP<=31)){
			System.out.println("L'adreça és privada de classe B, amb màscara 255.255.0.0");
		} else if((part01IP==192)&&(part02IP==168)) {
			System.out.println("L'adreça és privada de classe C, amb màscara 255.255.255.0");
		} else {
			//System.out.println("No és una adreça privada");
			if(part01IP>=1 && part01IP<=126) {
				System.out.println("L'adreça és pública de classe A, amb màscara 255.0.0.0");
			}else if((part01IP>=128)&&(part01IP<=191)){
				System.out.println("L'adreça és pública de classe B, amb màscara 255.255.0.0");
			}else if((part01IP>=192)&&(part01IP<=223)) {
				System.out.println("L'adreça és pública de classe C, amb màscara 255.0.0.0");
			} else {
				System.out.println("No és una adreça de classe A, B o C");
			}
		}
		

	}

}
