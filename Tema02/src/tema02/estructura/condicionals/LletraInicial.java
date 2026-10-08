package tema02.estructura.condicionals;

import java.util.Scanner;

public class LletraInicial {

	public static void main(String[] args) {
		

		Scanner entrada = new Scanner(System.in);
		String nom = "";
		String nomUsuari ="";
		boolean nomCorrecte = false;
		String vocalsAccents = "àáäèéëìíïòóöùúü";
		
		
		do {
			//demanem nom a l'usuari
			System.out.println("Escriu el teu nom");
			nomUsuari = entrada.nextLine().trim();
			nom = nomUsuari.toLowerCase();
			
			
			//comprovacions
			if(nom.isBlank()) {
				System.out.println("El nom no pot estar en blanc");
			} else if(nom.charAt(0)>='a' &&  nom.charAt(0)<='f') {
				System.out.println("Està entre a i f");
				nomCorrecte = true;
			}else if(nom.charAt(0)>='g' && nom.charAt(0)<='p') {
				nomCorrecte = true;
				System.out.println("Està entre g i p");
			}else if(nom.charAt(0)>='q' &&	nom.charAt(0)<='z') {
				nomCorrecte = true;
				System.out.println("Està entre q i z");
			}else if(vocalsAccents.contains(""+nom.charAt(0))) {
				nomCorrecte = true;
				System.out.println("És una vocal amb accent o dièresi");
			} else {
				System.out.println("La paraula no comença per cap lletra");
			}
			
			
		}while(!nomCorrecte);
		

	}

}
